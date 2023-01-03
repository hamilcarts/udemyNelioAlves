package exercise1.application;

import exercise1.entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter recatangle width and height: ");
        Rectangle rectangle = new Rectangle();
        rectangle.width = scan.nextDouble();
        rectangle.height = scan.nextDouble();

        System.out.println(rectangle);
        scan.close();
    }
}
