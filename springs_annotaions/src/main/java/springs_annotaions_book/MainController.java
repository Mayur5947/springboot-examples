package springs_annotaions_book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(Config.class);
		Library library = applicationContext.getBean("library",Library.class);
		library.deatils();
	}
}
