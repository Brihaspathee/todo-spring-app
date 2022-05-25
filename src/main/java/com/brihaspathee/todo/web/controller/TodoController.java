package com.brihaspathee.todo.web.controller;

import com.brihaspathee.todo.services.TodoService;
import com.brihaspathee.todo.web.model.TodoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 07, May 2022
 * Time: 7:51 AM
 * Project: todo
 * Package Name: com.brihaspathee.todo.web.controller
 * To change this template use File | Settings | File and Code Template
 */
@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/users/{username}")
    public List<TodoDto> getAllTodos(@PathVariable String username){
        return todoService.getAllTodos();
    }

    @GetMapping("/users/{username}/todos/{id}")
    public TodoDto getTodo(@PathVariable String username, @PathVariable long id){
        TodoDto todoDto = todoService.findById(id);
        return todoDto;
    }


    @PutMapping("/users/{username}/todos/{id}")
    public ResponseEntity<TodoDto> updateTodo(@PathVariable String username, @PathVariable long id, @RequestBody TodoDto todoDto){
        TodoDto updatedTodo = todoService.save(todoDto);
        return new ResponseEntity<TodoDto>(updatedTodo, HttpStatus.OK);
    }

    @PostMapping("/users/{username}/todos")
    public ResponseEntity createTodo(@PathVariable String username, @RequestBody TodoDto todoDto){
        todoDto.setId(-1);
        TodoDto createdTodo = todoService.save(todoDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdTodo.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }


    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable("username") String username, @PathVariable("id") long todoId){
        TodoDto todo = todoService.deleteById(todoId);
        if(todo != null  ){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }

    }
}
