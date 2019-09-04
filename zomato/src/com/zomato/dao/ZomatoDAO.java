package com.zomato.dao;

import com.zomato.entity.ZomatoEmployee;

public class ZomatoDAO implements ZomatoDAOInterface
{

	public static ZomatoDAOInterface createObject() {
		// TODO Auto-generated method stub
		return new ZomatoDAO();
	}

	@Override
	public int createProfileDAO(ZomatoEmployee ze) {
		// TODO Auto-generated method stub
		return 1;
	}

}
