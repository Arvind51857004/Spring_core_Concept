package coreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		System.out.println("context loaded successfully");
		College coll=context.getBean("Arvindobj",College.class);//simple 
		coll.test();
		System.out.println(coll.getName());
		ECE ece=context.getBean("ece",ECE.class);  //Mid complex
		System.out.println("ece dept object created: "+ece);
		
		
		
		

	}

}
