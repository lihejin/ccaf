package com.ccaf.service;

import com.ccaf.domain.Tgen599DO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:10
 */
public interface Tgen599Service {
	
	Tgen599DO get(String appIdnSky);
	
	List<Tgen599DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen599DO tgen599);
	
	int update(Tgen599DO tgen599);
	
	int remove(String appIdnSky);
	
	int batchRemove(String[] appIdnSkys);
}
