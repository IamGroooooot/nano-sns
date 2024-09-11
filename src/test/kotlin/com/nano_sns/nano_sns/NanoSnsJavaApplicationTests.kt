package com.nano_sns.nano_sns

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersKTConfiguration::class)
@SpringBootTest
class NanoSnsJavaApplicationTests {

	@Test
	fun contextLoads() {
	}

}
