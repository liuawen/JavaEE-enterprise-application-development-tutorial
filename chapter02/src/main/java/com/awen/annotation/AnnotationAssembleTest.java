package com.awen.annotation;
import org.springframework.context.ApplicationContext;
import 
   org.springframework.context.support.ClassPathXmlApplicationContext;
public class AnnotationAssembleTest {
	public static void main(String[] args) {
//		// 指定配置文件路径
//		String xmlPath = "com/awen/annotation/beans6.xml";
////		// ApplicationContext在加载配置文件时，对Bean进行实例化
//		ApplicationContext applicationContext =
//				new ClassPathXmlApplicationContext(xmlPath);
		// 加载配置文件
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("beans6.xml");
		// 获取UserController实例
		UserController userController =
		  (UserController) applicationContext.getBean("userController");
		// 调用UserController中的save()方法
		userController.save();
	}
}  
