package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ccaf.dao.CompeninfoDao;
import com.ccaf.domain.CompeninfoDO;
import com.ccaf.service.CompeninfoService;



@Service
public class CompeninfoServiceImpl implements CompeninfoService {
	@Autowired
	private CompeninfoDao compeninfoDao;
	
	@Override
	public CompeninfoDO get(String txnCde){
		return compeninfoDao.get(txnCde);
	}
	
	@Override
	public List<CompeninfoDO> list(Map<String, Object> map){
		return compeninfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return compeninfoDao.count(map);
	}
	
	@Override
	public int save(CompeninfoDO compeninfo){
		return compeninfoDao.save(compeninfo);
	}
	
	@Override
	public int update(CompeninfoDO compeninfo){
		return compeninfoDao.update(compeninfo);
	}
	
	@Override
	public int remove(String txnCde){
		return compeninfoDao.remove(txnCde);
	}
	
	@Override
	public int batchRemove(String[] txnCdes){
		return compeninfoDao.batchRemove(txnCdes);
	}
	
}
