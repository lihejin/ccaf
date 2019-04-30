package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.service.Tgen065Service;
import java.util.List;
import java.util.Map;

import com.ccaf.dao.Tgen065Dao;
import com.ccaf.domain.Tgen065DO;


@Service
public class Tgen065ServiceImpl implements Tgen065Service {
	@Autowired
	private Tgen065Dao tgen065Dao;
	
	@Override
	public Tgen065DO get(String rfeTypIdnCde){
		return tgen065Dao.get(rfeTypIdnCde);
	}
	
	@Override
	public List<Tgen065DO> list(Map<String, Object> map){
		return tgen065Dao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tgen065Dao.count(map);
	}
	
	@Override
	public int save(Tgen065DO tgen065){
		return tgen065Dao.save(tgen065);
	}
	
	@Override
	public int update(Tgen065DO tgen065){
		return tgen065Dao.update(tgen065);
	}
	
	@Override
	public int remove(String rfeTypIdnCde){
		return tgen065Dao.remove(rfeTypIdnCde);
	}
	
	@Override
	public int batchRemove(String[] rfeTypIdnCdes){
		return tgen065Dao.batchRemove(rfeTypIdnCdes);
	}
	
}
