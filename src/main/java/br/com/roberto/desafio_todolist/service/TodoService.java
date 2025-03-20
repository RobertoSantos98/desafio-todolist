package br.com.roberto.desafio_todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.roberto.desafio_todolist.entity.Todo;
import br.com.roberto.desafio_todolist.repository.TodoRepository;

@Service
public class TodoService {

    private TodoRepository _todoRepository;

    public TodoService(TodoRepository todoRepository){
        _todoRepository = todoRepository;
    }


    public List<Todo> create(Todo todo) {
        _todoRepository.save(todo);
        return list();
    }

    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending()
        );
        return _todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        _todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id){
        _todoRepository.deleteById(id);
        return list();
    }
}
