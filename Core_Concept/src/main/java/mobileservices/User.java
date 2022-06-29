package mobileservices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String value="Beans.xml"; 
        ApplicationContext con= new ClassPathXmlApplicationContext(value);
		  System.out.println("application context loaded");
		  Sim sim=con.getBean("Airtel",Airtel.class); //sim sim=new jio(); 
		  sim.callservice();
		 
		
		
		
		
		

	}

}
