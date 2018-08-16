package io.aim.event.story;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class EventStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventStoreApplication.class, args);
	}
}
