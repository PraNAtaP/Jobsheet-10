import java.util.Scanner;

public class SIAKAD19Modify {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int siswa = input19.nextInt();
        System.out.print("Masukkan jumlah mata kuliah : ");
        int matkul = input19.nextInt();

        int[][] nilai = new int[siswa][matkul];

        for (int i = 0; i < siswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < matkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = input19.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata : " + totalPerSiswa / matkul);
        }

        System.out.println("\n=======================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah : ");

        for (int j = 0; j < matkul; j++) {
            double totalPermatkul = 0;

            for (int i = 0; i < siswa; i++) {
                totalPermatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + " : " + totalPermatkul / siswa);
        }
    }
}
