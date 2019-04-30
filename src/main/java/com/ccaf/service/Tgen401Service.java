package com.ccaf.service;

import com.ccaf.domain.Tgen401DO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:10
 */
public interface Tgen401Service {
	
	Tgen401DO get(String bchCde);
	
	List<Tgen401DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen401DO tgen401);
	
	int update(Tgen401DO tgen401);
	
	int remove(String bchCde);
	
	int batchRemove(String[] bchCdes);
}
