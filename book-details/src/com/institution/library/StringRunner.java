package com.institution.library;

import com.institution.library.books.Books;

public class StringRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

        //String literal
        //String bookName="Java";
        //String bookName1="Python";



       String bookName=new String("bAba");
       String bookName1=new String("bAba");

        System.out.println(bookName==bookName1);//compare refrences

        //Books book1 = new Books();
        //book1.bookName = "Abhi";

        //hashcode = 31 *hash + character

        //int bookHash = book1.hashCode();
        //System.out.println("book1 equals to to book2:" + bookHash);
    }
    }
