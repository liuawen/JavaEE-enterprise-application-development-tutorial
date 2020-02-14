package com.awen.scope;
import org.springframework.context.ApplicationContext;
import 
	org.springframework.context.support.ClassPathXmlApplicationContext;
public class ScopeTest {
	public static void main(String[] args) {
		// 定义配置文件路径
		//String xmlPath = "com/awen/scope/beans4.xml";
		// 加载配置文件
//		ApplicationContext applicationContext =
//					new ClassPathXmlApplicationContext(xmlPath);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans4.xml");
		// 输出获得实例
		System.out.println(applicationContext.getBean("scope"));
		System.out.println(applicationContext.getBean("scope"));
		System.out.println(applicationContext.getBean("scope") == applicationContext.getBean("scope")  );

		Scope scope = (Scope)applicationContext.getBean("scope");
		Scope scope2= (Scope) applicationContext.getBean("scope");
		System.out.println(scope == scope2);
	}
}
