package com.joker.utils;/*
 *项目名: spring
 *文件名: BeanEntrance
 *创建者: Joker
 *创建时间:2022/1/31 19:37
 *描述:

 */

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanEntrance {
	public static void loadBeanDefinitionEntrance(String configLocation) {
		// 1.获取资源
		ClassPathResource resource = new ClassPathResource(configLocation);
		// 2.获取BeanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// 3.根据BeanFactory创建BeanDefinitionReader对象，充当资源的解析器
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		// 4.装载资源
		reader.loadBeanDefinitions(resource);
	}
}
