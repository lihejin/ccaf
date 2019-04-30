package com.ccaf.dao;

import com.ccaf.domain.Tgen408DO;

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
public interface Tgen408Dao {

	Tgen408DO get(String binNbr);
	
	List<Tgen408DO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Tgen408DO tgen408);
	
	int update(Tgen408DO tgen408);
	
	int remove(String bin_nbr);
	
	int batchRemove(String[] binNbrs);
}
