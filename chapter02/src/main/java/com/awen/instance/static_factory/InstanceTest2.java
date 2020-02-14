package com.awen.instance.static_factory;
import org.springframework.context.ApplicationContext;
import 
	org.springframework.context.support.ClassPathXmlApplicationContext;
public class InstanceTest2 {
	public static void main(String[] args) {
		// 定义配置文件路径
		String xmlPath = 
				"com/awen/instance/static_factory/beans2.xml";
		// ApplicationContext在加载配置文件时，对Bean进行实例化
//		ApplicationContext applicationContext =
//				new ClassPathXmlApplicationContext(xmlPath);
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("beans2.xml");
		System.out.println(applicationContext.getBean("bean2"));
	}
}
