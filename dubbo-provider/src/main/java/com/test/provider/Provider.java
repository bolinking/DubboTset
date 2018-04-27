package com.test.provider;
import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext; 
public class Provider {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"provider.xml","spring-mybatis.xml"}); 
		System.out.println(applicationContext.getDisplayName() + ": here");
		applicationContext.start();
        System.out.println("服务已经启动...");
        System.in.read();
	}
}
