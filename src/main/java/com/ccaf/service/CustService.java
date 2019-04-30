package com.ccaf.service;

import com.ccaf.domain.CustDO;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface CustService {
	
	CustDO get(Date lstUpdTtp);
	
	List<CustDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CustDO cust);
	
	int update(CustDO cust);
	
	int remove(Date lstUpdTtp);
	
	int batchRemove(Date[] lstUpdTtps);
}
