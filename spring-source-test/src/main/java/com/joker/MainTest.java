package com.joker;

import com.joker.bean.Display;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.HashMap;
import java.util.Map;

@EnableTransactionManagement
public class MainTest {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Person bean = context.getBean(Person.class);
//		System.out.println(bean);
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
//		Display display = (Display)context.getBean("display");
//		display.display();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ClassPathResource resource = new ClassPathResource("beans.xml");
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(new DefaultListableBeanFactory());
		reader.loadBeanDefinitions(resource);
		Map<Integer,Integer> map = new HashMap<>();
	}
}
