package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 3;
        int sayac = 0;
        int remainder = number % 2;
        System.out.println(remainder);

        boolean isPrime = true;
        if (number < 2) {
            System.out.println("Geçersiz Sayı");
            return;
        }
        if (number == 1) {
            System.out.println("Sayı Asal Değildir");
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Asal");
        } else {
            System.out.println("Asal Değil");
        }
    }
}

