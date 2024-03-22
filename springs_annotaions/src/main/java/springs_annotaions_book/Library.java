package springs_annotaions_book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {

	@Autowired
	Book book;
	public void deatils() {
		book.nameOfBook();
	}
}
