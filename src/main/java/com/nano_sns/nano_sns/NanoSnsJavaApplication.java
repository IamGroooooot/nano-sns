package com.nano_sns.nano_sns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.nano_sns", exclude = { SecurityAutoConfiguration.class })
public class NanoSnsJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NanoSnsJavaApplication.class, args);
	}

}
