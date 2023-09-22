package io.artisancodes.springhibernatedemo.rest;

import io.artisancodes.springhibernatedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Autowiring
 * - Injecting a Coach implementation
 * - Spring will scan @Components
 * - Any one implements Coach interface
 * - If so, let's inject them... oops which one?
 *
 * Use @Qualifier annotation to specify the bean id: cricketCoach
 * Same name of the class, first character lower-case
 */
@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
