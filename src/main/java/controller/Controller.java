package controller;

import Entity.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/submit")
public class Controller {
    @PostMapping
    public void doPost() {
        Person person ;
    }
}
