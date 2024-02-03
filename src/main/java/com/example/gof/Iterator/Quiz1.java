package com.example.gof.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz1 {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book(1L,"Snow white"));
        bookShelf.addBook(new Book(2L,"Cinderella"));
        bookShelf.addBook(new Book(3L,"little mermaid"));
        bookShelf.addBook(new Book(4L,"moana"));
        bookShelf.addBook(new Book(5L,"frozen"));

        Iterator<Book> it = bookShelf.iterator();

        System.out.println("Iterator");
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println("title : "+book.getName());

        }

        System.out.println("for");
        for (Book book : bookShelf) {
            System.out.println("title : "+book.getName());
        }

    }


}


