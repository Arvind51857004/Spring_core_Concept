package Common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("princi")
public class Principal {
	
	
	private Student student;
	private int id;
	
	
	public void accessmethod() {
		student.test();
	}
	
	public Student getStudent() {
		return student;
	}
	
	
	
	@Autowired
	@Qualifier("arvind")
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}
	
	@Value("10")
	public void setId(int id) {
		this.id = id;
	}
	
	

}
