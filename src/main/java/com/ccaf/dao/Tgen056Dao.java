package com.ccaf.dao;

import com.ccaf.domain.Tgen056DO;

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
public interface Tgen056Dao {

	Tgen056DO get(String itnIdnCde);
	
	List<Tgen056DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen056DO tgen056);
	
	int update(Tgen056DO tgen056);
	
	int remove(String itn_idn_cde);
	
	int batchRemove(String[] itnIdnCdes);
}
