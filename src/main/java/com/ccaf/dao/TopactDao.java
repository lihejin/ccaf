package com.ccaf.dao;

import com.ccaf.domain.TopactDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:10
 */
@Mapper
public interface TopactDao {

	TopactDO get(String actIdnSky);
	
	List<TopactDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TopactDO topact);
	
	int update(TopactDO topact);
	
	int remove(String act_idn_sky);
	
	int batchRemove(String[] actIdnSkys);
}
