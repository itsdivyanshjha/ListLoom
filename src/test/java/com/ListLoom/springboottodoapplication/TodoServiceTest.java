package com.ListLoom.springboottodoapplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TodoServiceTest {

    @Autowired
    private TodoService todoService;

    @MockBean
    private TodoItemRepository todoItemRepository;

    @Test
    public void testGetTodoCount() {
        when(todoItemRepository.count()).thenReturn(5L); // Fixed: use the mocked bean instance instead of the class
        long count = todoService.getTodoCount(); // Fixed: use the autowired bean instance instead of the class
        assertEquals(5, count, "Todo count should be 5");
    }
}