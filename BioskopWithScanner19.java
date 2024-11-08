import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama : ");
            nama = input19.nextLine();
            System.out.print("Masukkan baris : ");
            baris = input19.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = input19.nextInt();
            input19.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = input19.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
