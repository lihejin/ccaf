package com.ccaf.service;

import com.ccaf.domain.AuthhistPartDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface AuthhistPartService {
	
	AuthhistPartDO get(String panTxt);
	
	List<AuthhistPartDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AuthhistPartDO authhistPart);
	
	int update(AuthhistPartDO authhistPart);
	
	int remove(String panTxt);
	
	int batchRemove(String[] panTxts);
}
