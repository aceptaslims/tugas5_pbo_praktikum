package Pertemuan5;
public class PerulanganWhile {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("Menggunakan i++:");
        while (i < 5) {
            System.out.println(i++);
        }

        i = 0;
        System.out.println("\nMenggunakan ++i:");
        while (i < 5) {
            System.out.println(++i);
        }
    }
}
