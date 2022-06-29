package coreannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sec_A {
	
	private String staffname;
	private int staffid;
	
	public String getStaffname() {
		return staffname;
	}
	
	@Value("sivaranjini")
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	
	public int getStaffid() {
		return staffid;
	}
	
	@Value("10")
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	@Override
	public String toString() {
		return "Sec_A [staffname=" + staffname + ", staffid=" + staffid + "]";
	}
	

}
