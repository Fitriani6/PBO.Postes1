/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manajemensiswa;
import com.mycompany.manajemensiswa.Siswa.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class ManajemenSiswa {
    private static ArrayList<DataSiswa> daftarSiswa = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static String tahunAjaran = "2024/2025";
    
    public static void tambahSiswa() {
    System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kelas siswa: ");
        String kelas = scanner.nextLine();
        
        DataSiswa siswaBaru = new DataSiswa(nama, kelas);
        daftarSiswa.add(siswaBaru);
        System.out.println("Siswa berhasil ditambahkan untuk tahun ajaran" + tahunAjaran + ".");    
    }
    
    public static void lihatSiswa() {
        System.out.println("Tahun Ajaran: " + tahunAjaran);
        if (daftarSiswa.isEmpty()) {
            System.out.println("Tidak ada data siswa.");
        } else {
            for (DataSiswa siswa : daftarSiswa) {
                siswa.tampilkanInfo();
            }
        }
    }
    public static void updateSiswa() {
    System.out.print("Masukkan ID siswa yang ingin diperbarui: ");
    int id = Integer.parseInt(scanner.nextLine());
    
    for (DataSiswa siswa : daftarSiswa) {
        if (siswa.getId() == id) {
            // Update properti nama dan kelas dari objek yang sudah ada
            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            System.out.print("Masukkan kelas baru: ");
            String kelasBaru = scanner.nextLine();
            
            // Mengubah properti nama dan kelas
            siswa.setNama(namaBaru);
            siswa.setKelas(kelasBaru);
            System.out.println("Data siswa berhasil diperbarui.");
            return;
        }
    }
    System.out.println("Siswa dengan ID tersebut tidak ditemukan.");
}

    // Method untuk menghapus data siswa
    public static void hapusSiswa() {
        System.out.print("Masukkan ID siswa yang ingin dihapus: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        for (DataSiswa siswa : daftarSiswa) {
            if (siswa.getId() == id) {
                daftarSiswa.remove(siswa);
                System.out.println("Siswa berhasil dihapus.");
                return;
            }
        }
        System.out.println("Siswa dengan ID tersebut tidak ditemukan.");
    } 
   
    
    // Menu utama
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Manajemen Akademik Siswa ===");
            System.out.println("1. Tambah Siswa");
            System.out.println("2. Lihat Daftar Siswa");
            System.out.println("3. Update Siswa");
            System.out.println("4. Hapus Siswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1:
                    tambahSiswa();
                    break;
                case 2:
                    lihatSiswa();
                    break;
                case 3:
                    updateSiswa();
                    break;
                case 4:
                    hapusSiswa();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
