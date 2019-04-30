package com.ccaf.service;

import com.ccaf.domain.ParmDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface ParmService {
	
	ParmDO get(String prmTypCde);
	
	List<ParmDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ParmDO parm);
	
	int update(ParmDO parm);
	
	int remove(String prmTypCde);
	
	int batchRemove(String[] prmTypCdes);
}
