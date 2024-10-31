import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        // Variabel
        int jmlAtlet = 5; // jumlah atlet per cabang olahraga
        String namaAtlet;

        // Input jumlah politeknik
        System.out.print("Masukan jumlah politeknik yang daftar: ");
        int jmlPoliteknik = input.nextInt();
        input.nextLine();  

        // Perulangan untuk setiap politeknik
        for (int i = 1; i <= jmlPoliteknik; i++) {
            System.out.println("\n================");
            System.out.println("= Politeknik "+ i+" = ");
            System.out.println("================\n");

            // Perulangan untuk cabang olahraga
            System.out.println("Cabang Olahraga: Badminton");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + ": ");
                namaAtlet = input.nextLine();
            }

            System.out.println("\nCabang Olahraga: Tenis Meja");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + ": ");
                namaAtlet = input.nextLine();
            }

            System.out.println("\nCabang Olahraga: Basket");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + ": ");
                namaAtlet = input.nextLine();
            }

            System.out.println("\nCabang Olahraga: Bola Voli");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + ": ");
                namaAtlet = input.nextLine();
            }
        }
    }
}
