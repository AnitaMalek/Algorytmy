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

    public int sumIsEven(int a, int b, int c, int d, int e) {
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
        if (isEven(d)) {
            result += d;
        }
        if (isEven(e)) {
            result += e;
        }
        return result;
    }

    public boolean isOdd(int value) {
        if (value % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int sumIsOdd(int a, int b, int c, int d, int e) {
        int result = 0;
        if (isOdd(a)) {
            result -= a;
        }
        if (isOdd(b)) {
            result -= b;
        }
        if (isOdd(c)) {
            result -= c;
        }
        if (isOdd(d)) {
            result -= d;
        }
        if (isOdd(e)) {
            result -= e;
        }
        return result;
    }
}
