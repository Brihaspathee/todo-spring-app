package com.brihaspathee.todo.services;

import com.brihaspathee.todo.web.model.TodoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 07, May 2022
 * Time: 7:56 AM
 * Project: todo
 * Package Name: com.brihaspathee.todo.services
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Service
public class TodoService {

    private static List<TodoDto> todos = new ArrayList<>();
    private static int idCounter = 0;

    static{
        todos.add(new TodoDto(++idCounter, "in28Minutes", "Learn to Dance", new Date(), false));
        todos.add(new TodoDto(++idCounter, "in28Minutes", "Learn about Microservices", new Date(), false));
        todos.add(new TodoDto(++idCounter, "in28Minutes", "Learn about Angular", new Date(), false));

    }

    public List<TodoDto> getAllTodos(){
        return todos;
    }

    public TodoDto deleteById(long id){
        TodoDto todo = findById(id);
        if(todo == null) return null;
        if(todos.remove(todo)) return todo;
        return null;
    }

    public TodoDto save(TodoDto todoDto){
        if(todoDto.getId() == -1){
            todoDto.setId(++idCounter);
            todos.add(todoDto);
        }else{
            deleteById(todoDto.getId());
            todos.add(todoDto);
        }
        return todoDto;
    }

    public TodoDto findById(long id) {
        for(TodoDto todoDto: todos){
            if(todoDto.getId() == id){
                return todoDto;
            }
        }
        return null;
    }
}
