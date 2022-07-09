package complexexample;

import org.springframework.stereotype.Component;


public class Jio implements ServiceProvider {

	public void call(String name) {
		// TODO Auto-generated method stub
         System.out.println(name);
         System.out.println("I'm Jio");
	}

}
