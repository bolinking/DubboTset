package com.test.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.api.service.DubboService;

public class Consumer {
  
	public static void main (String[] args){
		ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DubboService demoService = context.getBean(DubboService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
	}
}
