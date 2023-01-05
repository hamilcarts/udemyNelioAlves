package exercise4.aplication;

import exercise4.util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        CurrencyConverter.dollarPrice = scan.nextDouble();
        System.out.println("How many dollars will be bought? ");
        CurrencyConverter.dollarBught = scan.nextDouble();
        CurrencyConverter.Converter();

        scan.close();;
    }
}
