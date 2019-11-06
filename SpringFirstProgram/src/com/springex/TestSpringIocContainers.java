package com.springex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.springex.domain.Employee;

public class TestSpringIocContainers {

	public static void main(String[] args) {
		Resource res = new FileSystemResource("employee.xml");

		BeanFactory beanfactory = new XmlBeanFactory(res);

		Employee e = (Employee) beanfactory.getBean("emp");
		System.out.println(e);
	}
}
