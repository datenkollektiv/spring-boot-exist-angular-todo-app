package com.example.todoapp;

import com.example.todoapp.models.Todo;
import de.datenkollektiv.sandbox.data.exist.ExistTemplateConfiguration;
import de.datenkollektiv.sandbox.data.xml.XMLEntityInformation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@SpringBootApplication
public class TodoappApplication {

    @Configuration
    static class TodoListRepositoryConfiguration extends ExistTemplateConfiguration {

        @Bean
        Jaxb2Marshaller jaxb2Marshaller() {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setClassesToBeBound(Todo.class);
            return marshaller;
        }

        @Bean
        XMLEntityInformation<Todo> entityInformation() {
            return new TodoListEntityInformation();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoappApplication.class, args);
    }

}
