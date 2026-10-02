package com.book.bookservice.lib;

public class Book {

    public int bookId;
    public String bookName;
    public int price;
    public String author;
    public String publisher;



    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj; //down casting



        if (this.bookId == book.bookId &&
                this.bookName.equals(book.bookName) &&
                this.author.equals(book.author) &&
                this.price == book.price &&
                this.publisher.equals(book.publisher)) {
            return true;
        }

        return false;
    }
}
