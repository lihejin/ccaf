package com.ccaf.service;

import com.ccaf.domain.CompeninfoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface CompeninfoService {
	
	CompeninfoDO get(String txnCde);
	
	List<CompeninfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CompeninfoDO compeninfo);
	
	int update(CompeninfoDO compeninfo);
	
	int remove(String txnCde);
	
	int batchRemove(String[] txnCdes);
}
