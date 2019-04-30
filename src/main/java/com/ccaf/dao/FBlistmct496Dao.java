package com.ccaf.dao;

import com.ccaf.domain.FBlistmct496DO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
@Mapper
public interface FBlistmct496Dao {

	FBlistmct496DO get(String netTyp);
	
	List<FBlistmct496DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FBlistmct496DO fBlistmct496);
	
	int update(FBlistmct496DO fBlistmct496);
	
	int remove(String net_typ);
	
	int batchRemove(String[] netTyps);
}
