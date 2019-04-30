package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.service.Tgen599Service;
import java.util.List;
import java.util.Map;

import com.ccaf.dao.Tgen599Dao;
import com.ccaf.domain.Tgen599DO;


@Service
public class Tgen599ServiceImpl implements Tgen599Service {
	@Autowired
	private Tgen599Dao tgen599Dao;
	
	@Override
	public Tgen599DO get(String appIdnSky){
		return tgen599Dao.get(appIdnSky);
	}
	
	@Override
	public List<Tgen599DO> list(Map<String, Object> map){
		return tgen599Dao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tgen599Dao.count(map);
	}
	
	@Override
	public int save(Tgen599DO tgen599){
		return tgen599Dao.save(tgen599);
	}
	
	@Override
	public int update(Tgen599DO tgen599){
		return tgen599Dao.update(tgen599);
	}
	
	@Override
	public int remove(String appIdnSky){
		return tgen599Dao.remove(appIdnSky);
	}
	
	@Override
	public int batchRemove(String[] appIdnSkys){
		return tgen599Dao.batchRemove(appIdnSkys);
	}
	
}
