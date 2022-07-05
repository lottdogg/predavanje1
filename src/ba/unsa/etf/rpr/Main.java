package ba.unsa.etf.rpr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
    System.out.println("Vrijednost je:"+ x);
        } catch(InputMismatchException e) {
            System.out.println("Niste unijeli broj");
        }


    }
}
