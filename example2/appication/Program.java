package example2.appication;

import example2.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Name: ");
        product.name = scan.nextLine();
        System.out.println("Price: ");
        product.price = scan.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = scan.nextInt();

        System.out.println(product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println(product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println(product);

    }
}
