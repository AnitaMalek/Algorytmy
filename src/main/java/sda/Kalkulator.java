package sda;

import java.util.Scanner;

public class Kalkulator {

    int i = 0;


    //    SPRAWDZANIE CZY PARZYSTA METODA 1:
//    public static void nieparzysta(int i) {
//        if (i % 2 == 1) {
//            System.out.println("liczba nieparzysta");
//            ;
//        } else {
//            System.out.println("liczba parzysta");
//        }
//    }
//
//    METODA 2:
    public boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int sumIsEven(int a, int b, int c) {
        int result = 0;
        if (isEven(a)) {
            result += a;
        }
        if (isEven(b)) {
            result += b;
        }
        if (isEven(c)) {
            result += c;
        }
        return result;
    }
}
