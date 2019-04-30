package com.ccaf.service;

import com.ccaf.domain.PWlistmctDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface PWlistmctService {
	
	PWlistmctDO get(String mctId);
	
	List<PWlistmctDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PWlistmctDO pWlistmct);
	
	int update(PWlistmctDO pWlistmct);
	
	int remove(String mctId);
	
	int batchRemove(String[] mctIds);
}
