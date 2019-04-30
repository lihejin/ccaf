package com.ccaf.dao;

import com.ccaf.domain.Tgen594DO;

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
public interface Tgen594Dao {

	Tgen594DO get(String payTypCde);
	
	List<Tgen594DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen594DO tgen594);
	
	int update(Tgen594DO tgen594);
	
	int remove(String pay_typ_cde);
	
	int batchRemove(String[] payTypCdes);
}
