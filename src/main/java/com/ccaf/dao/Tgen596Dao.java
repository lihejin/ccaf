package com.ccaf.dao;

import com.ccaf.domain.Tgen596DO;

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
public interface Tgen596Dao {

	Tgen596DO get(String idCode);
	
	List<Tgen596DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen596DO tgen596);
	
	int update(Tgen596DO tgen596);
	
	int remove(String id_code);
	
	int batchRemove(String[] idCodes);
}
