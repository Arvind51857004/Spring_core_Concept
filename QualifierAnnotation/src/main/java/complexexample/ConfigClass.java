package complexexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="complexexample")
public class ConfigClass {

	 @Bean
	  public ServiceProvider airtel() {
		  return new Airtel();
	  }
	  
	  @Bean
	  public Jio Jio() {
		  return new Jio();
	  }
	  
	  @Bean(name="md")
	  public Data md() {
		  return new MobileData();
	  }
}
