package com.example.demospringboot32;

import jakarta.validation.Validator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
public class WebConfig {

    // MethodValidationException
    @Bean
    public static MethodValidationPostProcessor validationPostProcessor(Validator validator) {
        MethodValidationPostProcessor processor = new MethodValidationPostProcessor();
        processor.setAdaptConstraintViolations(true);
        processor.setValidator(validator);
        return processor;
    }

}
