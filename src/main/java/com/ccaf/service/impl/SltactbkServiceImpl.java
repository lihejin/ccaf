package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.dao.SltactbkDao;
import com.ccaf.domain.SltactbkDO;
import java.util.List;
import java.util.Map;

import com.ccaf.service.SltactbkService;



@Service
public class SltactbkServiceImpl implements SltactbkService {
	@Autowired
	private SltactbkDao sltactbkDao;
	
	@Override
	public SltactbkDO get(String actIdnSky){
		return sltactbkDao.get(actIdnSky);
	}
	
	@Override
	public List<SltactbkDO> list(Map<String, Object> map){
		return sltactbkDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return sltactbkDao.count(map);
	}
	
	@Override
	public int save(SltactbkDO sltactbk){
		return sltactbkDao.save(sltactbk);
	}
	
	@Override
	public int update(SltactbkDO sltactbk){
		return sltactbkDao.update(sltactbk);
	}
	
	@Override
	public int remove(String actIdnSky){
		return sltactbkDao.remove(actIdnSky);
	}
	
	@Override
	public int batchRemove(String[] actIdnSkys){
		return sltactbkDao.batchRemove(actIdnSkys);
	}
	
}
