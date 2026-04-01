package Praktikum05;

import java.util.Scanner;

public class DosenMain23 {
    public static void main(String[] args) {
        DataDosen23 data = new DataDosen23();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort - Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Selection Sort - Tertua ke Termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: "); String kd = sc.nextLine();
                    System.out.print("Nama: "); String nm = sc.nextLine();
                    System.out.print("JK (Pria = true, Wanita = false): "); boolean jk = sc.nextBoolean();
                    System.out.print("Usia: "); int usia = sc.nextInt();
                    data.tambah(new Dosen23(kd, nm, jk, usia));
                    break;
                case 2:
                    System.out.println("\nSeluruh Data Dosen:");
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("\nData berhasil diurutkan (ASC).");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("\nData berhasil diurutkan (DSC).");
                    data.tampil();
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
