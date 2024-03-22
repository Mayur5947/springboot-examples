package springs_annotaions_employee;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HDFC implements BankAccount{
	public void balance() {
		System.out.println("30000");
	}
}
