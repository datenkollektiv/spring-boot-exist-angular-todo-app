package com.example.todoapp.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "todo-item")
@XmlAccessorType(XmlAccessType.FIELD)
public class Todo {

    @XmlAttribute(name = "id")
    private String id;

    @NotBlank
    @Size(max = 100)
    private String title;

    private Boolean completed = false;

    @XmlTransient
    private Date createdAt = new Date();

    public Todo() {
        super();
    }

    public Todo(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo[id=%s, title='%s', completed='%s']",
                id, title, completed);
    }
}