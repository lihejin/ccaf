package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.domain.AwaitqHistDO;
import java.util.List;
import java.util.Map;

import com.ccaf.dao.AwaitqHistDao;
import com.ccaf.service.AwaitqHistService;



@Service
public class AwaitqHistServiceImpl implements AwaitqHistService {
	@Autowired
	private AwaitqHistDao awaitqHistDao;
	
	@Override
	public AwaitqHistDO get(String panTxt){
		return awaitqHistDao.get(panTxt);
	}
	
	@Override
	public List<AwaitqHistDO> list(Map<String, Object> map){
		return awaitqHistDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return awaitqHistDao.count(map);
	}
	
	@Override
	public int save(AwaitqHistDO awaitqHist){
		return awaitqHistDao.save(awaitqHist);
	}
	
	@Override
	public int update(AwaitqHistDO awaitqHist){
		return awaitqHistDao.update(awaitqHist);
	}
	
	@Override
	public int remove(String panTxt){
		return awaitqHistDao.remove(panTxt);
	}
	
	@Override
	public int batchRemove(String[] panTxts){
		return awaitqHistDao.batchRemove(panTxts);
	}
	
}
