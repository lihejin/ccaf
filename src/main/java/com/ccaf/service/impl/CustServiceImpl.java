package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.dao.CustDao;
import com.ccaf.service.CustService;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ccaf.domain.CustDO;


@Service
public class CustServiceImpl implements CustService {
	@Autowired
	private CustDao custDao;
	
	@Override
	public CustDO get(Date lstUpdTtp){
		return custDao.get(lstUpdTtp);
	}
	
	@Override
	public List<CustDO> list(Map<String, Object> map){
		return custDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return custDao.count(map);
	}
	
	@Override
	public int save(CustDO cust){
		return custDao.save(cust);
	}
	
	@Override
	public int update(CustDO cust){
		return custDao.update(cust);
	}
	
	@Override
	public int remove(Date lstUpdTtp){
		return custDao.remove(lstUpdTtp);
	}
	
	@Override
	public int batchRemove(Date[] lstUpdTtps){
		return custDao.batchRemove(lstUpdTtps);
	}
	
}
