package com.brihaspathee.todo.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, May 2022
 * Time: 5:31 PM
 * Project: todo
 * Package Name: com.brihaspathee.todo.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationBean {

    private String authMessage;
}
