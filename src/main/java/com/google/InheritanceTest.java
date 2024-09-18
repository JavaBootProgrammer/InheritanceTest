package com.google;

import com.google.classes.Model3;
import com.test.aggregation.Book;
import com.test.aggregation.Library;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class InheritanceTest {

    public static void main(String[] args) {
        SpringApplication.run(InheritanceTest.class, args);

        System.out.println("\n"+"\n");

        Book book1 = new Book("Effective Java","A");
        Book book2 = new Book("Clean Code","B");

        List<Book> books = Arrays.asList(book1, book2);

        Library library = new Library("266777", books);

        System.out.println(library);


    }

}
