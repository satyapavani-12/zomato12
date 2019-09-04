package com.zomato.service;

import com.zomato.dao.ZomatoDAO;
import com.zomato.dao.ZomatoDAOInterface;
import com.zomato.entity.ZomatoEmployee;

public class ZomatoService implements ZomatoServiceInterface
{

	public static ZomatoServiceInterface createServiceObject() 
	{

		return new ZomatoService();
	}

	@Override
	public int createProfile(ZomatoEmployee ze) {
		ZomatoDAOInterface zd=ZomatoDAO.createObject();
		return zd.createProfileDAO(ze);
	}

}
