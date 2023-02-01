package com.book;

import com.customexceptions.InvalidBookException;

public class Book {
    String bookID;
    String title;
    String autthor;
    String category;
    float price;

    public static String[] categories = {"Science", "Fiction", "Technology", "Others"};


    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", title='" + title + '\'' +
                ", autthor='" + autthor + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(String bookID, String title, String autthor, String category, float price) {
        if( price > 0 && bookID.charAt(0)=='B' && bookID.length()==4 && (category.equals("Science")|| category.equals("Fiction")||category.equals("Technology") || category.equals("Others"))){

            this.bookID = bookID;
            this.title = title;
            this.autthor = autthor;
            this.category = category;
            this.price = price;
        }else {
            throw  new InvalidBookException(" There is something wrong with this book information");

        }





    }
}
