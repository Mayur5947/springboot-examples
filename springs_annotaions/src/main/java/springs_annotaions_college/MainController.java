package springs_annotaions_college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(Config.class);
		College college = applicationContext.getBean("college",College.class);
		college.details();	
	}
}
