package com.kalkulator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float a, t, s, s2, s3, p, l, r;
        double hitung;
        int pilihan;
        Scanner InputUser = new Scanner(System.in);

        System.out.println("Selamat Datang diKalkulato Bangun Ruang");
        System.out.println("Pilih salah satu");
        System.out.println("=== 1. Segitiga  ===");
        System.out.println("=== 2. Persegi ===");
        System.out.println("=== 3. Persegi Panjang ===");
        System.out.println("=== 4. Lingkaran ===");
        System.out.print("Masukan angka yang dipilih : ");
        pilihan = InputUser.nextInt();

        if (pilihan == 1){
            System.out.println("======================");
            System.out.println("Pilih salah satu");
            System.out.println("=== 1.Hitung Keliling ===");
            System.out.println("=== 2.Hitung Luas ===");
            System.out.print("Masukan angka yang dipilih : ");
            pilihan = InputUser.nextInt();
                if (pilihan == 1){
                    System.out.println("======================");
                    System.out.print("Masukan sisi segitiga ke1 :");
                    s = InputUser.nextInt();
                    System.out.print("Masukan sisi segitiga ke2 :");
                    s2 = InputUser.nextInt();
                    System.out.print("Masukan sisi segitiga ke3 :");
                    s3 = InputUser.nextInt();
                    hitung = s + s2 + s3;
                    System.out.println("Keliling segitiga adalah : "+hitung);
                    System.out.println("Terima kasih");
                } else if (pilihan == 2){
                    System.out.println("======================");
                    System.out.print("Masukan alas segitiga :");
                    a = InputUser.nextInt();
                    System.out.print("Masukan tinggi segitiga :");
                    t = InputUser.nextInt();
                    hitung = 0.5 * a * t;
                    System.out.println("Luas segitiga adalah : "+hitung);
                    System.out.println("Terima kasih");
                } else {
                    System.out.println("======================");
                    System.out.println("Pilihan anda tidak ada :");
                }

        } else if (pilihan == 2){
            System.out.println("======================");
            System.out.println("Pilih salah satu");
            System.out.println("=== 1.Hitung Keliling ===");
            System.out.println("=== 2.Hitung Luas ===");
            System.out.print("Masukan angka yang dipilih : ");
            pilihan = InputUser.nextInt();
            if (pilihan == 1){
                System.out.println("======================");
                System.out.print("Masukan sisi persegi :");
                s = InputUser.nextInt();
                hitung = s * 4;
                System.out.println("Keliling peregi adalah : "+hitung);
                System.out.println("Terima kasih");
            } else if (pilihan == 2){
                System.out.println("======================");
                System.out.print("Masukan sisi persegi :");
                s = InputUser.nextInt();
                hitung = s * s;
                System.out.println("Luas persegi adalah : "+hitung);
                System.out.println("Terima kasih");
            } else {
                System.out.println("======================");
                System.out.println("Pilihan anda tidak ada :");
            }
        } else if (pilihan == 3){
            System.out.println("======================");
            System.out.println("Pilih salah satu");
            System.out.println("=== 1.Hitung Keliling ===");
            System.out.println("=== 2.Hitung Luas ===");
            System.out.print("Masukan angka yang dipilih : ");
            pilihan = InputUser.nextInt();
            if (pilihan == 1){
                System.out.println("======================");
                System.out.print("Masukan panjang persegi panjang :");
                p = InputUser.nextInt();
                System.out.print("Masukan lebar persegi panjang :");
                l = InputUser.nextInt();
                hitung = (p + l) * 2;
                System.out.println("Keliling persegi panjang adalah : "+hitung);
                System.out.println("Terima kasih");
            } else if (pilihan == 2){
                System.out.println("======================");
                System.out.print("Masukan panjang persegi panjang :");
                p = InputUser.nextInt();
                System.out.print("Masukan lebar persegi panjang :");
                l = InputUser.nextInt();
                hitung = p * l;
                System.out.println("Luas persegi panjang adalah : "+hitung);
                System.out.println("Terima kasih");
            } else {
                System.out.println("======================");
                System.out.println("Pilihan anda tidak ada :");
            }
        } else if (pilihan == 4) {
            System.out.println("======================");
            System.out.println("Pilih salah satu");
            System.out.println("=== 1.Hitung Keliling ===");
            System.out.println("=== 2.Hitung Luas ===");
            System.out.print("Masukan angka yang dipilih : ");
            pilihan = InputUser.nextInt();
            if (pilihan == 1) {
                System.out.println("======================");
                System.out.print("Masukan jari - jari lingkaran :");
                r = InputUser.nextInt();
                hitung = 2 * 3.14 * r;
                System.out.println("Keliling lingkaran adalah : " + hitung);
                System.out.println("Terima kasih");
            } else if (pilihan == 2) {
                System.out.println("======================");
                System.out.print("Masukan jari - jari lingkaran :");
                r = InputUser.nextInt();
                hitung = 3.14 * r * r;
                System.out.println("Luas lingkaran adalah : " + hitung);
                System.out.println("Terima kasih");
            } else {
                System.out.println("======================");
                System.out.println("Pilihan anda tidak ada :");
            }
        } else {
            System.out.println("======================");
            System.out.println("Pilihan anda tidak ada :");
        }
    }
}