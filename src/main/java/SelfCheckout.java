/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class SelfCheckout {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the price of item 1: ");
        String price1 = input.next();
        System.out.print("Enter the quantity of item 1: ");
        String item1 = input.next();
        System.out.print("Enter the price of item 2: ");
        String price2 = input.next();
        System.out.print("Enter the quantity of item 2: ");
        String item2 = input.next();
        System.out.print("Enter the price of item 3: ");
        String price3 = input.next();
        System.out.print("Enter the quantity of item 3: ");
        String item3 = input.next();

        double p1 = Double.parseDouble(price1);
        double p2 = Double.parseDouble(price2);
        double p3 = Double.parseDouble(price3);
        double q1 = Double.parseDouble(item1);
        double q2 = Double.parseDouble(item2);
        double q3 = Double.parseDouble(item3);

        double fTotal = p1 * q1; double sTotal = p2 * q2; double tTotal = p3 * q3;
        double subtotal = fTotal + sTotal + tTotal;
        double tax = subtotal *.055;
        double total = subtotal + tax;
        String finalOutput = genOutputString(subtotal, tax, total);
        System.out.println(finalOutput);

    }
    public static String genOutputString(double subtotal, double tax, double total)
    {
        return String.format("Subtotal: %.2f\nTax: %.2f\nTotal: %.2f", subtotal, tax, total);
    }
}


