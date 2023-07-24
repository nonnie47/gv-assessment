package com.gigvistas.assessment;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AssessmentApplication {

	@Bean
    public ModelMapper modelMapper() {
    return new ModelMapper();
    }

	public static void main(String[] args) {
		SpringApplication.run(AssessmentApplication.class, args);
	}

}
