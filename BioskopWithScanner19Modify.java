import java.util.Scanner;

public class BioskopWithScanner19Modify {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom, menu;

        while (true) {

            System.out.println("-----------------------------------------");
            System.out.println("---------------   OPSI   ----------------");
            System.out.println("-----------------------------------------");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("-----------------------------------------");
            System.out.print("Pilih OPSI (1/2/3): ");
            
            menu = input19.nextInt();
            input19.nextLine();  

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan Nama : ");
                    nama = input19.nextLine();
                   
                
                    do {
                        System.out.print("Masukkan baris (1-4) : ");
                        baris = input19.nextInt();
                        if (baris < 1 || baris > 4) {
                            System.out.println("Nomor baris tidak tersedia!");
                        }
                    } while (baris < 1 || baris > 4);
                    
                 
                    do {
                        System.out.print("Masukkan kolom (1-2) : ");
                        kolom = input19.nextInt();
                        if (kolom < 1 || kolom > 2) {
                            System.out.println("Nomor kolom tidak tersedia!");
                        }
                    } while (kolom < 1 || kolom > 2);
                    
                    input19.nextLine();
                    
                 
                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Maaf, kursi sudah terisi oleh penonton lain!");
                        continue;
                    }
                    
                    penonton[baris-1][kolom-1] = nama;
                    
                    do {
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = input19.nextLine();
                        if (!next.equalsIgnoreCase("y") && !next.equalsIgnoreCase("n")) {
                            System.out.println("Input tidak valid! Masukkan y atau n!");
                        }
                    } while (!next.equalsIgnoreCase("y") && !next.equalsIgnoreCase("n"));
                    
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
            else if (menu == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + " : ***");
                        } else {
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + " : " + penonton[i][j]);
                        }
                    }
                }
            }
            else if (menu == 3) {
                System.out.println("Thank you!");
                break;
            }
            else {
                System.out.println("Opsi tidak valid!");
            }
        }
    }
}