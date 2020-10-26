package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n;
        n = in.nextInt();
        
    }

    public static int sumaCifara(int x) {
        int suma = 0;
        while(x > 0) {
            suma = suma + (x % 10);
            x = x / 10;
        }
        return suma;
    }
}
