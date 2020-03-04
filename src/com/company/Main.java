package com.company;

public class Main {

    public static void main(String[] args) {

        int[] tab = new int[50];
        int suma = 0;
        //Pętla for
        for (int i = 0; i < 50; i++) {
            tab[i] = i;
        }
        //pętla for typu foreach
        for (int z : tab) {
            suma += z;
        }
        System.out.println(suma);

        //petla while
        int licznik = 0;
        suma = 0;
        while (licznik != tab.length) {
            suma += tab[licznik];
            licznik++;
        }
        System.out.println(suma);

        //petla do while
        licznik = 0;
        suma = 0;
        do {
            suma += tab[licznik];
            licznik++;
        }
        while (licznik != tab.length);
        System.out.println(suma);
    }
}

