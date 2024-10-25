package com.learner.learnerProj.apicontroller;

import com.learner.learnerProj.dto.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/learner/v1")
@Slf4j
public class LearnerController {


    @GetMapping(value="/hello/{kuchBhi1}")
    public String hello(
            @RequestHeader(name = "identity", required = false) String identity,
            @RequestHeader(name = "tId", required = false) String kuchBhi ,
            @PathVariable(name = "kuchBhi1",required = false) long kuchBhi1,
            @RequestParam(required = false) String action
    ){
        long z = 0;
        if(action.equals("multiply")){
            z = kuchBhi1 * 100;
        }
        log.info("my output is:: {}",z);
        return  "hello" + identity + kuchBhi;
    }

    @PostMapping(value = "/createSomething", produces = "application/json",
            consumes = "application/json")
    public Person postData(
            @RequestBody(required = false) Person person
    ){
    log.info("my person class:: {}" , person);
    Person p1 = new Person();

    return p1.builder().name("Moti").age(person.getAge()).address(person.getAddress()).
            number(person.getNumber()).build();

//        return p1;
    }
}
