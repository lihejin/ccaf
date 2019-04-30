package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.domain.Tgen408DO;
import java.util.List;
import java.util.Map;

import com.ccaf.dao.Tgen408Dao;
import com.ccaf.service.Tgen408Service;



@Service
public class Tgen408ServiceImpl implements Tgen408Service {
	@Autowired
	private Tgen408Dao tgen408Dao;
	
	@Override
	public Tgen408DO get(String binNbr){
		return tgen408Dao.get(binNbr);
	}
	
	@Override
	public List<Tgen408DO> list(Map<String, Object> map){
		return tgen408Dao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tgen408Dao.count(map);
	}
	
	@Override
	public int save(Tgen408DO tgen408){
		return tgen408Dao.save(tgen408);
	}
	
	@Override
	public int update(Tgen408DO tgen408){
		return tgen408Dao.update(tgen408);
	}
	
	@Override
	public int remove(String binNbr){
		return tgen408Dao.remove(binNbr);
	}
	
	@Override
	public int batchRemove(String[] binNbrs){
		return tgen408Dao.batchRemove(binNbrs);
	}
	
}
