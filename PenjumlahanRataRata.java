package Pertemuan5;

import java.util.Scanner;

public class PenjumlahanRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak bilangan: ");
        int n = input.nextInt();

        int[] bil = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Bilangan ke-" + (i+1) + ": ");
            bil[i] = input.nextInt();
            total += bil[i];
        }

        double rata = (double) total / n;
        System.out.println("Total jumlah bilangan = " + total);
        System.out.println("Rata-rata bilangan = " + rata);
    }
}
