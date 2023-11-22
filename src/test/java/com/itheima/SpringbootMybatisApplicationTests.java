package com.itheima;

import com.itheima.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringbootMybatisApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void getUserDao() {
		System.out.println(userDao.selectByID(2));
	}
}
