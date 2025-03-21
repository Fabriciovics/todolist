package vics.projects.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vics.projects.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
