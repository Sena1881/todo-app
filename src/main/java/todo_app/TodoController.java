package todo_app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    private List <Todo> todos = new ArrayList<>();

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return todos;
    }


    
    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo newTodo) {
        newTodo.setId(todos.size() + 1L);
        todos.add(newTodo);
        return newTodo;
    }
    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable Long id) {
            todos.removeIf(todo -> todo.getId().equals(id));
}
    @PutMapping ("/todos/{id}")
    public Todo updateTodo(@PathVariable Long id){
        for(Todo todo : todos){
            if(todo.getId().equals(id)){
                todo.setCompleted(!todo.isCompleted());
                return todo;
            
            }
        }
        return null;
    }
}
