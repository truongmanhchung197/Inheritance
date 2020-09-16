package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(5,"blue");
        System.out.println(circle);

        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(5,"blue",5);
        System.out.println(cylinder);
    }
}
