package application;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price?");
        CurrencyConverter.dolarCotacao = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double value = sc.nextDouble();
        System.out.println("Amount to be paid for dollars: " + CurrencyConverter.converter(value));

    }

}