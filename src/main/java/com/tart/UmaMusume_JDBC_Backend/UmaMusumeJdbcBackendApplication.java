package com.tart.UmaMusume_JDBC_Backend;

import com.tart.Repository.UmaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UmaMusumeJdbcBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmaMusumeJdbcBackendApplication.class, args);

        UmaRepository newRepo = new UmaRepository();

        newRepo.InsertUmamusume("Pay the Butler", 1984, true);
	}

}
