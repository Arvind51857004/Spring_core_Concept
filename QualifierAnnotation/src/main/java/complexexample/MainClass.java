package complexexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Common.Config;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
		System.out.println("Context loaded successfully");
	     Data providers=context.getBean(Data.class);
	    System.out.println(providers);
	    providers.data("5g Data");
	    
	    
		
	}}
