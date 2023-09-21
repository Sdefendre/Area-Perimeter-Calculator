/*
Assignment Number: 2
Assignment Title: Area And Perimeter Calculator
Program Author: Steve Defendre
date due: 2023-09-15
*/

class AreaAndPerimeterCalc {
    public static void main(String[] args) {
        // declare variables
        double length = 10.0;
        double width = 5.0;
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Display welcome message to the user
        System.out.println("Welcome to the Area and Perimeter Calculator");

        // print variable names and values
        System.out.println("length\t\t" + length);
        System.out.println("width\t\t" + width);
        System.out.println("area\t\t" + area);
        System.out.println("perimeter\t" + perimeter);
    } // main
}// class AreaAndPerimeterCalc