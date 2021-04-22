/**
 * 
 */
package com.iloads.demo.demo.another;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iloads.demo.demo.dao.UserDao;
import com.iloads.demo.demo.domain.UserDetail;
import com.iloads.demo.demo.service.impl.UserServiceImpl;

/**
 * @author WDSI - Arockiasamy
 *
 */
@ExtendWith(MockitoExtension.class)
public class AnotherClass {
	
	@Mock UserDao userDao;
	
	@InjectMocks private UserServiceImpl userService;
	
	@DisplayName("Add Service Test")
	@Test
	public void addServiceTest() {
		when(userDao.add(Mockito.any(UserDetail.class))).thenReturn(true);
		UserDetail userDetail = new UserDetail(1, "kasama", 45);
		Assertions.assertNotEquals(userDetail, userService.add(userDetail));
		userDetail = new UserDetail(3, "nenuka", 33);
	}

}
