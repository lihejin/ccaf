package com.ccaf.service.impl;

import com.ccaf.dao.NotifyDao;
import com.ccaf.domain.NotifyDO;
import com.ccaf.domain.NotifyDTO;
import com.ccaf.service.NotifyService;
import com.ccaf.util.PageUtils;
import com.ccaf.util.ShiroUtils;
import com.ccaf.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.*;


@Service
public class NotifyServiceImpl implements NotifyService {
	@Autowired
	private NotifyDao notifyDao;

	@Override
	public NotifyDO get(Long id) {
		NotifyDO rDO = notifyDao.get(id);
		HashMap<String,Object> map=new HashMap<>();/*
		map.put("channel",rDO.getChannelType().split(",")[0]);
		map.put("notifyId",id);
		List<Map<String,String>> mapList=new ArrayList<>();
		List<NotifyRecordDO> list=recordDao.list(map);
		list.stream().forEach(notifyRecordDO -> {
			if("0".equals(rDO.getType())){
				BossDO bossDO=bossDao.get(notifyRecordDO.getUserId());
				Map<String,String> resMap=new HashMap<>();
				if(null != bossDO){
					resMap.put("id",bossDO.getId()+"");
					resMap.put("name",bossDO.getRealName());
				}
				mapList.add(resMap);
			}else {
				DesignerDO designerDO=designerDao.get(notifyRecordDO.getUserId());
				Map<String,String> resMap=new HashMap<>();
				if(null != designerDO){
					resMap.put("id",designerDO.getId()+"");
					resMap.put("name",designerDO.getRealName());
				}
				mapList.add(resMap);
			}
		});
		rDO.setSelectorPerson(mapList);
//		rDO.setType(dictService.getName("oa_notify_type", rDO.getType()));*/
		return rDO;
	}

	@Override
	public List<NotifyDO> list(Map<String, Object> map) {
		List<NotifyDO> notifys = notifyDao.list(map);
		for (NotifyDO notifyDO : notifys) {
//			notifyDO.setType(dictService.getName("oa_notify_type", notifyDO.getType()));
		}
		return notifys;
	}

	@Override
	public int count(Map<String, Object> map) {
		return notifyDao.count(map);
	}

	@Transactional
	@Override
	public int save(NotifyDO notify) {
		if(notify.getCreateUser()==null)
			notify.setCreateUser(Long.parseLong(UserUtil.getUserName()));
		if(notify.getUpdateUser()==null)
		notify.setUpdateUser(Long.parseLong(UserUtil.getUserName()));
		if(notify.getUpdateTime()==null)
			notify.setCreateTime(new Date());
		notify.setUpdateTime(new Date());
//	notify.setUpdateDate(new Date());
		int r = notifyDao.save(notify);
		// 保存到接受者列表中
		Map<String,Object> map = new HashMap<>();
		List<Long> listUserIds = new ArrayList<>();
//		if("0".equals(notify.getType())){
//            List<BossDO>  list1 = bossDao.list(map);
//
//            for(BossDO bossDO:list1){
//                listUserIds.add(bossDO.getId());
//            }
//		}else {
//            List<DesignerDO>  list2 = designerDao.list(map);
//            for(DesignerDO designerDO:list2){
//                listUserIds.add(designerDO.getId());
//            }
//		}
		if(!StringUtils.isEmpty(notify.getSelectors()))
			for(String selector:notify.getSelectors().split(",")){
				listUserIds.add(Long.parseLong(selector));
			}
		Long[] userIds = new Long[listUserIds.size()];
        userIds = listUserIds.toArray(userIds);
		Long notifyId = notify.getId();
//		List<NotifyRecordDO> records = new ArrayList<>();
//		for (Long userId : userIds) {
//			for(String channel:notify.getChannelType().split(",")){
//				NotifyRecordDO record = new NotifyRecordDO();
//				record.setNotifyId(notifyId);
//				record.setUserId(userId);
//				record.setIsRead(0);
//				record.setChannel(channel);
//				records.add(record);
//			}
//		}
//		recordDao.batchSave(records);
//		if("0".equals(notify.getStatus())){
//			auditSaveService.reviewAudit(notify.getId(),Constant.OA_AUDIT);
//
//
//		}


//		//给在线用户发送通知
//		ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,0, TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>());
//		executor.execute(new Runnable() {
//			@Override
//			public void run() {
//				for (UserDO userDO : sessionService.listOnlineUser()) {
//					for (Long userId : userIds) {
//						if (userId.equals(userDO.getUserId())) {
//							template.convertAndSendToUser(userDO.toString(), "/queue/notifications", "新消息：" + notify.getTitle());
//						}
//					}
//				}
//			}
//		});
//		executor.shutdown();
		return r;
	}

	@Override
	public int update(NotifyDO notify) {
		NotifyDO notifyDO=notifyDao.get(notify.getId());
		notify.setCreateUser(notifyDO.getCreateUser());
		notify.setCreateTime(notifyDO.getCreateTime());
		notify.setUpdateTime(new Date());
		notify.setUpdateUser(ShiroUtils.getUserId());
		remove(notify.getId());
		notify.setId(null);
		return save(notify);
	}

	public void updateStatus(boolean isSuccess,Long id){

		NotifyDO notifyDO1=new NotifyDO();
		notifyDO1.setId(id);
		notifyDO1.setStatus(isSuccess?"1":"2");
		notifyDao.update(notifyDO1);
		NotifyDO notifyDO=notifyDao.get(id);
		if(isSuccess&&(notifyDO.getChannelType().contains("0")||notifyDO.getChannelType().contains("2"))){
			HashMap<String,Object> map=new HashMap<>();
			map.put("channelType","0");
			map.put("notify_id",id);
			List<Long> users=new ArrayList<>();
//			recordDao.list(map).stream().forEach(vo->{
//				users.add(vo.getUserId());
//			});
			asycInfoWexin(users,notifyDO);
		}
	}

	private void asycInfoWexin(List<Long> userId,NotifyDO notify){
		Map<String,Object> map = new HashMap<>();
		map.put("users",userId);
		map.put("message",notify);
//		SendThread.addTask(map);
	}




	@Transactional
	@Override
	public int remove(Long id) {
//		recordDao.removeByNotifbyId(id);
		return notifyDao.remove(id);
	}

	@Transactional
	@Override
	public int batchRemove(Long[] ids) {
//		recordDao.batchRemoveByNotifbyId(ids);
		return notifyDao.batchRemove(ids);
	}


	@Override
	public PageUtils selfList(Map<String, Object> map) {
		List<NotifyDTO> rows = notifyDao.listDTO(map);
//		for (NotifyDTO notifyDTO : rows) {
//			notifyDTO.setBefore(DateUtils.getTimeBefore(notifyDTO.getUpdateDate()));
//			notifyDTO.setSender(userDao.get(notifyDTO.getCreateBy()).getName());
//		}
		PageUtils page = new PageUtils(rows, notifyDao.countDTO(map));
		return page;
	}

	@Override
	public NotifyDTO prjLatestNotify(Long projectId) {
		return notifyDao.prjLatestNotify(projectId);
	}

	@Override
	public NotifyDTO personLatestNotify() {
		String loginRole = UserUtil.getLoginRole();
		String type ="";
		//设计师
		if("1".equals(loginRole)||"4".equals(loginRole)||"5".equals(loginRole)){
			type = "1";
		}else if("3".equals(loginRole)){//客户
			type = "0";
		}else if("2".equals(loginRole)){
			type = "2";
		}

		return notifyDao.personLatestNotify(type,ShiroUtils.getUserId());
	}
}
