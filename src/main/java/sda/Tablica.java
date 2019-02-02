package sda;

public class Tablica {


    int [] tablica = {1,2,3,4,5,6,7,8,9,10};
    int suma;
    double srednia;

    public void average() {
        for (int i : tablica) {
            suma += i;
        }
        System.out.println("średnia to: " + suma/ tablica.length);

    }


}








