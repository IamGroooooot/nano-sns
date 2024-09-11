package com.nano_sns.nano_sns

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<NanoSnsJavaApplication>().with(TestcontainersKTConfiguration::class).run(*args)
}
