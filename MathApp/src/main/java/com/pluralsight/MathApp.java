package com.pluralsight;

public class MathApp {


        public static void main(String[] args) {

                double bobSalary = 50000;
                double garySalary = 200000.99;
                double highestSalary = Math.max(bobSalary, garySalary);
                System.out.println("Highest salary is: " + highestSalary);


//Display the smallest of two variables
//variables
                double carPrice = 30000;
                double truckPrice = 40000;

                double lowestPrice = Math.min(carPrice, truckPrice);
                System.out.println("Lowest price is:" + lowestPrice);
        //area of a cirle
                double radius = 7.25;
                double circleArea = Math.PI * Math.pow(radius, 2);
                        System.out.println("The area of the circle is: " + circleArea);
 //distance between points
                int x1 = 5, y1 = 10;
                int x2 = 85, y2 = 50;
                double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow((y2-y1),2);
System.out.println("The distance between the points is:"+ distance);
       }
}