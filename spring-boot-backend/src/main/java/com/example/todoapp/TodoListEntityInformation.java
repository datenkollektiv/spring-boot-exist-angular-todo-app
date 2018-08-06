package com.example.todoapp;

import com.example.todoapp.models.Todo;
import de.datenkollektiv.sandbox.data.xml.XMLEntityInformation;

class TodoListEntityInformation extends XMLEntityInformation<Todo> {

    public Class<Todo> getJavaType() {
        return Todo.class;
    }

    public boolean isNew(Todo entity) {
        return false;
    }

    // WARNING: This ID will be used within the URI to identify the XML document inside the database.
    // Only valid URI characters are allowed.
    public String getId(Todo entity) {
        return asId(entity);
    }

    private static String asId(Todo entity) {
        return entity.getId();
    }

}
