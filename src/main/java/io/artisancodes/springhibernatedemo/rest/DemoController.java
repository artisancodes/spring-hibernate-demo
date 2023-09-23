package io.artisancodes.springhibernatedemo.rest;

import io.artisancodes.springhibernatedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

//    private Coach anotherCoach;

//    @Autowired
//    public DemoController(
//            @Qualifier("cricketCoach") Coach theCoach,
//            @Qualifier("cricketCoach") Coach theAnotherCoach) {
//        System.out.println("In constructor: " + getClass().getSimpleName());
//        myCoach = theCoach;
//        anotherCoach = theAnotherCoach;
//    }

//    @GetMapping("/check")
//    public String check() {
//        return "Comparing beans: myCoach == anotherCoach: " + (myCoach == anotherCoach);
//    }

    /**
     * SwimCoach did not have @Component annotations.
     * Instead, we configured as a Spring bean using @Bean annotation
     *
     * @Bean use case
     * Take existing third-party class and expose as a Spring bean.
     */
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
