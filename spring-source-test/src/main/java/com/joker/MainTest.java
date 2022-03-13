package com.joker;

import com.joker.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.HashSet;
import java.util.Set;

@EnableTransactionManagement
public class MainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
