package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;

@Component("testUserService")
public class TestUserService {

	@Autowired
	public UserServiceInt service = null;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		TestUserService test = (TestUserService) context.getBean("testUserService");

		// test.testAdd();
		// test.testUpdate();
		test.testFindByPk();
	}

	public void testFindByPk() {
		UserDTO dto = service.findByPk(4L);
		if (dto != null) {
			System.out.print(dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.println("\t" + dto.getPassword());
		} else {
			System.out.println("User-Id dose'nt exist!!!");
		}
	}

	public void testUpdate() {
		UserDTO dto = new UserDTO();
		dto.setId(2L);
		dto.setFirstName("Earth");
		dto.setLastName("Shaker");
		dto.setLoginId("es@test.com");
		dto.setPassword("pass@123");

		service.update(dto);
		System.out.println("Data Updated Successfully!!!");
	}

	public void testAdd() {
		UserDTO dto = new UserDTO();
		// dto.setId(4L);
		dto.setFirstName("Jamlaa");
		dto.setLastName("Jamloo");
		dto.setLoginId("jj@test.com");
		dto.setPassword("pass@123");
		long pk = service.add(dto);
		System.out.println("Data Added : Successfully!!!");
	}

}
