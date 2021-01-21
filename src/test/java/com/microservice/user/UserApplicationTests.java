package com.microservice.user;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserApplicationTests {

	@BeforeAll
	public void beforeme() {
		System.out.println("YAY");
	}

	@Test
	void contextLoads() {
	}

}
