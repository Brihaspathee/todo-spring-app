package com.brihaspathee.todo.web.model;

import java.io.Serializable;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 24, May 2022
 * Time: 5:29 AM
 * Project: todo
 * Package Name: com.brihaspathee.todo.web.model
 * To change this template use File | Settings | File and Code Template
 */
public class JwtTokenResponse implements Serializable {

    private static final long serialVersionUID = 8317676219297719109L;

    private final String token;

    public JwtTokenResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
