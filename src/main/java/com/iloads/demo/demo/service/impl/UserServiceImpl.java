/**
 * 
 */
package com.iloads.demo.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iloads.demo.demo.dao.UserDao;
import com.iloads.demo.demo.domain.UserDetail;
import com.iloads.demo.demo.service.AddressService;
import com.iloads.demo.demo.service.UserService;

/**
 * @author WDSI - Arockiasamy
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private AddressService addressService;
	
	/*public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}*/
	
	@Override
	public UserDetail add(UserDetail userDetail) {
		if(userDetail.getAge() < 10)
			return null;
		
		boolean addResult = userDao.add(userDetail);
		
	 	/*String s = addressService.getString();
	 	userDetail.setName(s);*/
		return userDetail;
	}

}
