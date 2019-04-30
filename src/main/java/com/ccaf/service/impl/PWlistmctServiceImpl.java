package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ccaf.dao.PWlistmctDao;
import com.ccaf.domain.PWlistmctDO;
import com.ccaf.service.PWlistmctService;



@Service
public class PWlistmctServiceImpl implements PWlistmctService {
	@Autowired
	private PWlistmctDao pWlistmctDao;
	
	@Override
	public PWlistmctDO get(String mctId){
		return pWlistmctDao.get(mctId);
	}
	
	@Override
	public List<PWlistmctDO> list(Map<String, Object> map){
		return pWlistmctDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return pWlistmctDao.count(map);
	}
	
	@Override
	public int save(PWlistmctDO pWlistmct){
		return pWlistmctDao.save(pWlistmct);
	}
	
	@Override
	public int update(PWlistmctDO pWlistmct){
		return pWlistmctDao.update(pWlistmct);
	}
	
	@Override
	public int remove(String mctId){
		return pWlistmctDao.remove(mctId);
	}
	
	@Override
	public int batchRemove(String[] mctIds){
		return pWlistmctDao.batchRemove(mctIds);
	}
	
}
