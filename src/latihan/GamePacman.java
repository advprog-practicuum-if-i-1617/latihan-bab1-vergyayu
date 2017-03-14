package gamepacman;

import java.util.Scanner;

public class GamePacman {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pilih;
        int jumlahnyawa = 10;
        ClassPacman a = new ClassPacman();
        for (int i = 1; i <= 10; i++) {
            a.Data();
            System.out.println("Langkah yang tersisa : " + jumlahnyawa--);
            System.out.print("Masukkan arah selanjutnya : ");
            pilih = in.nextLine();
            switch (pilih) {
                case "w":
                    a.Atas();
                    break;
                case "a":
                    a.Kiri();
                    break;
                case "s":
                    a.Bawah();
                    break;
                case "d":
                    a.Kanan();
                    break;
                default:
                    System.out.print("perintah anda salah, nyawa anda berkurang");
            }
            if (jumlahnyawa == 0) {
                System.out.print("ANDA KALAH:(");
            }
        }
    }

}