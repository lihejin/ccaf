package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ccaf.dao.ParmTypeDao;
import com.ccaf.domain.ParmTypeDO;
import com.ccaf.service.ParmTypeService;



@Service
public class ParmTypeServiceImpl implements ParmTypeService {
	@Autowired
	private ParmTypeDao parmTypeDao;
	
	@Override
	public ParmTypeDO get(String prmTypCde){
		return parmTypeDao.get(prmTypCde);
	}
	
	@Override
	public List<ParmTypeDO> list(Map<String, Object> map){
		return parmTypeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return parmTypeDao.count(map);
	}
	
	@Override
	public int save(ParmTypeDO parmType){
		return parmTypeDao.save(parmType);
	}
	
	@Override
	public int update(ParmTypeDO parmType){
		return parmTypeDao.update(parmType);
	}
	
	@Override
	public int remove(String prmTypCde){
		return parmTypeDao.remove(prmTypCde);
	}
	
	@Override
	public int batchRemove(String[] prmTypCdes){
		return parmTypeDao.batchRemove(prmTypCdes);
	}
	
}
