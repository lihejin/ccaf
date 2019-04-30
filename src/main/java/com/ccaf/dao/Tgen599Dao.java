package com.ccaf.dao;

import com.ccaf.domain.Tgen599DO;

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
public interface Tgen599Dao {

	Tgen599DO get(String appIdnSky);
	
	List<Tgen599DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen599DO tgen599);
	
	int update(Tgen599DO tgen599);
	
	int remove(String app_idn_sky);
	
	int batchRemove(String[] appIdnSkys);
}
