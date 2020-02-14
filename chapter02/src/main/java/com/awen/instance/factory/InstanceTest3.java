package com.awen.instance.factory;
import org.springframework.context.ApplicationContext;
import 
	org.springframework.context.support.ClassPathXmlApplicationContext;
public class InstanceTest3 {
	public static void main(String[] args) {
//		// 指定配置文件路径
//		String xmlPath = "com/awen/instance/factory/beans3.xml";
//		// ApplicationContext在加载配置文件时，对Bean进行实例化
//		ApplicationContext applicationContext =
//				new ClassPathXmlApplicationContext(xmlPath);
		// ApplicationContext在加载配置文件时，对Bean进行实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans3.xml");
		System.out.println(applicationContext.getBean("bean3"));
	}
} 
