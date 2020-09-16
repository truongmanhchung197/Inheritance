package com.company;

import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args) {
        Point2d point2d=new Point2d();
        System.out.println(point2d);
        point2d=new Point2d(5,5);
        System.out.println(point2d);

        Point3d point3d=new Point3d();
        System.out.println(point3d);
        point3d=new Point3d(5,5,5);
        System.out.println(point3d);
    }
}
