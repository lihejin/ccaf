package com.ccaf.service;

import com.ccaf.domain.FBlistmct496DO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface FBlistmct496Service {
	
	FBlistmct496DO get(String netTyp);
	
	List<FBlistmct496DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FBlistmct496DO fBlistmct496);
	
	int update(FBlistmct496DO fBlistmct496);
	
	int remove(String netTyp);
	
	int batchRemove(String[] netTyps);
}
