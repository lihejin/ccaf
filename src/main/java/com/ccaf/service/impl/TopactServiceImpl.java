package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ccaf.dao.TopactDao;
import com.ccaf.domain.TopactDO;
import com.ccaf.service.TopactService;



@Service
public class TopactServiceImpl implements TopactService {
	@Autowired
	private TopactDao topactDao;
	
	@Override
	public TopactDO get(String actIdnSky){
		return topactDao.get(actIdnSky);
	}
	
	@Override
	public List<TopactDO> list(Map<String, Object> map){
		return topactDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return topactDao.count(map);
	}
	
	@Override
	public int save(TopactDO topact){
		return topactDao.save(topact);
	}
	
	@Override
	public int update(TopactDO topact){
		return topactDao.update(topact);
	}
	
	@Override
	public int remove(String actIdnSky){
		return topactDao.remove(actIdnSky);
	}
	
	@Override
	public int batchRemove(String[] actIdnSkys){
		return topactDao.batchRemove(actIdnSkys);
	}
	
}
