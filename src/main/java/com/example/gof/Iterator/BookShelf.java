package com.example.gof.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book>{
//    private Book[] books;
    private List<Book> books = new ArrayList<>();

//    private int cnt=0;

//    public BookShelf(int cnt) {
//        this.books = new Book[cnt];
//    }

//    public Book searchBook(int index){
//        return  books[index];
//    }


//    public int getBooksCnt() {
//        return cnt;
//    }

//    public Long addBook(Book book) {
//        books[cnt] = book;
//        cnt ++;
//        return book.getId();
//    }


    public Book searchBook(int index) {
        return books.get(index);
    }
    public int getBooksCnt() {
        return books.size();
    }
    public Long addBook(Book book) {
        books.add(book);
        return book.getId();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
