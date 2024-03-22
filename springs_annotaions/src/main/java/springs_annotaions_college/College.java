package springs_annotaions_college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Autowired
	Student student;
	public void details() {
		student.stream();
	}
}
