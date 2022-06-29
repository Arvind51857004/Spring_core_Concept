package complexexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class MobileData implements Data {
	
	
	private ServiceProvider service;
	
	
	
    @Autowired
    @Qualifier("airtel")
	public void setService(ServiceProvider service) {
		this.service = service;
	}



	public void data(String value) {
		// TODO Auto-generated method stub
		System.out.println("service object is: "+this.service);
		service.call(value);
	}

    

}
