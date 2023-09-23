package io.artisancodes.springhibernatedemo.config;

import io.artisancodes.springhibernatedemo.common.Coach;
import io.artisancodes.springhibernatedemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
