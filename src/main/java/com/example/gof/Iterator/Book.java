package com.example.gof.Iterator;

public class Book{
    private Long id;
    private String name;

    public Book(Long id,String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
