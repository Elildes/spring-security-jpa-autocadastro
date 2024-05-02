package br.com.ufrn.imd.securityexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= "br.com.ufrn.imd")
public class SecurityexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityexampleApplication.class, args);
	}

}
