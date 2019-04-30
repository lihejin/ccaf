package com.ccaf.service;

import com.ccaf.domain.ParmTypeDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface ParmTypeService {
	
	ParmTypeDO get(String prmTypCde);
	
	List<ParmTypeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ParmTypeDO parmType);
	
	int update(ParmTypeDO parmType);
	
	int remove(String prmTypCde);
	
	int batchRemove(String[] prmTypCdes);
}
