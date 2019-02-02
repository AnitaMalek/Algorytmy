package sda;

public class Tablica {


    int[] tablica = {1, 2, 3, 4, 5, 12, 7, 8, 9, 10};
    int suma;
    double srednia;

    public void average() {
        for (int i : tablica) {
            suma += i;
        }
        System.out.println("średnia to: " + suma / tablica.length);

    }
public void getMax() {
    int dlugosc = tablica.length;
    int max = tablica[0];

    for (int i = 0; i < dlugosc; i++) {

        if (tablica[i] > max)
            max = tablica[i];
    }
    System.out.println(max);
}


}









