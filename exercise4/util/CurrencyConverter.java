package exercise4.util;

public class CurrencyConverter {
    public static double dollarPrice;
    public static double dollarBught;

    public static void Converter(){
        double reais = dollarPrice * dollarBught * 1.06;
        System.out.printf("Amount to be paid in reais = %.2f", reais);
    }

}
