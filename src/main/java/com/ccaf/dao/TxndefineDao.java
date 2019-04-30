package com.ccaf.dao;

import com.ccaf.domain.TxndefineDO;

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
public interface TxndefineDao {

	TxndefineDO get(String txnCde);
	
	List<TxndefineDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TxndefineDO txndefine);
	
	int update(TxndefineDO txndefine);
	
	int remove(String txn_cde);
	
	int batchRemove(String[] txnCdes);
}
