package com.ccaf.service.impl;


import com.ccaf.service.AuditSaveService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;


@Service
public class AuditSaveServiceImpl implements AuditSaveService {
//    @Autowired
//    private TaskArchRequiredDao taskArchRequiredDao;
//    @Autowired
//    private TaskDesignRequiredDao taskDesignRequiredDao;
//    @Autowired
//    private TaskDependDao taskDependDao;
//    @Autowired
//    private TaskBaseInfoDao taskBaseInfoDao;
//    @Autowired
//    private RequiredResultDao requiredResultDao;
//    @Autowired
//    private RequiredOpenBidDao requiredOpenBidDao;
//    @Autowired
//    private RequiredDateDao requiredDateDao;
//    @Autowired
//    private AuditSaveDao saveDao;
//    @Autowired
//    private AuditDao auditDao;
//    @Autowired
//    private ProjectDao projectDao;
//    @Autowired
//    private BossDao bossDao;
//    @Autowired
//    private DesignerDao designerDao;
//    @Autowired
//    private BannerDao bannerDao;
//    @Autowired
//    private DirectoryManageDao directoryManageDao;
//    @Autowired
//    private SucceedCaseDao succeedCaseDao;
//    @Autowired
//    private CustomerEvaluationDao customerEvaluationDao;
//    @Autowired
//    private ViewPointDao viewPointDao;
//    @Autowired
//    private CommonQuestionDao commonQuestionDao;
//    @Autowired
//    private NewsDao newsDao;
//    @Autowired
//    private DictService dictService;
//    @Autowired
//    private RequiredDao requiredDao;
//    @Autowired
//    private TBTaskDao taskDao;
//    @Autowired
//    private PlatformContractDao platformContractDao;
//    @Autowired
//    private AgendaDao agendaDao;
//    @Autowired
//    private BatchDao batchDao;
//    @Autowired
//    private ErrorCorrectionDao errorCorrectionDao;
//    @Autowired
//    private TaskBaseInfoService taskBaseInfoService;
//    @Autowired
//    private TaskDependService taskDependService;
//    @Autowired
//    private TaskDesignRequiredService taskDesignRequiredService;
//    @Autowired
//    private TaskArchRequiredService taskArchRequiredService;
//    @Autowired
//    private RequiredResultService requiredResultService;
//    @Autowired
//    private RequiredDateService requiredDateService;
//    @Autowired
//    private RequiredOpenBidService requiredOpenBidService;
//    @Autowired
//    private TBTaskDao tbTaskDao;
//    @Autowired
//    private PageBbsDao pageBbsDao;
//    @Autowired
//    private PageContestDao pageContestDao;
//    @Autowired
//    private IncircleGroupService incircleGroupService;

