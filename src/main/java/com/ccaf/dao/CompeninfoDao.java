package com.ccaf.dao;

import com.ccaf.domain.CompeninfoDO;

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
public interface CompeninfoDao {

	CompeninfoDO get(String txnCde);
	
	List<CompeninfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CompeninfoDO compeninfo);
	
	int update(CompeninfoDO compeninfo);
	
	int remove(String txn_cde);
	
	int batchRemove(String[] txnCdes);
}
