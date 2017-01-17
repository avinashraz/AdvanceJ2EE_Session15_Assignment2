package com.name.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");  
		  Country countryObj = (Country) appContext.getBean("country");  
		  System.out.println("Capital Name:"+countryObj.getCapitalName("capital"));  

		
		
		
	}
}
