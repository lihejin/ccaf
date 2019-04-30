package com.ccaf.dao;

import com.ccaf.domain.ParmTypeDO;

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
public interface ParmTypeDao {

	ParmTypeDO get(String prmTypCde);
	
	List<ParmTypeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ParmTypeDO parmType);
	
	int update(ParmTypeDO parmType);
	
	int remove(String prm_typ_cde);
	
	int batchRemove(String[] prmTypCdes);
}
