package com.google.classes;

import com.google.interfaces.classes.IModel3;

public class Model3 implements IModel3 {


    @Override
    public void getModel() {
        System.out.println("model is Model3 ");

    }

    @Override
    public void getMiles() {
        System.out.println("miles of Model3 is 13400");

    }
}
