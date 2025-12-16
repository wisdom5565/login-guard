package com.loginguard.login_guard;

import org.springframework.boot.SpringApplication;

public class TestLoginGuardApplication {

	public static void main(String[] args) {
		SpringApplication.from(LoginGuardApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
