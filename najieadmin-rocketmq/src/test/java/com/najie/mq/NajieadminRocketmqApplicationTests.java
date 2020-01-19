package com.najie.mq;

import java.util.HashMap;
import java.util.Map;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NajieadminRocketmqApplicationTests {
    
	@Autowired
	RocketMQTemplate rocketMQTemplate;
	
	@Test
	public void contextLoads() {
		Map<String,Object> map = new HashMap<>();
		map.put("user_id", "123456789");
		map.put("user_name", "张三");
		map.put("user_addr", "湖北武汉");
		rocketMQTemplate.convertAndSend("test-topic-1", map);
		System.out.println("===消息发送成功===");
	}

}
