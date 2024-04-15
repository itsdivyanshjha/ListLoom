package com.ListLoom.springboottodoapplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ListLoom.springboottodoapplication.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {  
}
