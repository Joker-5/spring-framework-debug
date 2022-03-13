package com.joker;

import com.joker.bean.Display;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class MainTest {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Person bean = context.getBean(Person.class);
//		System.out.println(bean);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
		Display display = (Display)context.getBean("display");
		display.display();
	}
}
