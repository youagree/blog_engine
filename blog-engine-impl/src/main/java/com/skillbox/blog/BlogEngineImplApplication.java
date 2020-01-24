package com.skillbox.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BlogEngineImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogEngineImplApplication.class, args);
		log.info("Version: {}", BlogEngineImplApplication.class.getPackage().getImplementationVersion());
	}
}
