package com.dize;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// @ComponentScan(basePackages = {"br.com.dyze"})
@SpringBootApplication
public class Application {

	
// 	@Override
//     protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//         return application.sources(Application.class);
//     }


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
