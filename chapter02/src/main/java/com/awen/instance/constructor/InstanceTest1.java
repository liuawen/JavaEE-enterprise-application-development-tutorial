package com.awen.instance.constructor;
import org.springframework.context.ApplicationContext;
import 
	org.springframework.context.support.ClassPathXmlApplicationContext;
public class InstanceTest1 {
	public static void main(String[] args) {


		// ApplicationContext在加载配置文件时，对Bean进行实例化
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("beans1.xml");
		Bean1 bean = (Bean1) applicationContext.getBean("bean1");
         System.out.println(bean);
	}
}
