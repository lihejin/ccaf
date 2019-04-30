package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.domain.AuthhistPartDO;
import com.ccaf.service.AuthhistPartService;
import java.util.List;
import java.util.Map;

import com.ccaf.dao.AuthhistPartDao;


@Service
public class AuthhistPartServiceImpl implements AuthhistPartService {
	@Autowired
	private AuthhistPartDao authhistPartDao;
	
	@Override
	public AuthhistPartDO get(String panTxt){
		return authhistPartDao.get(panTxt);
	}
	
	@Override
	public List<AuthhistPartDO> list(Map<String, Object> map){
		return authhistPartDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return authhistPartDao.count(map);
	}
	
	@Override
	public int save(AuthhistPartDO authhistPart){
		return authhistPartDao.save(authhistPart);
	}
	
	@Override
	public int update(AuthhistPartDO authhistPart){
		return authhistPartDao.update(authhistPart);
	}
	
	@Override
	public int remove(String panTxt){
		return authhistPartDao.remove(panTxt);
	}
	
	@Override
	public int batchRemove(String[] panTxts){
		return authhistPartDao.batchRemove(panTxts);
	}
	
}
