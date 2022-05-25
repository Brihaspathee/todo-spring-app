package com.brihaspathee.todo.web.controller;

import com.brihaspathee.todo.web.model.HelloWorldBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 04, May 2022
 * Time: 6:42 AM
 * Project: todo
 * Package Name: com.brihaspathee.todo.web.controller
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@RestController
@RequestMapping("/hello")
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldResource {

    @GetMapping("/{name}")
    public HelloWorldBean hello(@PathVariable String name){
        return HelloWorldBean.builder().name("Hello," + name).build();
    }

    @GetMapping
    public HelloWorldBean helloWorld(){
        return HelloWorldBean.builder().name("Hello, the world !!!" ).build();
    }
}
