package springs_annotaions_employee;

import org.springframework.stereotype.Component;

@Component
public class SBI implements BankAccount {
	public void balance() {
		System.out.println("10000");
	}
}
