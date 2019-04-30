package com.ccaf.dao;

import com.ccaf.domain.Tgen025DO;

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
public interface Tgen025Dao {

	Tgen025DO get(String itnIdnCde);
	
	List<Tgen025DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen025DO tgen025);
	
	int update(Tgen025DO tgen025);
	
	int remove(String itn_idn_cde);
	
	int batchRemove(String[] itnIdnCdes);
}
