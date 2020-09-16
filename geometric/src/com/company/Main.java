package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);
        shape=new Shape("red",false);
        System.out.println(shape);

        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(5);
        System.out.println(circle);
        circle=new Circle(5,"blue",true);
        System.out.println(circle);
    }
}
