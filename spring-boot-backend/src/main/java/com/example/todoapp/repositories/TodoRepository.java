package com.example.todoapp.repositories;

import com.example.todoapp.models.Todo;
import de.datenkollektiv.sandbox.data.exist.ExistTemplate;
import de.datenkollektiv.sandbox.data.exist.ExistXQJRepository;
import de.datenkollektiv.sandbox.data.xml.XMLEntityInformation;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository extends ExistXQJRepository<Todo> {

    public TodoRepository(XMLEntityInformation<Todo> entityInformation, ExistTemplate existTemplate, org.springframework.oxm.Marshaller marshaller, org.springframework.oxm.Unmarshaller unmarshaller) {
        super(entityInformation, existTemplate, marshaller, unmarshaller);
    }
}