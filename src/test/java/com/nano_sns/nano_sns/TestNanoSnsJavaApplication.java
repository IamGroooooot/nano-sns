package com.nano_sns.nano_sns;

import org.springframework.boot.SpringApplication;

public class TestNanoSnsJavaApplication {

	public static void main(String[] args) {
		SpringApplication.from(TestNanoSnsJavaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
