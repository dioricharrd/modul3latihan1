import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa banyak bilangan yang akan dimasukkan: ");
        int jumlahBilangan = input.nextInt();

        if (jumlahBilangan <= 0) {
            System.out.println("Masukkan angka yang valid.");
            return;
        }

        int bilanganTerbesar = Integer.MIN_VALUE;

        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            int bilangan = input.nextInt();

            if (bilangan > bilanganTerbesar) {
                bilanganTerbesar = bilangan;
            }
        }

        System.out.println("Bilangan terbesar adalah: " + bilanganTerbesar);

        input.close();
}
}