package com.ListLoom.springboottodoapplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TodoItemRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TodoItemRepository repository;

    @Test
    public void whenFindByName_thenReturnTodoItem() {
        // given
        TodoItem todoItem = new TodoItem("Test Todo");
        entityManager.persist(todoItem);
        entityManager.flush();

        // when
        Optional<TodoItem> found = repository.findById(todoItem.getId());

        // then
        assertThat(found.isPresent()).isTrue();
        assertThat(found.get().getDescription()).isEqualTo(todoItem.getDescription());
    }

    // Add more tests for other repository methods
}