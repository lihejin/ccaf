package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ccaf.dao.AuthhistDao;
import com.ccaf.domain.AuthhistDO;
import com.ccaf.service.AuthhistService;



@Service
public class AuthhistServiceImpl implements AuthhistService {
	@Autowired
	private AuthhistDao authhistDao;
	
	@Override
	public AuthhistDO get(String sysMdeInd){
		return authhistDao.get(sysMdeInd);
	}
	
	@Override
	public List<AuthhistDO> list(Map<String, Object> map){
		return authhistDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return authhistDao.count(map);
	}
	
	@Override
	public int save(AuthhistDO authhist){
		return authhistDao.save(authhist);
	}
	
	@Override
	public int update(AuthhistDO authhist){
		return authhistDao.update(authhist);
	}
	
	@Override
	public int remove(String sysMdeInd){
		return authhistDao.remove(sysMdeInd);
	}
	
	@Override
	public int batchRemove(String[] sysMdeInds){
		return authhistDao.batchRemove(sysMdeInds);
	}
	
}
