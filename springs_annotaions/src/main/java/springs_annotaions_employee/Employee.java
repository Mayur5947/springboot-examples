package springs_annotaions_employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Autowired
	//@Qualifier("ICICI")
	BankAccount account;
	public void check() {
		account.balance();
	}
}
