package com.google;

import com.google.classes.Model3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InheritanceTest {

    public static void main(String[] args) {
        SpringApplication.run(InheritanceTest.class, args);

        System.out.println("\n"+"\n");
        Model3 model3 = new Model3();

        System.out.println("\n"+"\n");


        model3.getModel();

        model3.getMiles();




    }

}
