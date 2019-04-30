package com.ccaf.service;

import com.ccaf.domain.AwaitqHistDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public interface AwaitqHistService {
	
	AwaitqHistDO get(String panTxt);
	
	List<AwaitqHistDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AwaitqHistDO awaitqHist);
	
	int update(AwaitqHistDO awaitqHist);
	
	int remove(String panTxt);
	
	int batchRemove(String[] panTxts);
}
