package com.institution.library;

import com.institution.library.books.Books;

public class BooksRunner {


    public static void main(String[] args) {

        System.out.println("Main started");
        Books book1 = new Books();
        book1.setBookId(2);
        book1.setBookName("Verity");
        book1.setPrice(465);
        book1.setAuthor("Ramesh");
        book1.setPublisher("jeevitha publisher");


        int bookId=book1.getBookId();
        String bookName=book1.getBookName();
        int price=book1.getPrice();
        String author = book1.getAuthor();
        String publisher=book1.getPublisher();
        System.out.println(book1);



        Books book2 = new Books();
        book2.bookId = 2;
        book2.bookName = "Verity";
        book2.price = 465;
        book2.setAuthor("Ramesh");
        book2.publisher = "jeevitha publisher";




        System.out.println("-------------------");
        boolean isEqual = book1.equals(book2);
        System.out.println("is book1 equal to book2: " + isEqual);


        int bookHash = book1.hashCode();
        System.out.println("book1 equals to to book2:" + bookHash);
    }
}
