package com.company;

public class Main {

    public static void main(String[] args) {

        int[] tab = new int[50];
        int licznik = 0;

        for (int i = 0; i < 50; i++) {
            tab[i] = i;
        }
        for (int z : tab) {
            licznik+=z;
        }
        System.out.println(licznik);
    }
}

