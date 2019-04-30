package com.ccaf.dao;

import com.ccaf.domain.FBlistmccDO;

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
public interface FBlistmccDao {

	FBlistmccDO get(String mcc);
	
	List<FBlistmccDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FBlistmccDO fBlistmcc);
	
	int update(FBlistmccDO fBlistmcc);
	
	int remove(String mcc);
	
	int batchRemove(String[] mccs);
}
