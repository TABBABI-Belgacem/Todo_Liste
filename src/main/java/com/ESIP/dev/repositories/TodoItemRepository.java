package com.ESIP.dev.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ESIP.dev.models.TodoItem;

public interface TodoItemRepository  extends CrudRepository<TodoItem, Long>{

}
