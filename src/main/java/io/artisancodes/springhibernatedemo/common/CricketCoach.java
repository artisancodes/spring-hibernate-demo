package io.artisancodes.springhibernatedemo.common;

import org.springframework.stereotype.Component;

// @Component annotation marks the class as a Spring bean makes it available for Dependency Injection.
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes :)";
    }
}
