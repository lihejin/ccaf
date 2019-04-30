package com.ccaf.dao;

import com.ccaf.domain.Tgen065DO;

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
public interface Tgen065Dao {

	Tgen065DO get(String rfeTypIdnCde);
	
	List<Tgen065DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen065DO tgen065);
	
	int update(Tgen065DO tgen065);
	
	int remove(String rfe_typ_idn_cde);
	
	int batchRemove(String[] rfeTypIdnCdes);
}
