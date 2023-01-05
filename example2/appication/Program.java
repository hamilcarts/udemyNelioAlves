package example2.appication;

import example2.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Price: ");
        Double price = scan.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = scan.nextInt();
        Product product = new Product(name,price,quantity);

        System.out.println(product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println(product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println(product);

    }
}
