package vics.projects.todolist.controller;

import org.springframework.web.bind.annotation.*;
import vics.projects.todolist.entity.Todo;
import vics.projects.todolist.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
    }
    @GetMapping
    List<Todo> list(){
        return todoService.list();
    }
    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }
    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);

    }
}
