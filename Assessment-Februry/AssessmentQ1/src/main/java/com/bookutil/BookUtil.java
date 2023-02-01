package com.bookutil;

import com.book.Book;
import com.book.BookStore;

import java.util.Scanner;

public class BookUtil {
    public static void main(String[] args) {
        Book bookk= new Book("B1t2","Harry Potter", "J,K", "Science", 8);
        BookStore bookStore = new BookStore();
        Scanner scanner = new Scanner(System.in);


        for(int i =0; i<3; i++){
            System.out.println("Please Enter the id");
            String id = scanner.next();
            System.out.println("Please Enter the title");
            String title = scanner.next();
            System.out.println("Please Enter the author");
            String author= scanner.next();
            System.out.println("Please Enter the category");
            String category = scanner.next();
            System.out.println("Please Enter the price");
            Float price = scanner.nextFloat();
            Book book = new Book(id,title,author,category,price);
            bookStore.addBook(book);


        }
        bookStore.displayAll();

        System.out.println("enter the title you want to search");

        String title1 = scanner.next();
        bookStore.searchByTitle(title1);

        System.out.println("enter the author you want to search");

        String author1 = scanner.next();
        bookStore.searchByAuthor(author1);








    }
}
