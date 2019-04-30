package com.ccaf.service;


import com.ccaf.domain.DictDO;
import com.ccaf.domain.UserDO;

import java.util.List;
import java.util.Map;

/**
 * 字典表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-09-29 18:28:07
 */
public interface DictService {
	
	DictDO get(Long id);
	
	List<DictDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DictDO dict);
	
	int update(DictDO dict);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	List<DictDO> listType();
	
	String getName(String type, String value);

	String findCityBycityid(String cityid);

	String findProvinceByprovinceid(String provinceid);

	/**
	 * 获取爱好列表
	 * @return
     * @param userDO
	 */
	List<DictDO> getHobbyList(UserDO userDO);

	/**
	 * 获取性别列表
 	 * @return
	 */
	List<DictDO> getSexList();

	/**
	 * 根据type获取数据
	 * @param type
	 * @return
	 */
	List<DictDO> listByType(String type);

	String findNameByTypeAndValue(String type, String value);

	String findValueByTypeAndName(String name, String value);


	List<Map<String,Object>> getProvince();

	List<Map<String,Object>> getCity(Map<String, Object> map);

	String findParentName(String type, String value);

	String findParentValue(String type, String value);

    List<Map<String,Object>> getCounty(Map<String, Object> map);

	List<Map<String,Object>> getProvinceCityAndCounty(Map<String, Object> map);
}
