package com.ccaf.service;

import com.ccaf.domain.Tgen594DO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:10
 */
public interface Tgen594Service {
	
	Tgen594DO get(String payTypCde);
	
	List<Tgen594DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen594DO tgen594);
	
	int update(Tgen594DO tgen594);
	
	int remove(String payTypCde);
	
	int batchRemove(String[] payTypCdes);
}
