package Pertemuan5;

import java.util.Scanner;

public class TerbesarTerkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] bilangan = new int[10];
        int terbesar;
        int terkecil;
        
        System.out.println("Masukan 10 Bilangan: ");
        for(int i = 0; i < 10; i++){
            System.out.print("Bilangan Ke-" + (i+1) + ": ");
            bilangan[i] = input.nextInt();
        }
        terbesar = bilangan[0];
        terkecil = bilangan[0];
        
        for(int i = 1; i < 10; i++) {
            if(bilangan[i] > terbesar)
                terbesar = bilangan[i];
            if(bilangan[i] < terkecil)
                terkecil = bilangan[i];
        }
        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }
}
