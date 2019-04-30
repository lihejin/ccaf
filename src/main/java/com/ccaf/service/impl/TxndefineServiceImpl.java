package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.dao.TxndefineDao;
import com.ccaf.domain.TxndefineDO;
import java.util.List;
import java.util.Map;

import com.ccaf.service.TxndefineService;



@Service
public class TxndefineServiceImpl implements TxndefineService {
	@Autowired
	private TxndefineDao txndefineDao;
	
	@Override
	public TxndefineDO get(String txnCde){
		return txndefineDao.get(txnCde);
	}
	
	@Override
	public List<TxndefineDO> list(Map<String, Object> map){
		return txndefineDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return txndefineDao.count(map);
	}
	
	@Override
	public int save(TxndefineDO txndefine){
		return txndefineDao.save(txndefine);
	}
	
	@Override
	public int update(TxndefineDO txndefine){
		return txndefineDao.update(txndefine);
	}
	
	@Override
	public int remove(String txnCde){
		return txndefineDao.remove(txnCde);
	}
	
	@Override
	public int batchRemove(String[] txnCdes){
		return txndefineDao.batchRemove(txnCdes);
	}
	
}
