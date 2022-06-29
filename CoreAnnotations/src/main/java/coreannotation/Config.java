package coreannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "coreannotation")
public class Config {
	
	/*
	 * @Bean(name ="collegeob") public College obj() { College college=new
	 * College(); return college; }
	 * 
	 * @Bean(name="collegeob2") public College obj1() { return new College(); }
	 */
}
