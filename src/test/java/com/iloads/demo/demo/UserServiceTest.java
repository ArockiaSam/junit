/**
 * 
 */
package com.iloads.demo.demo;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
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
//@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
	
	@Mock UserDao userDao;
	
	@InjectMocks private UserServiceImpl userService;
	 

	/*
	 * @BeforeEach public void initialMethod() { userService = new
	 * UserServiceImpl(userDao); }
	 */

	@DisplayName("Add Service Test")
	@Test
	public void addServiceTest() {
		when(userDao.add(Mockito.any(UserDetail.class))).thenReturn(true);
		UserDetail userDetail = new UserDetail(1, "kasama", 45);
		Assertions.assertEquals(userDetail, userService.add(userDetail));
		userDetail = new UserDetail(3, "nenuka", 33);
	//	Assertions.assertEquals(userDetail, userService.add(userDetail));
		/*userDetail = new UserDetail(2, "nenukaf", 3);
		Assertions.assertEquals(userDetail, userService.add(userDetail));*/
		System.out.println("arockia");
		/*Assertions.assertDoesNotThrow(new Executable() {
			@Override
			public void execute() throws Throwable {
				UserDetail userDetail = new UserDetail(2, "nenukaf", 73);
				System.out.println("sdfdskl;");
				userService.add(userDetail);
				//throw new Exception("somethind went wrong");
			}
		});*/
		
//		Assertions.assert
	}

	
	  @Test public void addServiceTests() { UserDetail userDetail = new
	  UserDetail(1, "kasama", 55);
	  when(userDao.add(Mockito.any(UserDetail.class))).thenReturn(true);
	  
	  Assertions.assertEquals(userDetail, userService.add(userDetail)); 
	  userDetail = new UserDetail(3, "nenuka", 23); 
	  Assertions.assertEquals(userDetail,userService.add(userDetail)); 
	  userDetail = new UserDetail(2, "nenukaf", 43);
	  Assertions.assertEquals(userDetail, userService.add(userDetail)); 
	  }
	 
}
