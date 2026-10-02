package com.institution.library.books;

import com.sun.source.tree.BreakTree;

import java.util.Objects;

public class Books {

    public int bookId;
    public String bookName;
    public int price;
    private String author;
    public String publisher;

    public int getBookId(){
        return bookId;
    }

    public void setBookId(int id){
        this.bookId=id;
    }




    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName=bookName;
    }


    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }



    //accessor
    public String getAuthor() {

        return author;
    }

    //mutator
    public  void setAuthor(String author) {

        this.author = author;
    }



    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String publisher){
        this.publisher=publisher;
    }

    @Override
    public String toString() {
        return "Book-(bookId=" + this.bookId + "  , bookName=" + this.bookName + "  , price=" + this.price
                + "  ,anything="+ this.author + ",publisher="+this.publisher+ ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId,bookName,price,author,publisher);
    }


    @Override
    public boolean equals(Object obj) {
        Books book = (Books) obj; //down casting

        if (this.bookId == book.bookId &&
                this.bookName.equals(book.bookName) &&
                this.price == book.price &&
                this.author.equals(book.author) &&
                this.publisher.equals(book.publisher)) {
            return true;
        }
        return false;
    }



}