    public static LinkedBlockingQueue<Map<String,Object>> linkedBlockingQueue = new LinkedBlockingQueue();


//    /**
//     * 提交审核
//     * @param audit
//     * @return
//     */
//    @Override
//    public int save(AuditDO audit){
//
//        //防止主键重复
//        audit.setId(null);
//        //修改状态为未审核状态
//        audit.setAuditStatus(Constant.UNREVIEWED);
//        //修改时间 确保时间的真实性
//        audit.setAuditTime(new Date());
//        audit.setCreateTime(new Date());
//        audit.setUpdateTime(new Date());
//        return saveDao.save(audit);
//    }
//
//    @Override
//    public int updateByCondition(AuditDO audit) {
//        return auditDao.updateByCondition(audit);
//    }
//
//    /*	@Override
//        public List<AuditDO> getAuditList() {
//            Integer start = 2;
//            Integer end = 3;
//            return saveDao.getAuditList(start,end);
//        }
//
//        @Override
//        public int updateAuditList(List<AuditDO> list) {
//
//            //更改审核状态
//            for (AuditDO auditDO : list) {
//                auditDO.setAuditStatus(auditDO.getAuditStatus() + 2);
//            }
//
//            return saveDao.updateList(list);
//        }*/
//    @Override
//    public List<AuditDO> list(Map<String, Object> map){
//        return auditDao.list(map);
//    }
//
//    @Override
//    public int count(Map<String, Object> map){
//        return auditDao.count(map);
//    }
//
//    //查询并构建需要通知的项目集合
//    @Override
//    public List<ProjectDO> getProjectList() {
//        List<AuditDO> list = saveDao.getProjectList();
//        //构建需要通知的项目的集合
//        List<ProjectDO> projectList = new ArrayList<>();
//        if (!list.isEmpty()) {
//            for (AuditDO auditDO : list) {
//                ProjectDO projectDO = new ProjectDO();
//                projectDO.setId(auditDO.getTypeId());
//                projectDO.setAuditState(auditDO.getAuditStatus());
//                projectList.add(projectDO);
//            }
//        }
//        return projectList;
//    }
//
//    //查询并构建需要通知的客户结合
//    @Override
//    public List<BossDO> getBossList() {
//
//        List<AuditDO> list = saveDao.getBossList();
//        //构建需要通知的项目的集合
//        List<BossDO> bossList = new ArrayList<>();
//        if (!list.isEmpty()) {
//            for (AuditDO auditDO : list) {
//                BossDO bossDO = new BossDO();
//                bossDO.setId(auditDO.getTypeId());
//                bossDO.setAuditState(auditDO.getAuditStatus());
//                bossList.add(bossDO);
//            }
//        }
//
//        return bossList;
//    }
//
//    //查询并构建需要通知的设计师的集合
//    @Override
//    public List<DesignerDO> getDesignerList() {
//
//        List<AuditDO> list = saveDao.getDesignerList();
//        //构建需要通知的项目的集合
//        List<DesignerDO> designerList = new ArrayList<>();
//        if (!list.isEmpty()) {
//            for (AuditDO auditDO : list) {
//                DesignerDO designerDO = new DesignerDO();
//                designerDO.setId(auditDO.getTypeId());
//                designerDO.setAuditState(auditDO.getAuditStatus());
//                designerList.add(designerDO);
//            }
//        }
//
//        return designerList;
//    }
//
//    @Override
//    public List<TBTaskDO> getTBTasKList() {
//        List<AuditDO> list = saveDao.getTBTasKList();
//        //构建需要通知的任务书的集合
//        List<TBTaskDO> tbTaskDOList = new ArrayList<>();
//        if (!list.isEmpty()) {
//            for (AuditDO auditDO : list) {
//                TBTaskDO tbTaskDO = new TBTaskDO();
//                tbTaskDO.setId(auditDO.getTypeId());
//                tbTaskDO.setStatus(auditDO.getAuditStatus());
//            }
//        }
//        return tbTaskDOList;
//    }
//
//    @Override
//    public List<PageBbsDO> getPageBbsList() {
//        List<AuditDO> list = saveDao.getPageBbsList();
//        //构建需要通知的任务书的集合
//        List<PageBbsDO> pageBbsDOList = new ArrayList<>();
//        if (!list.isEmpty()) {
//            for (AuditDO auditDO : list) {
//                TBTaskDO tbTaskDO = new TBTaskDO();
//                tbTaskDO.setId(auditDO.getTypeId());
//                tbTaskDO.setStatus(auditDO.getAuditStatus());
//            }
//        }
//        return pageBbsDOList;
//    }
//
//    @Override
//    public List<PageBbsDO> getPageContestList() {
//        List<AuditDO> list = saveDao.getPageContestList();
//        //构建需要通知的任务书的集合
//        List<PageBbsDO> pageBbsDOList = new ArrayList<>();
//        if (!list.isEmpty()) {
//            for (AuditDO auditDO : list) {
//                TBTaskDO tbTaskDO = new TBTaskDO();
//                tbTaskDO.setId(auditDO.getTypeId());
//                tbTaskDO.setStatus(auditDO.getAuditStatus());
//            }
//        }
//        return pageBbsDOList;
//    }
//
//    /**
//     * 回写流程状态
//     * @param tableName
//     * @param auditType
//     * @param auditStatus
//     * @param id
//     * @return
//     */
//    public int writeBackAuditState(String tableName, Integer auditType,Integer auditStatus, Long id) {
//        //根据审批决定获取审批状态/流程状态
//        Integer auditState = this.auditStatHandler(auditType,auditStatus);
//        //回写流程状态
//        if(Constant.DESIGN_BUDGET == auditType) {
//            ProjectDO project = new ProjectDO();
//            project.setId(id);
//            project.setBudgetAuditState(auditState.toString());
//            return projectDao.update(project);
//        }else{
//            return saveDao.writeBackAuditState(tableName,auditState,id);
//        }
//    }
//    /**
//     * 触发(初级)审批
//     * @param id
//     * @param type
//     * @return
//     */
//    @Transactional
//    public int  audit(Long id,Integer type){
//        //废弃之前的审批
//        AuditDO auditDO = new AuditDO();
//        auditDO.setAuditType(type);
//        auditDO.setType(Constant.PRELIMINARY);
//        auditDO.setTypeId(id);
//        this.invalidFormerAudit(auditDO);
//        //保存本次审批
//        auditDO.setLatestFlag("Y");
//        auditDO.setAuditStatus(Constant.UNREVIEWED);//初审未审
//        auditDO.setCreateId(ShiroUtils.getUserId());
//        auditDO.setUpdateId(ShiroUtils.getUserId());
//        int count = saveDao.save(auditDO);
//        String writeBackTable = dictService.getName("audit_write_back_table", auditDO.getAuditType().toString());
//        //回写各业务表状态
//        this.writeBackAuditState(writeBackTable,
//                auditDO.getAuditType(),
//                auditDO.getAuditStatus(),
//                auditDO.getTypeId());
//
//        //初审再次提交时,需要将errorCorrection置为废弃
//        if(type==Constant.REQUIRED||type==Constant.REQUIRED_RESULT||type==Constant.REQUIRED_DATE||type==Constant.REQUIRED_OPEN_BID
//                ||type==Constant.TASK||type==Constant.TASK_BASE_INFO||type==Constant.TASK_DEPEND||type==Constant.TASK_DESIGN_REQUIRED
//                ||type==Constant.REQUIRED_OPEN_BID){
//            ErrorCorrectionDO errorCorrectionDO = new ErrorCorrectionDO();
//            errorCorrectionDO.setTemplateNo(type);
//            errorCorrectionDO.setBusinessId(id);
//            errorCorrectionDao.invalidStatusByConditon(errorCorrectionDO);
//
//        }
//        //重新提交一级审批时,如果有二级审批,需要将二级审批状态重置
//        HashMap<String, Object> reviewMap = new HashMap<>();
//        reviewMap.put("auditType",type);
//        reviewMap.put("latestFlag","Y");
//        reviewMap.put("type",Constant.REVIEW);
//        reviewMap.put("typeId",id);
//        List<AuditDO> reviewList = auditDao.list(reviewMap);
//        if(reviewList.size()>0){
//            AuditDO reviewAudit = new AuditDO();
//            reviewAudit.setId(reviewList.get(0).getId());
//            reviewAudit.setLatestFlag("N");
//            auditDao.update(reviewAudit);
//        }
//        /*任务书/需求书特殊逻辑处理 start*/
//        if(type==Constant.REQUIRED||type==Constant.REQUIRED_RESULT||type==Constant.REQUIRED_DATE||type==Constant.REQUIRED_OPEN_BID
//                ||type==Constant.TASK||type==Constant.TASK_BASE_INFO||type==Constant.TASK_DEPEND||type==Constant.TASK_DESIGN_REQUIRED||type==Constant.TASK_ARCH_REQUIRED
//                ){
//            ErrorCorrectionDO errorCorrectionDO = new ErrorCorrectionDO();
//            errorCorrectionDO.setTemplateNo(type);
//            errorCorrectionDO.setBusinessId(id);
//            errorCorrectionDao.invalidStatusByConditon(errorCorrectionDO);
//        }
//        Long taskId = 0l ;
//        Long projectId = 0l;
//        if(type==Constant.TASK_BASE_INFO){
//            TaskBaseInfoDO taskBaseInfoDO = taskBaseInfoService.get(id);
//            if (taskBaseInfoDO != null) {
//                taskId = taskBaseInfoDO.getTaskId();
//            }
//        }else if(type==Constant.TASK_DEPEND){
//            TaskDependDO taskDependDO = taskDependService.get(id);
//            if (taskDependDO != null) {
//                taskId = taskDependDO.getTaskId();
//            }
//        }else if(type==Constant.TASK_DESIGN_REQUIRED){
//            TaskDesignRequiredDO taskDesignRequiredDO = taskDesignRequiredService.get(id);
//            if(taskDesignRequiredDO!=null){
//                taskId = taskDesignRequiredDO.getTaskId();
//            }
//        }else if(type==Constant.TASK_ARCH_REQUIRED){
//            TaskArchRequiredDO taskArchRequiredDO = taskArchRequiredService.get(id);
//            if(taskArchRequiredDO!=null){
//                taskId = taskArchRequiredDO.getTaskId();
//            }
//        }
//        if(taskId!=0l ){
//            //更新主表状态
//            TBTaskDO tbTaskDO = new TBTaskDO();
//            tbTaskDO.setId(taskId);
//            tbTaskDO.setAuditState(Constant.UNREVIEWED.shortValue());
//            tbTaskDao.update(tbTaskDO);
//        }
//
//        if(type==Constant.REQUIRED){
//            projectId = id;
//        }else if(type==Constant.REQUIRED_RESULT){
//            projectId = requiredResultService.get(id).getProjectId();
//        }else if(type==Constant.REQUIRED_DATE){
//            projectId = requiredDateService.get(id).getProjectId();
//        }else if(type==Constant.REQUIRED_OPEN_BID){
//            projectId = requiredOpenBidService.get(id).getProjectId();
//        }
//        if(projectId!=0l){
//            //更新主表状态
//            ProjectDO project = new ProjectDO();
//            project.setId(projectId);
//            project.setAuditState(Constant.UNREVIEWED);
//            projectDao.update(project);
//        }
//
//        if(taskId!=0l ){
//            HashMap<String, Object> map = new HashMap<>();
//            map.put("auditType",Constant.TASK);
//            map.put("typeId",taskId);
//            map.put("type",Constant.REVIEW);
//            map.put("latestFlag","Y");
//            List<AuditDO> list = auditDao.list(map);
//            if(list.size()>0){
//                AuditDO taskAudit = list.get(0);
//                taskAudit.setLatestFlag("N");
//                auditDao.update(taskAudit);
//            }
//        }else if(projectId!=0){
//            HashMap<String, Object> map = new HashMap<>();
//            map.put("auditType",Constant.REQUIRED);
//            map.put("typeId",projectId);
//            map.put("type",Constant.REVIEW);
//            map.put("latestFlag","Y");
//            List<AuditDO> list = auditDao.list(map);
//            if(list.size()>0){
//                AuditDO projectAudit = list.get(0);
//                projectAudit.setLatestFlag("N");
//                auditDao.update(projectAudit);
//            }
//        }
//        /*任务书/需求书特殊逻辑处理 end*/
//        this.sendInfo( id,type,auditDO,"audit");
//        return count;
//    }
//    /**
//     * 触发二级审批
//     * @param id
//     * @param type
//     * @return
//     */
//    @Transactional
//    public int  reviewAudit(Long id,Integer type){
//        AuditDO auditDO = new AuditDO();
//        auditDO.setAuditType(type);
//        auditDO.setType(Constant.REVIEW);
//        auditDO.setTypeId(id);
//        this.invalidFormerAudit(auditDO);
//
//        auditDO.setLatestFlag("Y");
//        auditDO.setAuditStatus(Constant.REVIEW_UNREVIEWED);//复审未审
//        auditDO.setCreateId(ShiroUtils.getUserId());
//        auditDO.setUpdateId(ShiroUtils.getUserId());
//        int count =  saveDao.save(auditDO);
//        String writeBackTable = dictService.getName("audit_write_back_table", auditDO.getAuditType().toString());
//        //回写各业务表状态
//        this.writeBackAuditState(writeBackTable,
//                auditDO.getAuditType(),
//                auditDO.getAuditStatus(),
//                auditDO.getTypeId());
//
//        //给客户发送消息接口
//        this.sendInfo( id,type,auditDO,"reviewAudit");
//
//        return count;
//    }
//
//
//    /**
//     * 查询二级审批列表
//     * @param params
//     * auditType
//     * @return
//     * @throws InvocationTargetException
//     * @throws IllegalAccessException
//     */
//    public List<Map<String,Object>> auditQuery(Map<String,Object> params) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ParseException {
//        List<AuditDO> auditDOList = auditDao.list(params);
////        /*if(params.containsKey("list") && "list2".equals(params.get("list"))){
////            auditDOList = auditDao.list2(params);
////        }else{
////            auditDOList = auditDao.list(params);
////        }*/
//        List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
//        if (auditDOList != null) {
//            for (AuditDO audit : auditDOList) {
//                List<Object> objList = this.getAuditObject(audit.getAuditType(), audit.getTypeId());
//                if(objList != null) {
//                    for (Object obj : objList) {
//                        Map map = BeanUtils.describe(obj);
//                        map.put("auditId", audit.getId());
//                        map.put("typeId", audit.getTypeId());
//                        map.put("auditStatus", audit.getAuditStatus());
//                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//                        SimpleDateFormat cstDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
//                        String createTimeStr = (String) map.get("createTime");
//                        String updateTimeStr = (String) map.get("updateTime");
//                        String beginTime = (String) map.get("beginTime");
//                        String endTime = (String) map.get("endTime");
//                        if (createTimeStr != null) {
//                            Date createTime = cstDateFormat.parse(createTimeStr);
//                            String formatCreateTime = dateFormat.format(createTime);
//                            map.put("createTime", formatCreateTime);
//                        }
//                        if (updateTimeStr != null) {
//                            Date updateTime = cstDateFormat.parse(updateTimeStr);
//                            String formatUpdateTime = dateFormat.format(updateTime);
//                            map.put("updateTime", formatUpdateTime);
//                        }
//                        if (beginTime != null) {
//                            Date beginTimedate = cstDateFormat.parse(beginTime);
//                            String formatbeginTime = dateFormat.format(beginTimedate);
//                            map.put("beginTime", formatbeginTime);
//                        }
//                        if (endTime != null) {
//                            Date endTimedate = cstDateFormat.parse(endTime);
//                            String formatendTimee = dateFormat.format(endTimedate);
//                            map.put("endTime", formatendTimee);
//                        }
//
//                        mapList.add(map);
//                    }
//                }
//            }
//        }
//        return mapList;
//    }
//
//
//
//    /**
//     * 驳回初级审批
//     * @param businessId
//     * @param type
//     * @param annotation
//     */
//    @Transactional
//    public void rejectPreliminary(Long businessId,Integer type,String[] needCorrection,String annotation){
//        preliminaryAuditCase(businessId,type,needCorrection,annotation,Constant.NOT_PASS);
//    }
//
//    /**
//     * 通过初级审批
//     * @param businessId
//     * @param type
//     * @param
//     */
//    @Transactional
//    public void passPreliminary(Long businessId,Integer type){
//        preliminaryAuditCase(businessId,type,null,"",Constant.PASSED);
//    }
//    /**
//     * 二级审批
//     * 根据审批案件id进行审批
//     * @param auditDO
//     */
//    @Transactional
//    public void reviewAuditCase(AuditDO auditDO){
//        //1.根据审批id 更新审批表 状态
//        auditDO.setUpdateId(ShiroUtils.getUserId());
//        auditDao.update(auditDO);
//        String writeBackTable = dictService.getName("audit_write_back_table", String.valueOf(auditDO.getAuditType()));
//        //批次审批
//        //2.对于内容管理,如果审批通过的话,需要将之前的状态置为废弃,将本次的状态置为使用
//        if("tb_audit_batch".equals(writeBackTable)
//                && auditDO.getAuditStatus()==Constant.REVIEW_PASSED){
//            /*将之前的状态废弃*/
//            BatchDO batchDO = new BatchDO();
//            batchDO.setId(auditDO.getTypeId());
//            batchDO.setType(auditDO.getAuditType());
//            batchDao.discardFormerContent(batchDO);
//            /*将本次状态更新为使用中*/
//            batchDO.setBatchState("1");
//            batchDao.updateByCondition(batchDO);
//        }
//
//        //3..回写各业务表状态
//        this.writeBackAuditState(writeBackTable,
//                auditDO.getAuditType(),
//                auditDO.getAuditStatus(),
//                auditDO.getTypeId());
//
//        //4.对于被二级审批驳回,需要将期对应的一级审批状态重置为提交状态
//        if(auditDO.getAuditStatus()==Constant.REVIEW_NOT_PASS
//                &&(auditDO.getAuditType()==Constant.REQUIRED
//                ||auditDO.getAuditType()==Constant.TASK
//                ||auditDO.getAuditType()==Constant.BOSS
//                ||auditDO.getAuditType()==Constant.DESIGNER
//                ||auditDO.getAuditType()==Constant.DESIGN_BUDGET)){
//            this.dealForReject(auditDO);
//        }
//
//        //业务处理
//        if(auditDO.getAuditType().equals(Constant.REQUIRED)){
//            if(auditDO.getAuditStatus()==Constant.REVIEW_PASSED){
//                ProjectDO projectDO = projectDao.get(auditDO.getTypeId());
//                projectDO.setOpenCollectionStatus(Constant.START);
//                projectDao.update(projectDO);
//            }
//        }
//
//        //5.发送消息
//        this.sendInfo(auditDO.getTypeId(),Integer.valueOf(auditDO.getAuditType()),auditDO,"reviewAuditCase");
//    }
//
//
//
//    /**
//     * 初级审批
//     * @param businessId
//     * @param type
//     * @param annotation
//     * @param decision
//     * @return
//     */
//    @Transactional
//    protected void preliminaryAuditCase(Long businessId,Integer type,String[] needCorrection,String annotation,Integer decision){
//        //1.更新audit状态
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("auditType",type);
//        paramMap.put("typeId",businessId);
//        paramMap.put("type",Constant.PRELIMINARY);
//        paramMap.put("latestFlag","Y");
//
//        AuditDO auditDO = auditDao.list(paramMap).get(0);
//        auditDO.setAuditStatus(decision);//审批决定
//        auditDO.setAuditTime(new Date());//审批时间
//        if(auditDO.getAuditStatus()==Constant.PASSED){
//            annotation="";
//        }
//        auditDO.setAnnotation(annotation);//审批批注
//        auditDO.setAuditPerson(ShiroUtils.getUserId());//审批人
//        auditDao.update(auditDO);
//        //int i = auditDao.updateByCondition(auditDO);
//
//        //2.纠错字段处理 special for task/required
//        this.needCorrectionSaveUpdate(type,needCorrection,businessId,auditDO.getId());
//        //3.回写各业务表状态
//        String writeBackTable = dictService.getName("audit_write_back_table", auditDO.getAuditType().toString());
//        this.writeBackAuditState(writeBackTable,
//                auditDO.getAuditType(),
//                auditDO.getAuditStatus(),
//                auditDO.getTypeId());
//
//        //4.发送消息
//        this.sendInfo(businessId,auditDO.getAuditType(),auditDO,"preliminaryAuditCase");
//    }
//
//
//    /**
//     * 二级审批(废弃)
//     * @param businessId
//     * @param type
//     * @param annotation
//     * @param decision
//     * @return
//     */
//    @Deprecated
//    @Transactional
//    public void reviewAuditCase(Long businessId,Integer type,String annotation,Integer decision){
//
//        AuditDO auditDO = new AuditDO();
//        //查询条件
//        auditDO.setAuditType(type);//审批类型
//        auditDO.setTypeId(businessId);//业务号
//        auditDO.setType(String.valueOf(Constant.REVIEW));//(二级)审批
//        //需要更新的字段
//        auditDO.setAuditStatus(decision);//审批决定
//        auditDO.setAuditTime(new Date());//审批时间
//        auditDO.setAnnotation(annotation);//审批批注
//        auditDO.setAuditPerson(ShiroUtils.getUserId());//审批人
//        //更新
//        int i = auditDao.updateByCondition(auditDO);
//
//        //2.对于内容管理,如果审批通过的话,需要将之前的状态置为废弃,将本次的状态置为使用
//        String writeBackTable = dictService.getName("audit_write_back_table", auditDO.getAuditType().toString());
//
//        if("tb_audit_batch".equals(writeBackTable)
//                && auditDO.getAuditStatus()==Constant.REVIEW_PASSED){
//            /*将之前的状态废弃*/
//            BatchDO batchDO = new BatchDO();
//            batchDO.setId(auditDO.getTypeId());
//            batchDO.setType(auditDO.getAuditType());
//            batchDao.discardFormerContent(batchDO);
//            /*将本次状态更新为使用中*/
//            batchDO.setBatchState("1");
//            batchDao.updateByCondition(batchDO);
//        }
//        //2.回写各业务表状态
//
//        this.writeBackAuditState(writeBackTable,
//                auditDO.getAuditType(),
//                auditDO.getAuditStatus(),
//                auditDO.getTypeId());
//        //3.发送消息 todo
//        //给客户发送消息接口
//        this.sendInfo( businessId,auditDO.getAuditType(),auditDO,"reviewAuditCase");
//    }
//    /**二级审批查询
//     *
//     * @return
//     */
//    private List<Object>  getAuditObject(Integer auditType,Long typeId ){
//
//        switch(auditType){
//            case 1 ://designer
//                return new ArrayList<Object>(){{add(designerDao.get(typeId));}};
//            case 3 ://boss
//                return new ArrayList<Object>(){{add(bossDao.get(typeId));}};
//            case 4 ://project
//                return new ArrayList<Object>(){{add(projectDao.get(typeId));}};
//            case 5 ://banner
//                Map<String, Object> bannerMap = new HashMap<String,Object>();
//                bannerMap.put("type",Constant.BANNER);
//                bannerMap.put("batchId",typeId);
//                bannerMap.put("hidden",1);
//                List<BannerDO> list = bannerDao.list(bannerMap);
//                for (BannerDO banner:list) {
//                    banner.setAuditState(dictService.getName("index_audit_status",banner.getAuditState()));
//                    banner.setSaveSite(AliyunOssUtils.getUrl(banner.getSaveSite()));
//                }
//                return (List)list;
//            case 7://task
//                TBTaskDO tbTaskDO = taskDao.get(typeId);
//                HashMap<String,Object> map = new HashMap<>();
//                map.put("id",tbTaskDO.getProjectId());
//                return new ArrayList<Object>(){{add(projectDao.list(map).get(0));}};
//            case 8 ://directoryManage
//                Map<String, Object> directoryMap = new HashMap<String,Object>();
//                directoryMap.put("type",Constant.DIRECTORY_MANAGER);
//                directoryMap.put("batchId",typeId);
//                directoryMap.put("hidden",1);
//                return (List)directoryManageDao.listChild(directoryMap);
//            case 9 ://succeedCase
//                Map<String, Object> scMap = new HashMap<String,Object>();
//                scMap.put("type",SucceedCaseDO.SUCCEED_CASE);
//                scMap.put("batchId",typeId);
//                scMap.put("hidden",1);
//                return (List)succeedCaseDao.list(scMap);
//            case 10 :
//                Map<String, Object> hezhuMap = new HashMap<String,Object>();
//                hezhuMap.put("type",SucceedCaseDO.HEZHU_DESIGN);
//                hezhuMap.put("batchId",typeId);
//                hezhuMap.put("hidden",1);
//                return (List)succeedCaseDao.list(hezhuMap);
//            case 11 :
//                Map<String, Object> coMap = new HashMap<String,Object>();
//                coMap.put("type",SucceedCaseDO.COOPERATED_CUSTOMER);
//                coMap.put("batchId",typeId);
//                coMap.put("hidden",1);
//                return (List)succeedCaseDao.list(coMap);
//            case 12 ://customerEvaluation
//                Map<String, Object> ceMap = new HashMap<String,Object>();
//                ceMap.put("type",Constant.CUSTOMER_EVALUATION);
//                ceMap.put("batchId",typeId);
//                ceMap.put("hidden",1);
//                return (List)customerEvaluationDao.list(ceMap);
//            case 13 ://view point
//                return new ArrayList<Object>(){{add(viewPointDao.get(typeId));}};
//            case 14 ://common question
//                return new ArrayList<Object>(){{add(commonQuestionDao.get(typeId));}};
//            case 15 ://news
//                return new ArrayList<Object>(){{add(newsDao.get(typeId));}};
//            case 16 ://inCircle
//                IncircleGroupDO incircleGroup=incircleGroupService.get(typeId);
//                if (incircleGroup == null) return null;
//                Map<String, Object> projectMap = new HashMap<String,Object>();
//                projectMap.put("id",incircleGroup.getProjectId());
//                return (List)projectDao.list(projectMap);
//            case 17 ://required
//                ProjectDO projectDO = projectDao.get(typeId);
//                //projectDO.setProjectType(dictService.getName("building_type",projectDO.getProjectType()));
//                //projectDO.setEmployerInfo(dictService.getName("employer_info",projectDO.getEmployerInfo()));
//                return new ArrayList<Object>(){{add(projectDO);}};
//            case 19 ://agenda
//                return new ArrayList<Object>(){{add(agendaDao.get(typeId));}};
//            case 20 ://platForm
//                PlatformContractDO platformContractDO = platformContractDao.get(typeId);
//                if(platformContractDO!=null) {
//                    platformContractDO.setStatus(dictService.getName("platform_contract_status", platformContractDO.getStatus()));
//                    platformContractDO.setType(dictService.getName("platform_contract_type", platformContractDO.getType()));
//                }
//                platformContractDO.setProjectName(projectDao.get(platformContractDO.getProjectId()).getProjectName());
//                return new ArrayList<Object>(){{add(platformContractDO);}};
//
//            case 31 ://budget
//                return new ArrayList<Object>(){{add(projectDao.get(typeId));}};
//            case 32 ://bbs page
//                return new ArrayList<Object>(){{add(pageBbsDao.get(typeId.intValue()));}};
//            case 33 ://bbs page
//                return new ArrayList<Object>(){{add(pageContestDao.get(typeId.intValue()));}};
//        }
//        return null;
//    }
//
//    /**
//     * 审批时
//     * 根据审批决定修改各业务表的审批/流程状态
//     * tip:提交审批,auditDecision 传 null
//     * @param auditType
//     * @param auditDecision
//     * @return auditStatus
//     */
//    private Integer auditStatHandler(Integer auditType,Integer auditDecision){
//        switch(auditType){
//            case 1 ://designer
//                if(auditDecision == Constant.UNREVIEWED
//                        || auditDecision == Constant.REVIEW_UNREVIEWED
//                        || auditDecision == Constant.PASSED){
//                    return DesignerDO.submit;
//                }else if(auditDecision == Constant.REVIEW_NOT_PASS
//                        || auditDecision == Constant.NOT_PASS){
//                    return DesignerDO.perfect;
//                }else if(auditDecision == Constant.REVIEW_PASSED){
//                    return DesignerDO.verificated;
//                }
//            case 3 ://Boss
//                if(auditDecision == Constant.UNREVIEWED
//                        || auditDecision == Constant.REVIEW_UNREVIEWED
//                        || auditDecision == Constant.PASSED){
//                    return BossDO.submit;
//                }else if(auditDecision == Constant.REVIEW_NOT_PASS
//                        || auditDecision == Constant.NOT_PASS){
//                    return BossDO.perfect;
//                }else if(auditDecision == Constant.REVIEW_PASSED){
//                    return BossDO.verificated;
//                }
//            case 4 :
//                return auditDecision;
//            case 5 :
//                return auditDecision;
//            case 7:
//                return auditDecision ;
//            case 8 :
//                return auditDecision;
//            case 9 :
//                return auditDecision;
//            case 10 :
//                return auditDecision;
//            case 11 :
//                return auditDecision;
//            case 12 :
//                return auditDecision;
//            case 13 :
//                return auditDecision;
//            case 14 :
//                return auditDecision;
//            case 15 :
//                return auditDecision;
//            case 17 :
//                return auditDecision;
//            default :
//                return auditDecision;
//        }
//    }
//
//    /**
//     * 纠错字段更新
//     */
//    private void needCorrectionSaveUpdate(Integer type,String[] needCorrection,Long businessId,Long auditId){
//        //构造参数Map
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("businessId",businessId);
//        paramMap.put("auditId",auditId);
//        //先清理之前的纠错字段
//        ErrorCorrectionDO correctionDO = new ErrorCorrectionDO();
//        correctionDO.setBusinessId(businessId);
//        correctionDO.setTemplateNo(type);
//        correctionDO.setAuditId(auditId);
//
//        errorCorrectionDao.deleteByCondition(correctionDO);
//        //保存
//        if(needCorrection!=null && needCorrection.length>0){
//            for(String errorField : needCorrection){
//                correctionDO.setColNum(errorField);
//                correctionDO.setUpdateId(ShiroUtils.getUserId());
//                correctionDO.setCreateId(ShiroUtils.getUserId());
//                errorCorrectionDao.save(correctionDO);
//            }
//        }
//
//        /*List<ErrorCorrectionDO> errorCorrectionList = errorCorrectionDao.list(paramMap);
//
//        for(String errorField : needCorrection){
//            paramMap.put("colNum",errorField);
//            List<ErrorCorrectionDO> errorCorrectionList = errorCorrectionDao.list(paramMap);
//            correctionDO.setColNum(errorField);
//            //update
//            if(errorCorrectionList!=null && errorCorrectionList.size()>0){
//                correctionDO.setId(errorCorrectionList.get(0).getId());
//                errorCorrectionDao.update(correctionDO);
//            }else{//save
//                errorCorrectionDao.save(correctionDO);
//            }
//        }*/
//
//    }
//
//    /**
//     * 设置接收人
//     * @param businessId
//     */
//    @Deprecated
//    private String setSelectors(Long businessId,Integer auditType){
//        switch(auditType){
//            case 7 ://task
//                String bossId = tbTaskDao.get(businessId).getCreateUser();
//                return bossId;
//            default:
//                return null;
//        }
//    }
//    private void notifyMessage(Map<String, Object> map){
//        projectDao.addNotify(map);
//        Map<String, Object> notifyMap = projectDao.getNotify(String.valueOf(map.get("linkAddress")));
//        if (!notifyMap.isEmpty()) {
//            map.put("notifyId", notifyMap.get("id"));
//            projectDao.aadNotifyRecord(map);
//        }
//    }
//    //审批发送信息体总接口
//    private void sendInfo(Long businessId,Integer auditType,AuditDO auditDO,String trigger){
//        // 客户触发审批
//        if("audit".equals(trigger)){
//            HashMap<String, Object> map = new HashMap<>();
//            Long user = ShiroUtils.getUserId();
//            map.put("createUser", user);
//            map.put("updateUser", user);
//            map.put("status", "1");
//            map.put("channelType", "1");//站内信
//            map.put("type", "3");// 项目经理
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//            String date = sdf.format(new Date());
//            map.put("linkAddress", date + "-" + user + "-" + auditType);
//            if(auditType ==Constant.REQUIRED){
//                // 需求书招标方式
//                ProjectDO projectDO = projectDao.get(businessId);
//                if(projectDO == null){
//                    return;
//                }
//                if(projectDO.getManagerId() == 0l){
//                    return;
//                }
//                map.put("title", projectDO.getProjectName() + " 招标需求-招标方式");
//                map.put("content", projectDO.getProjectName() + " 招标需求-招标方式客户已提交审核，请及时处理");
//                map.put("selectors",projectDO.getManagerId().toString());
//                map.put("projectId",projectDO.getId());
//                notifyMessage(map);
//            }else if(auditType ==Constant.REQUIRED_RESULT){
//                // 设计深度及成果要求
//                RequiredResultDO requiredResultDO =requiredResultDao.get(businessId);
//                if(requiredResultDO ==null){
//                    return;
//                }
//                ProjectDO projectDO = projectDao.get(requiredResultDO.getProjectId());
//                if(projectDO == null){
//                    return;
//                }
//                if(projectDO.getManagerId() == 0l){
//                    return;
//                }
//                map.put("title", projectDO.getProjectName() + " 招标需求-设计深度及成果要求");
//                map.put("content", projectDO.getProjectName() + " 招标需求-设计深度及成果要求客户已提交审核，请及时处理");
//                map.put("selectors",projectDO.getManagerId().toString());
//                map.put("projectId",projectDO.getId());
//                notifyMessage(map);
//            }else if(auditType ==Constant.REQUIRED_OPEN_BID){
//                // 开标细节
//                RequiredOpenBidDO requiredOpenBidDO = requiredOpenBidDao.get(businessId);
//                if (requiredOpenBidDO == null) {
//                    return;
//                }
//                ProjectDO projectDO = projectDao.get(requiredOpenBidDO.getProjectId());
//                if (projectDO == null) {
//                    return;
//                }
//                if (projectDO.getManagerId() == 0l) {
//                    return;
//                }
//                map.put("title", projectDO.getProjectName() + " 招标需求-开标细节");
//                map.put("content", projectDO.getProjectName() + " 招标需求-开标细节客户已提交审核，请及时处理");
//                map.put("selectors",projectDO.getManagerId().toString());
//                map.put("projectId",projectDO.getId());
//                notifyMessage(map);
//            }else if(auditType ==Constant.REQUIRED_DATE){
//                // 服务周期
//                RequiredDateDO requiredDateDO = requiredDateDao.get(businessId);
//                if (requiredDateDO == null) {
//                    return;
//                }
//                ProjectDO projectDO = projectDao.get(requiredDateDO.getProjectId());
//                if (projectDO == null) {
//                    return;
//                }
//                if (projectDO.getManagerId() == 0l) {
//                    return;
//                }
//                map.put("title", projectDO.getProjectName() + " 招标需求-服务周期及时间节点");
//                map.put("content", projectDO.getProjectName() + " 招标需求-服务周期及时间节点客户已提交审核，请及时处理");
//                map.put("selectors",projectDO.getManagerId().toString());
//                map.put("projectId",projectDO.getId());
//                notifyMessage(map);
//            }else if(auditType ==Constant.TASK_BASE_INFO){
//                // 任务书基本资料
//                TaskBaseInfoDO taskBaseInfoDO = taskBaseInfoDao.get(businessId);
//                if (taskBaseInfoDO == null) {
//                    return;
//                }
//                TBTaskDO tbTaskDO = tbTaskDao.get(taskBaseInfoDO.getTaskId());
//                if (tbTaskDO == null) {
//                    return;
//                }
//                ProjectDO projectDO = projectDao.get(tbTaskDO.getProjectId());
//                if (projectDO == null) {
//                    return;
//                }
//                if (projectDO.getManagerId() == 0l) {
//                    return;
//                }
//                map.put("title", projectDO.getProjectName() + " 任务书-基本资料");
//                map.put("content", projectDO.getProjectName() + " 任务书-基本资料客户已提交审核，请及时处理");
//                map.put("selectors",projectDO.getManagerId().toString());
//                map.put("projectId",projectDO.getId());
//                notifyMessage(map);
//            } else if(auditType ==Constant.TASK_DEPEND){
//                // 设计依据
//                TaskDependDO taskDependDO = taskDependDao.get(businessId);
//                if (taskDependDO == null) {
//                    return;
//                }
//                TBTaskDO tbTaskDO =tbTaskDao.get(taskDependDO.getTaskId());
//                if (tbTaskDO == null) {
//                    return;
//                }
//                ProjectDO projectDO = projectDao.get(tbTaskDO.getProjectId());
//                if (projectDO == null) {
//                    return;
//                }
//                if (projectDO.getManagerId() == 0l) {
//                    return;
//                }
//                map.put("title", projectDO.getProjectName() + " 任务书-设计依据");
//                map.put("content", projectDO.getProjectName() + " 任务书-设计依据客户已提交审核，请及时处理");
//                map.put("selectors",projectDO.getManagerId().toString());
//                map.put("projectId",projectDO.getId());
//                notifyMessage(map);
//            } else if(auditType ==Constant.TASK_DESIGN_REQUIRED){
//                // 设计需求1
//                TaskDesignRequiredDO taskDesignRequiredDO = taskDesignRequiredDao.get(businessId);
//                if (taskDesignRequiredDO == null) {
//                    return;
//                }
//                TBTaskDO tbTaskDO = tbTaskDao.get(taskDesignRequiredDO.getTaskId());
//                ProjectDO projectDO = projectDao.get(tbTaskDO.getProjectId());
//                if (projectDO == null) {
//                    return;
//                }
//                if (projectDO.getManagerId() == 0l) {
//                    return;
//                }
//                map.put("title", projectDO.getProjectName() + " 任务书-设计需求1");
//                map.put("content", projectDO.getProjectName() + " 任务书-设计需求1客户已提交审核，请及时处理");
//                map.put("selectors",projectDO.getManagerId().toString());
//                map.put("projectId",projectDO.getId());
//                notifyMessage(map);
//            } else if (auditType == Constant.TASK_ARCH_REQUIRED) {
//                // 设计需求2
//                TaskArchRequiredDO taskArchRequiredDO = taskArchRequiredDao.get(businessId);
//                if (taskArchRequiredDO == null) {
//                    return;
//                }
//                TBTaskDO tbTaskDO = tbTaskDao.get(taskArchRequiredDO.getTaskId());
//                ProjectDO projectDO = projectDao.get(tbTaskDO.getProjectId());
//                if (projectDO == null) {
//                    return;
//                }
//                if (projectDO.getManagerId() == 0l) {
//                    return;
//                }
//                map.put("title", projectDO.getProjectName() + " 任务书-设计需求2");
//                map.put("content", projectDO.getProjectName() + " 任务书-设计需求2客户已提交审核，请及时处理");
//                map.put("selectors",projectDO.getManagerId().toString());
//                map.put("projectId",projectDO.getId());
//                notifyMessage(map);
//            }
//        }
//        if ("preliminaryAuditCase".equals(trigger)) {
//            if (auditDO.getAuditStatus() == Constant.NOT_PASS) {
//                HashMap<String, Object> map = new HashMap<>();
//                Long user = ShiroUtils.getUserId();
//                map.put("createUser", user);
//                map.put("updateUser", user);
//                map.put("status", "1");
//                map.put("channelType", "1");//站内信
//                map.put("type", "0");// 客户
//                if (auditType == Constant.TASK_BASE_INFO) {
//                    // 任务书基本资料
//                    TaskBaseInfoDO taskBaseInfoDO = taskBaseInfoDao.get(businessId);
//                    if (taskBaseInfoDO == null) {
//                        return;
//                    }
//                    TBTaskDO tbTaskDO = tbTaskDao.get(taskBaseInfoDO.getTaskId());
//                    if (tbTaskDO == null) {
//                        return;
//                    }
//                    ProjectDO projectDO = projectDao.get(tbTaskDO.getProjectId());
//                    if (projectDO == null) {
//                        return;
//                    }
//                    if (projectDO.getManagerId() == 0l) {
//                        return;
//                    }
//                    map.put("title", projectDO.getProjectName() + " 任务书-基本资料");
//                    map.put("content", projectDO.getProjectName() + " 任务书-基本资料审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                    map.put("selectors",projectDO.getBossId().toString());
//                    map.put("projectId",projectDO.getId());
//                    linkedBlockingQueue.add(map);
//                }
//                if (auditType == Constant.TASK_DEPEND) {
//                    // 设计依据
//                    TaskDependDO taskDependDO = taskDependDao.get(businessId);
//                    if (taskDependDO == null) {
//                        return;
//                    }
//                    TBTaskDO tbTaskDO =tbTaskDao.get(taskDependDO.getTaskId());
//                    if (tbTaskDO == null) {
//                        return;
//                    }
//                    ProjectDO projectDO = projectDao.get(tbTaskDO.getProjectId());
//                    if (projectDO == null) {
//                        return;
//                    }
//                    if (projectDO.getManagerId() == 0l) {
//                        return;
//                    }
//                    map.put("title", projectDO.getProjectName() + " 任务书-设计依据");
//                    map.put("content", projectDO.getProjectName() + " 任务书-设计依据审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                    map.put("selectors",projectDO.getBossId().toString());
//                    map.put("projectId",projectDO.getId());
//                    linkedBlockingQueue.add(map);
//                }
//                if (auditType == Constant.TASK_DESIGN_REQUIRED) {
//                    // 设计需求1
//                    TaskDesignRequiredDO taskDesignRequiredDO = taskDesignRequiredDao.get(businessId);
//                    if (taskDesignRequiredDO == null) {
//                        return;
//                    }
//                    TBTaskDO tbTaskDO = tbTaskDao.get(taskDesignRequiredDO.getTaskId());
//                    ProjectDO projectDO = projectDao.get(tbTaskDO.getProjectId());
//                    if (projectDO == null) {
//                        return;
//                    }
//                    if (projectDO.getManagerId() == 0l) {
//                        return;
//                    }
//                    map.put("title", projectDO.getProjectName() + " 任务书-设计需求1");
//                    map.put("content", projectDO.getProjectName() + " 任务书-设计需求1审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                    map.put("selectors",projectDO.getBossId().toString());
//                    map.put("projectId",projectDO.getId());
//                    linkedBlockingQueue.add(map);
//                }
//                if (auditType == Constant.TASK_ARCH_REQUIRED) {
//                    // 设计需求2
//                    TaskArchRequiredDO taskArchRequiredDO = taskArchRequiredDao.get(businessId);
//                    if (taskArchRequiredDO == null) {
//                        return;
//                    }
//                    TBTaskDO tbTaskDO = tbTaskDao.get(taskArchRequiredDO.getTaskId());
//                    ProjectDO projectDO = projectDao.get(tbTaskDO.getProjectId());
//                    if (projectDO == null) {
//                        return;
//                    }
//                    if (projectDO.getManagerId() == 0l) {
//                        return;
//                    }
//                    map.put("title", projectDO.getProjectName() + " 任务书-设计需求2");
//                    map.put("content", projectDO.getProjectName() + " 任务书-设计需求2审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                    map.put("selectors",projectDO.getBossId().toString());
//                    map.put("projectId",projectDO.getId());
//                    linkedBlockingQueue.add(map);
//                }
//                if (auditType == Constant.REQUIRED) {
//                    // 需求书招标方式
//                    ProjectDO projectDO = projectDao.get(businessId);
//                    if(projectDO == null){
//                        return;
//                    }
//                    if(projectDO.getManagerId() == 0l){
//                        return;
//                    }
//                    map.put("title", projectDO.getProjectName() + " 招标需求-招标方式");
//                    map.put("content", projectDO.getProjectName() + " 招标需求-招标方式审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                    map.put("selectors",projectDO.getBossId().toString());
//                    map.put("projectId",projectDO.getId());
//                    linkedBlockingQueue.add(map);
//                }
//                if (auditType == Constant.REQUIRED_RESULT) {
//                    // 设计深度及成果要求
//                    RequiredResultDO requiredResultDO =requiredResultDao.get(businessId);
//                    if(requiredResultDO ==null){
//                        return;
//                    }
//                    ProjectDO projectDO = projectDao.get(requiredResultDO.getProjectId());
//                    if(projectDO == null){
//                        return;
//                    }
//                    if(projectDO.getManagerId() == 0l){
//                        return;
//                    }
//                    map.put("title", projectDO.getProjectName() + " 招标需求-设计深度及成果要求");
//                    map.put("content", projectDO.getProjectName() + " 招标需求-设计深度及成果要求审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                    map.put("selectors",projectDO.getBossId().toString());
//                    map.put("projectId",projectDO.getId());
//                    linkedBlockingQueue.add(map);
//                }
//                if (auditType == Constant.REQUIRED_DATE) {
//                    // 服务周期
//                    RequiredDateDO requiredDateDO = requiredDateDao.get(businessId);
//                    if (requiredDateDO == null) {
//                        return;
//                    }
//                    ProjectDO projectDO = projectDao.get(requiredDateDO.getProjectId());
//                    if (projectDO == null) {
//                        return;
//                    }
//                    if (projectDO.getManagerId() == 0l) {
//                        return;
//                    }
//                    map.put("title", projectDO.getProjectName() + " 招标需求-服务周期及时间节点");
//                    map.put("content", projectDO.getProjectName() + " 招标需求-服务周期及时间节点审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                    map.put("selectors",projectDO.getBossId().toString());
//                    map.put("projectId",projectDO.getId());
//                    linkedBlockingQueue.add(map);
//                }
//                if (auditType == Constant.REQUIRED_OPEN_BID) {
//                    // 开标细节
//                    RequiredOpenBidDO requiredOpenBidDO = requiredOpenBidDao.get(businessId);
//                    if (requiredOpenBidDO == null) {
//                        return;
//                    }
//                    ProjectDO projectDO = projectDao.get(requiredOpenBidDO.getProjectId());
//                    if (projectDO == null) {
//                        return;
//                    }
//                    if (projectDO.getManagerId() == 0l) {
//                        return;
//                    }
//                    map.put("title", projectDO.getProjectName() + " 招标需求-开标细节");
//                    map.put("content", projectDO.getProjectName() + " 招标需求-开标细节审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                    map.put("selectors",projectDO.getBossId().toString());
//                    map.put("projectId",projectDO.getId());
//                    linkedBlockingQueue.add(map);
//                }
//                if (auditType == Constant.DESIGNER) {
//                    // 设计师审核拒绝
//                    map.put("type", "1");
//                    map.put("title", "设计身份审核申请被拒绝");
//                    map.put("content", "您的设计身份审核申请被拒绝,拒绝原因： " + auditDO.getAnnotation());
//                    map.put("selectors",businessId.toString());
//                    linkedBlockingQueue.add(map);
//                }
//                if (auditType == Constant.BOSS) {
//                    // 设计师审核拒绝
//                    map.put("title", "设计身份审核申请被拒绝");
//                    map.put("content", "您的设计身份审核申请被拒绝,拒绝原因： " + auditDO.getAnnotation());
//                    map.put("selectors",businessId.toString());
//                    linkedBlockingQueue.add(map);
//                }
//            }
//        }
//        // 二级审核通过
//       if("reviewAuditCase".equals(trigger)){
//            if(auditType==Constant.TASK){
//                TBTaskDO tbTaskDO = tbTaskDao.get(businessId);
//                if (tbTaskDO == null) {
//                    return;
//                }
//                ProjectDO projectDO = projectDao.get(tbTaskDO.getProjectId());
//                if (projectDO == null) {
//                    return;
//                }
//                //发送给客户
//                HashMap<String, Object> map = new HashMap<>();
//                if (auditDO.getAuditStatus() == Constant.REVIEW_PASSED) {
//                    map.put("title", projectDO.getProjectName() + " 任务书审批通过");
//                    map.put("content", projectDO.getProjectName() + " 任务书审批通过");
//                } else {
//                    map.put("title", projectDO.getProjectName() + " 任务书审批拒绝");
//                    map.put("content", projectDO.getProjectName() + " 任务书审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                }
//                map.put("createUser",ShiroUtils.getUserId());
//                map.put("updateUser",ShiroUtils.getUserId());
//                map.put("status","1");
//                map.put("channelType","1");//站内信
//                map.put("type","0");//客户
//                map.put("selectors",tbTaskDO.getCreateUser());
//                map.put("projectId",tbTaskDO.getProjectId());
//                linkedBlockingQueue.add(map);
//                //发送给经理
//                HashMap<String, Object> managerMap = new HashMap<>();
//                if (auditDO.getAuditStatus() == Constant.REVIEW_PASSED) {
//                    managerMap.put("title", projectDO.getProjectName() + " 任务书二级审批通过");
//                    managerMap.put("content", projectDO.getProjectName() + " 任务书二级审批通过");
//                } else {
//                    managerMap.put("title", projectDO.getProjectName() + " 任务书二级审批拒绝");
//                    managerMap.put("content", projectDO.getProjectName() + " 任务书二级审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                }
//                String userName = UserUtil.getUserName();
//                managerMap.put("createUser",ShiroUtils.getUserId());
//                managerMap.put("updateUser",ShiroUtils.getUserId());
//                managerMap.put("status","1");
//                managerMap.put("channelType","1");//站内信
//                managerMap.put("type","3");//经理
//                managerMap.put("projectId",tbTaskDO.getProjectId());//经理
//                managerMap.put("selectors",auditDO.getCreateId().toString());
//                linkedBlockingQueue.add(managerMap);
//
//            }else if(auditType==Constant.REQUIRED){
//                //发送给客户
//                ProjectDO projectDO = projectDao.get(businessId);
//                if (projectDO == null) {
//                    return;
//                }
//                HashMap<String, Object> map = new HashMap<>();
//                if(auditDO.getAuditStatus()==Constant.REVIEW_PASSED){
//                    map.put("title",projectDO.getProjectName()+" 需求书审批通过");
//                    map.put("content",projectDO.getProjectName()+" 需求书审批通过");
//                }else{
//                    map.put("title",projectDO.getProjectName()+" 需求书审批拒绝");
//                    map.put("content",projectDO.getProjectName()+" 需求书审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                }
//                map.put("createUser",ShiroUtils.getUserId());
//                map.put("updateUser",ShiroUtils.getUserId());
//                map.put("status","1");
//                map.put("channelType","1");//站内信
//                map.put("type","0");//客户
//                map.put("selectors",projectDO.getBossId().toString());
//                map.put("projectId",projectDO.getId());
//                linkedBlockingQueue.add(map);
//                //发送给经理
//                HashMap<String, Object> managerMap = new HashMap<>();
//                if(auditDO.getAuditStatus()==Constant.REVIEW_PASSED){
//                    managerMap.put("title",projectDO.getProjectName()+" 需求书二级审批通过");
//                    managerMap.put("content",projectDO.getProjectName()+" 需求书二级审批通过");
//                }else{
//                    managerMap.put("title",projectDO.getProjectName()+" 需求书二级审批拒绝");
//                    managerMap.put("content",projectDO.getProjectName()+" 需求书二级审批拒绝,拒绝原因: " + auditDO.getAnnotation());
//                }
//                managerMap.put("createUser",ShiroUtils.getUserId());
//                managerMap.put("updateUser",ShiroUtils.getUserId());
//                managerMap.put("status","1");
//                managerMap.put("channelType","1");//站内信
//                managerMap.put("type","3");//项目经理
//                Long manager = auditDO.getCreateId();
//                managerMap.put("selectors",manager);
//                managerMap.put("projectId",projectDO.getId());
//                linkedBlockingQueue.add(managerMap);
//            } else if (auditType == Constant.DESIGNER) {
//               // 设计师审核
//                HashMap<String, Object> map = new HashMap<>();
//                map.put("createUser", ShiroUtils.getUserId());
//                map.put("updateUser", ShiroUtils.getUserId());
//                map.put("status", "1");
//                map.put("channelType", "1");//站内信
//                map.put("type", "1");//设计师
//                if (auditDO.getAuditStatus() == Constant.REVIEW_PASSED) {
//                    map.put("title", "设计身份审核申请通过");
//                    map.put("content", "您的设计身份审核申请已通过");
//                } else {
//                    map.put("title", "设计身份审核申请被拒绝");
//                    map.put("content", "您的设计身份审核申请被拒绝,拒绝原因： " + auditDO.getAnnotation());
//                }
//                map.put("selectors", businessId.toString());
//                linkedBlockingQueue.add(map);
//            } else if (auditType == Constant.BOSS) {
//                // 客户审核
//                HashMap<String, Object> map = new HashMap<>();
//                map.put("createUser", ShiroUtils.getUserId());
//                map.put("updateUser", ShiroUtils.getUserId());
//                map.put("status", "1");
//                map.put("channelType", "1");//站内信
//                map.put("type", "0");//客户
//                if (auditDO.getAuditStatus() == Constant.REVIEW_PASSED) {
//                    map.put("title", "身份审核申请通过");
//                    map.put("content", "您的身份审核申请已通过");
//                } else {
//                    map.put("title", "身份审核申请被拒绝");
//                    map.put("content", "您的身份审核申请被拒绝,拒绝原因： " + auditDO.getAnnotation());
//                }
//                map.put("selectors", businessId.toString());
//                linkedBlockingQueue.add(map);
//            }
//        }
//
//    }
//
//    /**
//     * 校验是否可以审批
//     * 即判断 是否已经做过审批
//     * return :flag: true 可以审批 false:禁止审批
//     */
//    public Boolean checkAuditStatus(Integer auditType, Long businessId, String trigger){
//        boolean flag = true;
//        //构建禁止状态的校验参数
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("auditType",auditType);
//        map.put("typeId",businessId);
//        map.put("latestFlag","Y");
//
//        //构建允许状态的校验参数
//        HashMap<String, Object> allowMap = new HashMap<>();
//        allowMap.put("auditType",auditType);
//        allowMap.put("typeId",businessId);
//        allowMap.put("latestFlag","Y");
//
//        //初审
//        if("auditCase".equals(trigger)){
//            //1.是否有提交的审批
//            int[] allowStatus  = {Constant.UNREVIEWED};
//            allowMap.put("type",Constant.PRELIMINARY);
//            allowMap.put("auditStatusList",allowStatus);
//            //2.判断是否做过审批
//            int[] forBiddenStatus = {Constant.PASSED, Constant.NOT_PASS};
//            map.put("type",Constant.PRELIMINARY);
//            map.put("auditStatusList",forBiddenStatus);
//
//        }else if("reviewAuditCase".equals(trigger)){//复审
//            //1.是否有提交的审批
//            int[] allowStatus  = {Constant.REVIEW_UNREVIEWED};
//            allowMap.put("type",Constant.REVIEW);
//            allowMap.put("auditStatusList",allowStatus);
//            //2.判断是否做过审批
//            int[] forBiddenStatus = {Constant.REVIEW_PASSED, Constant.REVIEW_NOT_PASS};
//            map.put("type",Constant.REVIEW);
//            map.put("auditStatusList",forBiddenStatus);
//        }
//        //判断是否有审批
//        if(auditDao.listByStatusList(allowMap).size()==0){
//            flag = false;
//            return flag;
//        }
//        //判断是否做过审批
//        List<AuditDO> auditDOList = auditDao.listByStatusList(map);
//        if(auditDOList!=null&&auditDOList.size()>0){
//            flag = false;
//        }
//        return flag;
//    }
//
//    /**
//     *对于被二级审批驳回,需要将期对应(tb_audit/业务表)的一级审批状态重置为提交状态
//     * @param auditDO
//     */
//    private void dealForReject(AuditDO auditDO){
//        if(auditDO.getAuditType()==Constant.TASK){//Task
//
//            AuditDO audit = new AuditDO();
//            audit.setTypeId(auditDO.getTypeId());
//            audit.setAuditType(auditDO.getAuditType());
//            audit.setType(Constant.PRELIMINARY);
//            audit.setAuditStatus(Constant.UNREVIEWED);//更新成提交状态
//            auditDao.updateByCondition(audit);
//            //暂不更新task业务表
//
//            HashMap<String,Object> map = new HashMap();
//            map.put("taskId",auditDO.getTypeId());
//
//            Long baseInfoId = taskBaseInfoService.list(map).get(0).getId();
//            audit.setAuditType(Constant.TASK_BASE_INFO);
//            audit.setTypeId(baseInfoId);
//            auditDao.updateByCondition(audit);
//            this.writeBackAuditState(dictService.getName("audit_write_back_table", auditDO.getAuditType().toString())
//                    ,Constant.TASK_BASE_INFO,Constant.UNREVIEWED,baseInfoId);
//
//            Long dependId = taskDependService.list(map).get(0).getId();
//            audit.setAuditType(Constant.TASK_DEPEND);
//            audit.setTypeId(dependId);
//            auditDao.updateByCondition(audit);
//            this.writeBackAuditState(dictService.getName("audit_write_back_table", auditDO.getAuditType().toString())
//                    ,Constant.TASK_DEPEND,Constant.UNREVIEWED,baseInfoId);
//
//            Long designRequiredId = taskDesignRequiredService.list(map).get(0).getId();
//            audit.setAuditType(Constant.TASK_DESIGN_REQUIRED);
//            audit.setTypeId(designRequiredId);
//            auditDao.updateByCondition(audit);
//            this.writeBackAuditState(dictService.getName("audit_write_back_table", auditDO.getAuditType().toString())
//                    ,Constant.TASK_DESIGN_REQUIRED,Constant.UNREVIEWED,baseInfoId);
//
//            Long archRequiredId = taskArchRequiredService.list(map).get(0).getId();
//            audit.setAuditType(Constant.TASK_ARCH_REQUIRED);
//            audit.setTypeId(archRequiredId);
//            auditDao.updateByCondition(audit);
//            this.writeBackAuditState(dictService.getName("audit_write_back_table", auditDO.getAuditType().toString())
//                    ,Constant.TASK_ARCH_REQUIRED,Constant.UNREVIEWED,baseInfoId);
//
//        }else if(auditDO.getAuditType()==Constant.REQUIRED){//Required
//            //required
//            AuditDO audit = new AuditDO();
//            audit.setTypeId(auditDO.getTypeId());
//            audit.setAuditType(auditDO.getAuditType());
//            audit.setType(Constant.PRELIMINARY);
//            audit.setAuditStatus(Constant.UNREVIEWED);//更新成提交状态
//            auditDao.updateByCondition(audit);
//            this.writeBackAuditState(dictService.getName("audit_write_back_table", auditDO.getAuditType().toString())
//                    ,Constant.REQUIRED,Constant.UNREVIEWED,auditDO.getTypeId());
//
//            HashMap<String,Object> map = new HashMap();
//            map.put("requiredId",auditDO.getTypeId());
//            //result
//            Long resultId = requiredResultService.list(map).get(0).getId();
//            audit.setAuditType(Constant.REQUIRED_RESULT);
//            audit.setTypeId(resultId);
//            auditDao.updateByCondition(audit);
//            this.writeBackAuditState(dictService.getName("audit_write_back_table", auditDO.getAuditType().toString())
//                    ,Constant.REQUIRED_RESULT,Constant.UNREVIEWED,resultId);
//            //date
//            Long dateId = requiredDateService.list(map).get(0).getId();
//            audit.setAuditType(Constant.REQUIRED_DATE);
//            audit.setTypeId(dateId);
//            auditDao.updateByCondition(audit);
//            this.writeBackAuditState(dictService.getName("audit_write_back_table", auditDO.getAuditType().toString())
//                    ,Constant.REQUIRED_DATE,Constant.UNREVIEWED,dateId);
//            //openBid
//            Long openBidId = requiredOpenBidService.list(map).get(0).getId();
//            audit.setAuditType(Constant.REQUIRED_OPEN_BID);
//            audit.setTypeId(openBidId);
//            auditDao.updateByCondition(audit);
//            this.writeBackAuditState(dictService.getName("audit_write_back_table", auditDO.getAuditType().toString())
//                    ,Constant.REQUIRED_OPEN_BID,Constant.UNREVIEWED,openBidId);
//
//        }else{
//            AuditDO audit = new AuditDO();
//            audit.setTypeId(auditDO.getTypeId());
//            audit.setAuditType(auditDO.getAuditType());
//            audit.setType(Constant.PRELIMINARY);
//            audit.setAuditStatus(Constant.UNREVIEWED);//更新成提交状态
//            auditDao.updateByCondition(audit);
//            this.writeBackAuditState(dictService.getName("audit_write_back_table", auditDO.getAuditType().toString())
//                    ,auditDO.getAuditType(),Constant.UNREVIEWED,auditDO.getTypeId());
//        }
//    }
//
//    /**
//     *每次提交审批,需要将同类型同business的置为N
//     * @param auditDO
//     */
//    private void invalidFormerAudit(AuditDO auditDO){
//        auditDO.setLatestFlag("N");
//        auditDO.setUpdateId(ShiroUtils.getUserId());
//        auditDao.updateLatestFlag(auditDO);
//    }
//    /**
//      * Description: 校验是否可以提交审批
//      * Params:
//      * Return: flag false校验失败  true:成功
//      * Author: Neal.Xu
//      * Date: 2019/1/23 10:59
//      */
//    public boolean dupValidate(Long typeId,Integer auditType,String type){
//        Boolean flag = true;
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("auditType",auditType);
//        map.put("typeId",typeId);
//        map.put("latestFlag","Y");
//        //初审
//        if(Constant.PRELIMINARY.equals(type)){
//            int[] forBiddenStatus = {Constant.PASSED,Constant.UNREVIEWED};
//            map.put("type",Constant.PRELIMINARY);
//            map.put("auditStatusList",forBiddenStatus);
//        }else if(Constant.REVIEW.equals(type)){//复审
//            int[] forBiddenStatus = { Constant.REVIEW_UNREVIEWED};
//            map.put("type",Constant.REVIEW);
//            map.put("auditStatusList",forBiddenStatus);
//        }
//
//        List<AuditDO> auditDOList = auditDao.listByStatusList(map);
//        if(auditDOList!=null&&auditDOList.size()>0){
//            flag = false;
//        }
//        return flag;
//    }
}

