package com.lyx.bookmanager;

import com.lyx.bookmanager.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookmanagerApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {

    }

}
