package com.company;

public class Main {

    public static void main(String[] args) {
        String mesaj ="Boş Yapma";
        System.out.println(mesaj);
        System.out.println("Eleman Sayısı: " + mesaj.length());
        System.out.println("Beşinci Eleman: " + mesaj.charAt(4));//eleman seçme 0 dan başlıyor dizi=string
        System.out.println(mesaj.concat(" Sus"));//mesaj birleştirme
        System.out.println(mesaj.startsWith("B"));// b ile başlıyor mu bool mantığı true false
        System.out.println(mesaj.endsWith("a"));//a ile bitiyor mu bool mantığı true false
        char[]karakterler=new char[5];
        mesaj.getChars(0,5,karakterler ,0);//karakter seçme
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));//kaçıncı eleman olduğunu bulma soldan başlar
        System.out.println(mesaj.lastIndexOf("B"));//sağdan başlar
        System.out.println("----------------------------------------------");
        System.out.println(mesaj.replace("o","u"));//değiştirme
        System.out.println(mesaj.substring(2,4));//2 den 4 e kadar al veya 2 den sonrasını al gibi
        for(String kelime:mesaj.split(" ")){System.out.println(kelime);}//tek tek ayırıp yazma
        System.out.println(mesaj.toLowerCase());//küçült
        System.out.println(mesaj.toUpperCase());//büyüt
        System.out.println(mesaj.trim());//boşlıukları at baş ve sondaki
        





    }
}
