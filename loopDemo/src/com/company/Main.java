package com.company;

public class Main {

    public static void main(String[] args) {
        //for
        for (int i = 1; i < 10; i++) {
            System.out.println(i);

        }
        System.out.println("For Döngüsü Bitti");

        //While
        int sayi = 1;
        while (sayi < 10) {
            System.out.println(sayi);
            sayi++;
        }
        System.out.println("While Döngüsü Bitti");

        //Do-While
        int sayi1 = 1;
        do {


            System.out.println(sayi1);  
            sayi1++;


        } while (sayi1 < 10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
