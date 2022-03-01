package me.whiteship.demospringmvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;

@RestController
public class SampleController {
    @GetMapping("/hello/{id}")
    public String hello(@PathVariable("id") Person person) {
        return "hello " + person.getName();
    }
}
