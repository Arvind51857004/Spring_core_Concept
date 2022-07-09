package coreannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Arvindobj")
public class College {
	
	//@Value("Arvind")
	private String name;
	
	
	
	
	public College(@Value("Arvind")String name) {  //constructor Injection
		this.name = name;
	}

      public String getName() 
	  { 
		  return name; 
	  }
      
	 /* @Value("Arvind") //setter injection
	 * public void setName(String name) {
	 * this.name = name; }
	 */
	
	  public void test() 
	  { 
		System.out.println("test working fine"); 
      }
	 
	
	

}
