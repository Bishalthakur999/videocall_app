package com.bishal.videocall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bishal.videocall.user.User;
import com.bishal.videocall.user.UserService;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}
		@Bean
		public CommandLineRunner commandLineRunner(
				UserService service
		) {
			return args -> {
				service.register(User.builder()
								.username("bishal")
								.email("bishal@gmail.com")
								.password("bishal")
						.build());

				service.register(User.builder()
						.username("priyanshi")
						.email("priyanshi@gmail.com")
						.password("priyanshi")
						.build());

				service.register(User.builder()
						.username("pranvi")
						.email("pranvi@gmail.com")
						.password("pranvi")
						.build());
			};
	}

}
