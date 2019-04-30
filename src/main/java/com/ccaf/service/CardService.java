package com.ccaf.service;

import com.ccaf.domain.CardDO;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-25 15:24:42
 */
public interface CardService {
	
	CardDO get(String panTxt);
	
	List<CardDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CardDO card);
	
	int update(CardDO card);
	
	int remove(Date lstUpdTtp);
	
	int batchRemove(Date[] lstUpdTtps);
}
