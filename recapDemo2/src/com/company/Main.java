package com.company;

public class Main {

    public static void main(String[] args) {
        double[] myList = {1.3, 1.4, 1.2, 1.9};
        double toplam = 0;
        double enBuyuk = myList[0];
        for (double number : myList) {
            if (enBuyuk < number) {
                enBuyuk = number;
            }
            System.out.println(number);
            toplam += number;
            System.out.println("Toplam: " + toplam);
            System.out.println("En Büyük: " + enBuyuk);
        }

    }
}
