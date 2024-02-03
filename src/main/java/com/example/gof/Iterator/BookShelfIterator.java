package com.example.gof.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getBooksCnt()) {
            return true;
        }
        return false;
    }

    @Override
    public Book next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }else {
            Book book = bookShelf.searchBook(index);
            index++;
            return book;
        }
    }
}
