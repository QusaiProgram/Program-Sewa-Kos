/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Scanner;

class Penyewa {
    String nama;
    int lamaSewa;
    double harga;

    public Penyewa(String nama, int lamaSewa, double harga) {
        this.nama = nama;
        this.lamaSewa = lamaSewa;
        this.harga = harga;
    }

    public double hitungBiaya() {
        return lamaSewa * harga;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Lama Sewa: " + lamaSewa + " hari, Biaya: $" + hitungBiaya();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Penyewa> penyewaList = new ArrayList<>();

        while (true) {
            System.out.println("=== Manajemen Kos ===");
            System.out.println("1. Tambah Penyewa");
            System.out.println("2. Lihat Daftar Penyewa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama penyewa: ");
                    String nama = scanner.next();
                    System.out.print("Masukkan lama sewa (hari): ");
                    int lamaSewa = scanner.nextInt();
                    System.out.print("Masukkan harga sewa per hari: $");
                    double harga = scanner.nextDouble();
                    penyewaList.add(new Penyewa(nama, lamaSewa, harga));
                    System.out.println("Penyewa ditambahkan!");
                    break;
                case 2:
                    System.out.println("=== Daftar Penyewa ===");
                    for (Penyewa penyewa : penyewaList) {
                        System.out.println(penyewa);
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
