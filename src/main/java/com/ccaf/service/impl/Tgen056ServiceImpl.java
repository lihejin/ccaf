package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.dao.Tgen056Dao;
import com.ccaf.domain.Tgen056DO;
import com.ccaf.service.Tgen056Service;
import java.util.List;
import java.util.Map;


@Service
public class Tgen056ServiceImpl implements Tgen056Service {
	@Autowired
	private Tgen056Dao tgen056Dao;
	
	@Override
	public Tgen056DO get(String itnIdnCde){
		return tgen056Dao.get(itnIdnCde);
	}
	
	@Override
	public List<Tgen056DO> list(Map<String, Object> map){
		return tgen056Dao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tgen056Dao.count(map);
	}
	
	@Override
	public int save(Tgen056DO tgen056){
		return tgen056Dao.save(tgen056);
	}
	
	@Override
	public int update(Tgen056DO tgen056){
		return tgen056Dao.update(tgen056);
	}
	
	@Override
	public int remove(String itnIdnCde){
		return tgen056Dao.remove(itnIdnCde);
	}
	
	@Override
	public int batchRemove(String[] itnIdnCdes){
		return tgen056Dao.batchRemove(itnIdnCdes);
	}
	
}
