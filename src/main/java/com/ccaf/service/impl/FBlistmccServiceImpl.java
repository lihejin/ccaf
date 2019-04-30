package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.dao.FBlistmccDao;
import com.ccaf.domain.FBlistmccDO;
import com.ccaf.service.FBlistmccService;
import java.util.List;
import java.util.Map;


@Service
public class FBlistmccServiceImpl implements FBlistmccService {
	@Autowired
	private FBlistmccDao fBlistmccDao;
	
	@Override
	public FBlistmccDO get(String mcc){
		return fBlistmccDao.get(mcc);
	}
	
	@Override
	public List<FBlistmccDO> list(Map<String, Object> map){
		return fBlistmccDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return fBlistmccDao.count(map);
	}
	
	@Override
	public int save(FBlistmccDO fBlistmcc){
		return fBlistmccDao.save(fBlistmcc);
	}
	
	@Override
	public int update(FBlistmccDO fBlistmcc){
		return fBlistmccDao.update(fBlistmcc);
	}
	
	@Override
	public int remove(String mcc){
		return fBlistmccDao.remove(mcc);
	}
	
	@Override
	public int batchRemove(String[] mccs){
		return fBlistmccDao.batchRemove(mccs);
	}
	
}
