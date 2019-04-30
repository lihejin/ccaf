package com.ccaf.service;

import com.ccaf.domain.AuthhistDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface AuthhistService {
	
	AuthhistDO get(String sysMdeInd);
	
	List<AuthhistDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AuthhistDO authhist);
	
	int update(AuthhistDO authhist);
	
	int remove(String sysMdeInd);
	
	int batchRemove(String[] sysMdeInds);
}
