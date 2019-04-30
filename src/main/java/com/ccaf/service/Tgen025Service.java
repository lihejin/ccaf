package com.ccaf.service;

import com.ccaf.domain.Tgen025DO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface Tgen025Service {
	
	Tgen025DO get(String itnIdnCde);
	
	List<Tgen025DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen025DO tgen025);
	
	int update(Tgen025DO tgen025);
	
	int remove(String itnIdnCde);
	
	int batchRemove(String[] itnIdnCdes);
}
