package com.ccaf.dao;

import com.ccaf.domain.NotifyDO;
import com.ccaf.domain.NotifyDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-12 17:59:16
 */
@Mapper
public interface NotifyDao {

	NotifyDO get(Long id);

	List<NotifyDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(NotifyDO notify);

	int update(NotifyDO notify);

	int remove(Long id);

	int batchRemove(Long[] ids);

	List<NotifyDO> listByIds(Long[] ids);

	int countDTO(Map<String, Object> map);

	List<NotifyDTO> listDTO(Map<String, Object> map);

	NotifyDTO prjLatestNotify(Long projectId);

	NotifyDTO personLatestNotify(@Param("type") String type, @Param("userId") Long userId);
}
