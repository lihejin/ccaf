package com.ccaf.service;

import com.ccaf.domain.SltactbkDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface SltactbkService {
	
	SltactbkDO get(String actIdnSky);
	
	List<SltactbkDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SltactbkDO sltactbk);
	
	int update(SltactbkDO sltactbk);
	
	int remove(String actIdnSky);
	
	int batchRemove(String[] actIdnSkys);
}
