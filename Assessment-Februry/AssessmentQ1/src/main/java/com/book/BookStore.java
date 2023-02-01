package com.book;

import java.util.ArrayList;

public class BookStore {
    ArrayList <Book> books = new ArrayList();

    public void addBook(Book b){
        books.add(b);
    }

    public  void searchByTitle(String title){
        for (Book b:books
             ) { if (b.title.equals(title)){
            System.out.println(b);
        }

        }

    }

    public void searchByAuthor(String author){
        for (Book b:books
        ) { if (b.autthor.equals(author)){
            System.out.println(b);
        }

        }
    }

    public void displayAll(){
        for (Book b: books
             ) {
            System.out.println(b);

        }
    }








}
