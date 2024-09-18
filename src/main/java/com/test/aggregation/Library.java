package com.test.aggregation;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class Library {

    private String zipCode;

    //Aggregation
//    @Autowired
    private List<Book> books;


    @Override
    public String toString() {
        return "Library{" +
                "zipCode='" + zipCode + '\'' +
                ", books=" + books +
                '}';
    }

    public Library(String zipCode, List<Book> books) {
        this.zipCode = zipCode;

        this.books = books;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


}
