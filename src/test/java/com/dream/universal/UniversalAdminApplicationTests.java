package com.dream.universal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dream.universal.mapper.RedisDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UniversalAdminApplicationTests {
	@Autowired
    RedisDao redisDao;

	@Test
	public void contextLoads() {
		redisDao.setKey("name","forezp");
        redisDao.setKey("age","11");
        System.out.println(redisDao.getValue("name"));
        System.out.println(redisDao.getValue("age"));
	}

}
