package com.ccaf.dao;

import com.ccaf.domain.SltactbkDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
@Mapper
public interface SltactbkDao {

	SltactbkDO get(String actIdnSky);
	
	List<SltactbkDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SltactbkDO sltactbk);
	
	int update(SltactbkDO sltactbk);
	
	int remove(String act_idn_sky);
	
	int batchRemove(String[] actIdnSkys);
}
