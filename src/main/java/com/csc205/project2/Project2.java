package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

public class Project2 {

    public static void main(String[] args) {

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape cone = new Cone(-3.0, 4.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);

        shapes.forEach(System.out::println);
        System.out.println();


        Sphere sphere2 = new Sphere(5.5);
        System.out.println(sphere2);

        Cube cube2 = new Cube(3.7);
        System.out.println(cube2);

        Cylinder cylinder2 = new Cylinder(1.9, 10.0);
        System.out.println(cylinder2);

        Cone cone2 = new Cone(4.3, 6.8);
        System.out.println(cone2);
    }

}

