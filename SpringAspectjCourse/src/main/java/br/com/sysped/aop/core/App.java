package br.com.sysped.aop.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.sysped.aop.service.CustomerService;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		CustomerService customer = (CustomerService) appContext.getBean("customerService");
		customer.addCustomer();
		
//		customer.addCustomerReturnValue();
		
//		customer.addCustomerThrowException();
		
//		customer.addCustomerAround("mkyong");

	}
}