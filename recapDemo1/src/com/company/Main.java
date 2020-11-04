package com.company;

public class Main {

    public static void main(String[] args) {
            //En Büyük Sayıyı Hangisi
        int sayi1,sayi2,sayi3;
        sayi1=20;sayi2=25;sayi3=2;
        int enBuyukSayi;
        if(sayi1>sayi2 && sayi1>sayi3)
        {
            enBuyukSayi=sayi1;
            System.out.println("En Büyük Sayi"+enBuyukSayi);
        }
        if(sayi2>sayi1 && sayi2>sayi3)
        {
            enBuyukSayi=sayi2;
            System.out.println("En Büyük Sayi "+enBuyukSayi);
        }
        if(sayi3>sayi1 && sayi3>sayi2)
        {
            enBuyukSayi=sayi3;
            System.out.println("En Büyük Sayi"+enBuyukSayi);
        }
    }
}
