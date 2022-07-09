package Common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		System.out.println("context loaded success");
		Principal princi=context.getBean("princi",Principal.class);
		System.out.println(princi);
		princi.accessmethod();
		

	}

}
