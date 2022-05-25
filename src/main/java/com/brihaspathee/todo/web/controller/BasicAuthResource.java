package com.brihaspathee.todo.web.controller;

import com.brihaspathee.todo.web.model.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, May 2022
 * Time: 5:31 PM
 * Project: todo
 * Package Name: com.brihaspathee.todo.web.controller
 * To change this template use File | Settings | File and Code Template
 */
@RestController
@RequestMapping("/basicauth")
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthResource {

    @GetMapping
    public AuthenticationBean authenticate(){
        return AuthenticationBean.builder().authMessage("You are authenticated").build();
    }
}
