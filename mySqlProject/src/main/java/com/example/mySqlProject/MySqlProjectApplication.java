package com.example.mySqlProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan("com.example.mySqlProject") // 指定实体类和 Repository 接口所在的包
public class MySqlProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlProjectApplication.class, args);
	}

}
