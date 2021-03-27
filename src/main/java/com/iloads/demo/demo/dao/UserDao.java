/**
 * 
 */
package com.iloads.demo.demo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.iloads.demo.demo.domain.UserDetail;

/**
 * @author WDSI - Arockiasamy
 *
 */
@Repository
public class UserDao {

	Map<Integer, UserDetail> storage = new HashMap<>();
	
	public Boolean add(UserDetail userDetail) {
		storage.put(userDetail.getId(), userDetail);
		return true;
	}
	
	public UserDetail getById(Integer id) {
		return storage.get(id);
	}
}
