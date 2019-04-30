package com.ccaf.service.impl;

import com.ccaf.dao.DictDao;
import com.ccaf.domain.DictDO;
import com.ccaf.domain.UserDO;
import com.ccaf.service.DictService;
import com.ccaf.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Service
public class DictServiceImpl implements DictService {
    @Autowired
    private DictDao dictDao;

    @Override
    public DictDO get(Long id) {
        return dictDao.get(id);
    }

    @Override
    public List<DictDO> list(Map<String, Object> map) {
        return dictDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return dictDao.count(map);
    }

    @Override
    public int save(DictDO dict) {
        return dictDao.save(dict);
    }

    @Override
    public int update(DictDO dict) {
        return dictDao.update(dict);
    }

    @Override
    public int remove(Long id) {
        return dictDao.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids) {
        return dictDao.batchRemove(ids);
    }

    @Override

    public List<DictDO> listType() {
        return dictDao.listType();
    }

    @Override
    public String getName(String type, String value) {
        String rString = "";
        Map<String, Object> param = new HashMap<String, Object>(16);
        param.put("type", type);
        param.put("value", StringUtils.isNotBlank(value)?value:" ");
        List<DictDO> list = dictDao.list(param);
        if (list != null && list.size() > 0) {
            rString = dictDao.list(param).get(0).getName();
        }
        return rString;
    }

    @Override
    public String findCityBycityid(String provinceid) {
        return dictDao.findCityBycityid(provinceid);
    }

    @Override
    public String findProvinceByprovinceid(String provinceid) {
        return dictDao.findProvinceByprovinceid(provinceid);
    }

    @Override
    public List<DictDO> getHobbyList(UserDO userDO) {
        Map<String, Object> param = new HashMap<>(16);
        param.put("type", "hobby");
        List<DictDO> hobbyList = dictDao.list(param);

        if (StringUtils.isNotEmpty(userDO.getHobby())) {
            String userHobbys[] = userDO.getHobby().split(";");
            for (String userHobby : userHobbys) {
                for (DictDO hobby : hobbyList) {
                    if (!Objects.equals(userHobby, hobby.getId().toString())) {
                        continue;
                    }
                    hobby.setRemarks("true");
                    break;
                }
            }
        }

        return hobbyList;
    }

    @Override
    public List<DictDO> getSexList() {
        Map<String, Object> param = new HashMap<>(16);
        param.put("type", "sex");
        return dictDao.list(param);
    }

    @Override
    public List<DictDO> listByType(String type) {
        Map<String, Object> param = new HashMap<>(16);
        param.put("type", type);
        return dictDao.list(param);
    }

    @Override
    public String findNameByTypeAndValue(String type, String value) {
        return dictDao.findNameByTypeAndValue(type,value);
    }

    @Override
    public String findValueByTypeAndName(String type, String name) {
        return dictDao.findValueByTypeAndName(type,name);
    }

    @Override
    public List<Map<String, Object>> getProvince() {
        return dictDao.getProvince();
    }

    @Override
    public List<Map<String, Object>> getCity(Map<String, Object> map) {
        return dictDao.getCity(map);
    }

    public DictDO queryBuildDetail(String name){
        return dictDao.queryBuildDetail(name);
    }

    @Override
    public String findParentName( String type, String value) {
        return dictDao.findParentName(type,value);
    }
    @Override
    public String findParentValue( String type, String name) {
        return dictDao.findParentValue(type,name);
    }

    @Override
    public List<Map<String, Object>> getCounty(Map<String, Object> map) {
        return dictDao.getCounty(map);
    }

    @Override
    public List<Map<String, Object>> getProvinceCityAndCounty(Map<String, Object> map) {
        return dictDao.getProvinceCityAndCounty(map);
    }


}
