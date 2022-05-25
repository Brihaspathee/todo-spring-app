package com.brihaspathee.todo.auth.exception;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 24, May 2022
 * Time: 5:22 AM
 * Project: todo
 * Package Name: com.brihaspathee.todo.auth.exception
 * To change this template use File | Settings | File and Code Template
 */
public class AuthenticationException extends RuntimeException{

        public AuthenticationException(String message, Throwable cause) {
            super(message, cause);
        }
}
