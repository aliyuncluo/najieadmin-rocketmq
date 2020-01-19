package com.najie.mq.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

@Service
@RocketMQMessageListener(topic = "test-topic-1", consumerGroup = "my-consumer_test-topic-1")
public class RocketMQEventConsumer implements RocketMQListener<Object>{

	@Override
	public void onMessage(Object message) {
		System.out.println("接收到的消息为："+JSON.toJSONString(message));
		
	}

}
