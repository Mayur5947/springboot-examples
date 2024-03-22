package springs_annotaions_employee;

import org.springframework.stereotype.Component;

@Component
public class ICICI implements BankAccount{
	public void balance() {
		System.out.println("20000");
	}
}
