/**
 * 
 */
package com.iloads.demo.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iloads.demo.demo.dao.UserDao;
import com.iloads.demo.demo.domain.UserDetail;
import com.iloads.demo.demo.service.UserService;
import com.iloads.demo.demo.service.impl.UserServiceImpl;

/**
 * @author WDSI - Arockiasamy
 *
 */
@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class UserServiceTestB {

	@Mock
	private UserDao userDao;
	
	@InjectMocks
	@Autowired
	private UserService userService = new UserServiceImpl();

	@Test
	public void testMethod() {
		 Assertions.assertDoesNotThrow(new Executable() {
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				when(userDao.add(Mockito.any())).thenReturn(false);
				
				UserDetail userDetail = userService.add(new UserDetail(1, "sd", 63));
				assertNotNull(userDetail);
			}
		});
		/*when(userDao.add(Mockito.any())).thenReturn(false);
		
		UserDetail userDetail = userService.add(new UserDetail(1, "sd", 63));
		assertNotNull(userDetail);*/
	}
}
