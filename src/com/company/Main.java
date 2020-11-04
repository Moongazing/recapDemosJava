package com.company;

public class Main {

    public static void main(String[] args) {
        int sayi=200;
        int sayi2=284;
        int toplam=0;
        int toplam2=0;
        for (int i=0;i<sayi;i++)
        {
            if(sayi%i==0)
            {
                toplam=toplam+i;
            }
        }
        for (int i=0;i<sayi2;i++)
        {
            if(sayi2%i==0)
            {
                toplam2=toplam2+i;
            }
        }
        if(sayi==toplam2&&sayi2==toplam)
        {
            System.out.println("Sayılar Arkadaştır");
        }
        else {
            System.out.println("Arkadaş Değil");
        }
    }
}
