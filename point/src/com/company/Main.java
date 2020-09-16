package com.company;

public class Main {

    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point);
        point=new Point(5,5);
        System.out.println(point);

        MovablePoint movablePoint=new MovablePoint();
        System.out.println(movablePoint);
        movablePoint=new MovablePoint(5,5,5,5);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
