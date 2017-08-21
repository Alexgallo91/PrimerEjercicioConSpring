package com.beginner.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beginner.beans.Mundo;

public class App {
	public static void main(String []args)
	{
		//ApplicationContext appContext = new ClassPathXmlApplicationContext(
		//		"com/beginner/xml/beans.xml");
		
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig2.class);
		appContext.register(AppConfig.class);
		appContext.refresh();
		
		Mundo m = (Mundo)appContext.getBean("mundo");
		Mundo e = (Mundo)appContext.getBean("marte");
		
		System.out.println(m.getSaludo());
		System.out.println("Marte: " + e.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
