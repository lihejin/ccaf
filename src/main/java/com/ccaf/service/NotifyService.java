package com.ccaf.service;


import com.ccaf.domain.NotifyDO;
import com.ccaf.domain.NotifyDTO;
import com.ccaf.util.PageUtils;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-12 17:59:16
 */
public interface NotifyService {

	NotifyDO get(Long id);

	List<NotifyDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(NotifyDO notify);

	int update(NotifyDO notify);

	int remove(Long id);

	int batchRemove(Long[] ids);

//	Map<String, Object> message(Long userId);

	PageUtils selfList(Map<String, Object> map);

	NotifyDTO prjLatestNotify(Long projectId);

	NotifyDTO personLatestNotify();
}
