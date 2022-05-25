package com.brihaspathee.todo.web.model;

import lombok.*;

import java.util.Date;
import java.util.Objects;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 07, May 2022
 * Time: 7:52 AM
 * Project: todo
 * Package Name: com.brihaspathee.todo.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {

    private long id;
    private String username;
    private String description;
    private Date targetDate;
    private boolean done;

    @Override
    public String toString() {
        return "TodoDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoDto todoDto = (TodoDto) o;
        return id == todoDto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
