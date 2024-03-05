package com.zumrudisgandar.libraryCRUDApp.config;

import com.zumrudisgandar.libraryCRUDApp.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BeanComponent {
    @Primary
    @Bean
    public Book defaultBook() {
        return new Book("Title", 0, "Description", "Author");
    }

}
