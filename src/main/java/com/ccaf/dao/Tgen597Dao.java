package com.ccaf.dao;

import com.ccaf.domain.Tgen597DO;

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
public interface Tgen597Dao {

	Tgen597DO get(String idCode);
	
	List<Tgen597DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen597DO tgen597);
	
	int update(Tgen597DO tgen597);
	
	int remove(String id_code);
	
	int batchRemove(String[] idCodes);
}
