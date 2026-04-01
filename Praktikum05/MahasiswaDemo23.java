package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        int jmlMhs = 5; 

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = s1.nextLine();
            System.out.print("Nama  : ");
            String nama = s1.nextLine();
            System.out.print("Kelas : ");
            String kelas = s1.nextLine();
            System.out.print("IPK   : ");
            double ipk = s.nextDouble();

            Mahasiswa23 m = new Mahasiswa23(nim, nama, kelas, ipk);
            list.tambah(m); 
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil(); 

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) - BUBBLE SORT: ");
        list.bubbleSort(); 
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (ASC) - SELECTION SORT: ");
        list.selectionSort(); 
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (ASC) - INSERTION SORT: ");
        list.insertionSort(); 
        list.tampil();
        s.close();
        s1.close();
    }
}
