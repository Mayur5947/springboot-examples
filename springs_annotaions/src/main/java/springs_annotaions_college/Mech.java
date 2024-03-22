package springs_annotaions_college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mech implements Student {
	public void stream() {
		System.out.println("Mechanical Boyz");
	}
}
