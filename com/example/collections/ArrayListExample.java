package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(100, "Java", "James Gosling"));
        bookList.add(new Book(101, "Tell Me Your Dreams", "Sidney Sheldon"));
        bookList.add(new Book(102, "Clean Code", "Robert C. Martin"));
        bookList.add(new Book(103, "Effective Java", "Joshua Bloch"));
        bookList.add(new Book(104, "The Alchemist", "Paulo Coelho"));


        System.out.println("---- Using Iterator ----");
        Iterator<Book> itr = bookList.iterator();
        while (itr.hasNext()) {
            Book b = itr.next();
            b.show();
        }
    }
}
