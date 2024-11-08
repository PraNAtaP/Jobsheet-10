import java.util.Scanner;

public class Tugas19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        int[][] survei  = new int[10][6];
        double total = 0, totalRata2 = 0;
        int totalKeseluruhan = 0;

        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke- " + (i + 1));
            System.out.println("Masukkan hasil survei (nilai 1-5) untuk setiap pertanyaan");
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Pertanyaan ke- " + (j + 1) + " : ");
                survei[i][j] = input19.nextInt();
            }
        }

        System.out.println("Rata rata untuk setiap responden : ");
        for (int i = 0; i < survei.length; i++) {
            total = 0;
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
            double rata2 = total/survei[i].length;
            System.out.println("Responden " + (i + 1) + " : " + rata2);
        }
        
        System.out.println("Rata rata untuk setiap pertanyaan : ");
        for (int j = 0; j < survei[0].length; j++) {
            total = 0;
            for (int i = 0; i < survei.length; i++) {
                total += survei[i][j];
            }
            double rata2 = total/survei.length;
            System.out.println("Pertanyaan " + (j + 1) + " : " + rata2);
        }
        
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totalRata2 += survei[i][j];
                totalKeseluruhan++;
            }
        }

        double rata2Keseluruhan = totalRata2 / totalKeseluruhan;
        System.out.println("Rata-rata Keseluruhan : " + rata2Keseluruhan);
    }
}
