package com.ccaf.dao;

import com.ccaf.domain.Tgen401DO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:10
 */
@Mapper
public interface Tgen401Dao {

	Tgen401DO get(String bchCde);
	
	List<Tgen401DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen401DO tgen401);
	
	int update(Tgen401DO tgen401);
	
	int remove(String bch_cde);
	
	int batchRemove(String[] bchCdes);
}
