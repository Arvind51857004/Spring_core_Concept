package coreannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ece")
public class ECE {
 
	
	private Sec_A sec;
	
	private Sec_A sec1;
	
	private int deptid;
	
	@Autowired
	public ECE(Sec_A sec,Sec_A sec1, @Value("1") int deptid) {
		this.sec = sec;
		this.sec1=sec1;
		this.deptid = deptid;
	}
	
	public Sec_A getSec1() {
		return sec1;
	}

	public void setSec1(Sec_A sec1) {
		this.sec1 = sec1;
	}

	public Sec_A getSec() {
		return sec;
	}
	public void setSec(Sec_A sec) {
		this.sec = sec;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	@Override
	public String toString() {
		return "ECE [sec=" + sec + ", sec1=" + sec1 + ", deptid=" + deptid + "]";
	}

	
	
	
	
	
	
	

}
