package com.company;

public class Main {

    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Ali";
        ogrenciler[1] = "Tuna";
        ogrenciler[2] = "Tunahan";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci : ogrenciler) {//her bir elemanı gez

            System.out.println(ogrenci);
        }
    }
}
