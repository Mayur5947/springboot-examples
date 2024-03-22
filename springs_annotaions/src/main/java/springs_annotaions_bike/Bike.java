package springs_annotaions_bike;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	@PostConstruct
	public void start() {
		System.out.println("start the bike");
	}
	public void used() {
		System.out.println("ready to ride");
	}
	@PreDestroy
	public void stop() {
		System.out.println("stop bike");
	}
}
