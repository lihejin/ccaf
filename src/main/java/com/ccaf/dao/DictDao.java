package com.ccaf.dao;

import com.ccaf.domain.DictDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 字典表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-03 15:45:42
 */
@Mapper
public interface DictDao {

	DictDO get(Long id);

	List<DictDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(DictDO dict);

	int update(DictDO dict);

	int remove(Long id);

	int batchRemove(Long[] ids);

	List<DictDO> listType();

	String findNameByTypeAndValue(@Param("type") String type, @Param("value") String value);

	String findValueByTypeAndName(@Param("type") String type, @Param("name") String name);

	DictDO queryBuildDetail(String name);

    List<Map<String,Object>> getProvince();

    List<Map<String,Object>> getCity(Map<String, Object> map);

    String getArea(String s);

	String findCityBycityid(String cityid);

	String findProvinceByprovinceid(String provinceid);

	String findParentName(@Param("type") String type, @Param("value") String value);

	String findParentValue(@Param("type") String type, @Param("name") String name);

    List<Map<String,Object>> getCounty(Map<String, Object> map);

	List<Map<String,Object>> getProvinceCityAndCounty(Map<String, Object> map);

	Map<String,String> transferLocation(Map<String, String> map);
}
