package com.example.Microservices;

import com.example.Microservices.MyRepository.MyRepository;
import com.example.Microservices.MyServices.MyServices;
import com.example.Microservices.dto.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class MicroservicesApplicationTests {
	@Autowired
	private MyServices myServices;

	@MockBean
	private MyRepository myRepository;

	@Test
	void Test_addUser() {
		User user = new User();
		user.setFirstName("Abhinav");
		user.setLastName("Sharma");

		when(myRepository.save(user)).thenReturn(user);

		assertEquals(user, myServices.addU(user));
	}

	@Test
	void Test_getUser() throws Exception {
		User user = new User();
		user.setId(2);
		user.setLastName("Abhinav");
		user.setLastName("Sharma");

		when(myRepository.findById(2)).thenReturn(Optional.of(user));

		assertEquals(user, myServices.getU(2));
	}

//	@Test
//	void Test_getUserByInvalidId() {
//		assertEquals("User doesn't exist", myServices.getU(123));
//	}

}
