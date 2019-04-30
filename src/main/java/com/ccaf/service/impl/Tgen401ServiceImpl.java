package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ccaf.dao.Tgen401Dao;
import com.ccaf.domain.Tgen401DO;
import com.ccaf.service.Tgen401Service;



@Service
public class Tgen401ServiceImpl implements Tgen401Service {
	@Autowired
	private Tgen401Dao tgen401Dao;
	
	@Override
	public Tgen401DO get(String bchCde){
		return tgen401Dao.get(bchCde);
	}
	
	@Override
	public List<Tgen401DO> list(Map<String, Object> map){
		return tgen401Dao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tgen401Dao.count(map);
	}
	
	@Override
	public int save(Tgen401DO tgen401){
		return tgen401Dao.save(tgen401);
	}
	
	@Override
	public int update(Tgen401DO tgen401){
		return tgen401Dao.update(tgen401);
	}
	
	@Override
	public int remove(String bchCde){
		return tgen401Dao.remove(bchCde);
	}
	
	@Override
	public int batchRemove(String[] bchCdes){
		return tgen401Dao.batchRemove(bchCdes);
	}
	
}
