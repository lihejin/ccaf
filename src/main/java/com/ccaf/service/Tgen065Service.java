package com.ccaf.service;

import com.ccaf.domain.Tgen065DO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:10
 */
public interface Tgen065Service {
	
	Tgen065DO get(String rfeTypIdnCde);
	
	List<Tgen065DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen065DO tgen065);
	
	int update(Tgen065DO tgen065);
	
	int remove(String rfeTypIdnCde);
	
	int batchRemove(String[] rfeTypIdnCdes);
}
