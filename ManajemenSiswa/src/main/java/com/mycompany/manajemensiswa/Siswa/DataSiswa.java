/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manajemensiswa.Siswa;

/**
 *
 * @author Lenovo
 */
public class DataSiswa {
    private int id;
    private String nama;
    private String kelas;
    private static int idSiswa = 1;

    // Constructor
    public DataSiswa(String nama, String kelas) {
        this.id = idSiswa++;
        this.nama = nama;
        this.kelas = kelas;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    // Setter untuk memperbarui properti
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    // Method untuk menampilkan data siswa
    public void tampilkanInfo() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Kelas: " + kelas);
    }
}
