package com.training.dp.common;

import java.util.Scanner;

public class ATMFlat {

    public static void main(final String[] args) {
        Scanner scannerLoc = new Scanner(System.in);

        Customer customerLoc = new Customer();
        customerLoc.setName("osman");
        customerLoc.setTlAmount(1000);

        while (true) {
            System.out.println(customerLoc);

            System.out.println("1-Para Cek");
            System.out.println("2-Para Yat�r");
            System.out.println("3-Dolar bozdur");
            System.out.println("Se�iminiz");

            int nextIntLoc = scannerLoc.nextInt();
            switch (nextIntLoc) {
                case 1:
                    System.out.println("�ekece�iniz Para miktar� : ");
                    break;
                case 2:
                    System.out.println("Yat�raca��n�z Para miktar� : ");
                    break;
                case 3:
                    System.out.println("Bozduraca��n�z miktar : ");
                    break;

                default:
                    break;
            }
            int amount = scannerLoc.nextInt();

            switch (nextIntLoc) {
                case 1:
                    customerLoc.setTlAmount(customerLoc.getTlAmount() - amount);
                    break;
                case 2:
                    customerLoc.setTlAmount(customerLoc.getTlAmount() + amount);
                    break;
                case 3:
                    customerLoc.setTlAmount(amount * 5);
                    break;

                default:
                    break;
            }
        }

    }
}
