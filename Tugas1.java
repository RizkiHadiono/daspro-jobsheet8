import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input nilai N
        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();
        
        // Nilai N minimal 3
        if (N < 3) {
            System.out.println("Nilai N harus minimal 3!");
        } else {
            // Perulangan untuk mencetak baris
            for (int i = 1; i <= N; i++) {
                // Perulangan untuk mencetak kolom
                for (int j = 1; j <= N; j++) {
                    // Cetak angka N pada batas luar
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print(N);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Pindah barisan
            }
        }
    }
}
