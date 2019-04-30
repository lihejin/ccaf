package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.dao.Tgen025Dao;
import java.util.List;
import java.util.Map;

import com.ccaf.domain.Tgen025DO;
import com.ccaf.service.Tgen025Service;



@Service
public class Tgen025ServiceImpl implements Tgen025Service {
	@Autowired
	private Tgen025Dao tgen025Dao;
	
	@Override
	public Tgen025DO get(String itnIdnCde){
		return tgen025Dao.get(itnIdnCde);
	}
	
	@Override
	public List<Tgen025DO> list(Map<String, Object> map){
		return tgen025Dao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tgen025Dao.count(map);
	}
	
	@Override
	public int save(Tgen025DO tgen025){
		return tgen025Dao.save(tgen025);
	}
	
	@Override
	public int update(Tgen025DO tgen025){
		return tgen025Dao.update(tgen025);
	}
	
	@Override
	public int remove(String itnIdnCde){
		return tgen025Dao.remove(itnIdnCde);
	}
	
	@Override
	public int batchRemove(String[] itnIdnCdes){
		return tgen025Dao.batchRemove(itnIdnCdes);
	}
	
}
