package sk.stopangin.spring.l2.beans.stereotypes;

import org.springframework.stereotype.Controller;

@Controller
public class SomeController {

    private SomeService someService;

    public SomeController(SomeService someService) {
        this.someService = someService;
    }

    public void greet() {
        System.out.println("Hello " + someService.getPersonToGreet());
    }
}
