package com.ccaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccaf.dao.CardDao;
import com.ccaf.service.CardService;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ccaf.domain.CardDO;


@Service
public class CardServiceImpl implements CardService {
	@Autowired
	private CardDao cardDao;
	
	@Override
	public CardDO get(String panTxt){
		return cardDao.get(panTxt);
	}
	
	@Override
	public List<CardDO> list(Map<String, Object> map){
		return cardDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return cardDao.count(map);
	}
	
	@Override
	public int save(CardDO card){
		return cardDao.save(card);
	}
	
	@Override
	public int update(CardDO card){
		return cardDao.update(card);
	}
	
	@Override
	public int remove(Date lstUpdTtp){
		return cardDao.remove(lstUpdTtp);
	}
	
	@Override
	public int batchRemove(Date[] lstUpdTtps){
		return cardDao.batchRemove(lstUpdTtps);
	}
	
}
