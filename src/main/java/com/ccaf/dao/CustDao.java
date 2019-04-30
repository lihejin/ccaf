package com.ccaf.dao;

import com.ccaf.domain.CustDO;

import java.util.Date;
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
public interface CustDao {

	CustDO get(Date lstUpdTtp);
	
	List<CustDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CustDO cust);
	
	int update(CustDO cust);
	
	int remove(Date lst_upd_ttp);
	
	int batchRemove(Date[] lstUpdTtps);
}
