# Nama : Fitriani
# NIM : 2309116021
# Kelas : A 2023
### Penjelasan Program Manajemen Akademik Siswa
Dalam sistem pendidikan, pengelolaan data siswa merupakan bagian penting dari manajemen akademik yang harus dilakukan secara terorganisir dan efisien. Hal ini mencakup pengelolaan informasi seperti nama siswa, kelas, dan tahun ajaran. pengelola data siswa secara digital akan mempermudah pekerjaan administratif di institusi pendidikan yang dimana admin dapat melakukan CRUD.
## Penjelasan kelas data.siswa package siswa
Pada data siswa ini untuk merepresentasikan objek siswa secara individual. Setiap objek siswa memiliki atribut atau properti, dan kelas ini menyediakan konstruktor, getter, setter, dan method untuk menangani data tersebut.
Properti Kelas DataSiswa:
id: Digunakan untuk mengidentifikasi setiap siswa. Nilai ini otomatis bertambah setiap kali objek DataSiswa baru dibuat. ID ini digunakan sebagai identitas utama dalam operasi CRUD.
nama(tipe data string): Nama siswa misalnya Helen.
kelas(tipe data string): Kelas dari siswa, misalnya 1A atau 2B.
idSiswa: Properti statis yang digunakan untuk menghasilkan ID siswa secara otomatis dan berkelanjutan. 
filed-fieled ini digunakan untuk menyimpan informasi tentang data siswa serta menginisialisasi filed nama dan id.

    public DataSiswa(String nama, String kelas) {
    this.id = idSiswa++;
    this.nama = nama;
    this.kelas = kelas;
    }
Constructor ini digunakan untuk membuat objek siswa baru. Setiap kali objek DataSiswa dibuat, ID siswa akan otomatis ditingkatkan dengan menggunakan properti statis idSiswa.

## Penjelasaan Kelas CRUDSiswa package manajemenSiswa
Kelas ini mengelola seluruh logika CRUD (Create, Read, Update, Delete) untuk data siswa serta semua operasi terhadap daftar siswa dilakukan dalam kelas ini. properti yang digunakan adalah daftar siswa, scanner(digunakan untuk membaca input dari pengguna melalui konsol), dan tahun ajaran. 
## CRUDSiswa
1. Import Library
   adapun beberapa pustaka (library) yang diperlukan yaitu
   -import com.mycompany.manajemensiswa.Siswa.*; mengimport datasiswa untuk mempresentasikan data siswa
   - import java.util.ArrayList; untuk menyimpan daftar siswa
   - import java.util.Scanner untuk mengimpor kelas Scanner untuk membaca onput dari pengguna
  
2. kelas CRUDSiswa adalah kelas utama yang berisi metode-metode untuk mengelola data siswa.

3. Variable Kelas
   private static ArrayList<DataSiswa> daftarSiswa = new ArrayList<>(); ini adalah variable untuk menyimpan daftar siswa yang diimputkan / ditambahkan.
   private static Scanner scanner = new Scanner(System.in); objek scanner menerima input
   private static String tahunAjaran = "2024/2025"; untuk memasukkan nama dan kelas pada tahun ajaran 2024/2025.
   
## Metode 
1. Metode tambahSisswa
   Metode ini digunakan untuk manambahkan data siswa baru ke dalam daftar tahun ajaran baru 2024/2025 yang dimana pengguna di minta untuk memasukkan nama siswa.
   public static void tambahSiswa() {
    System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kelas siswa: ");
        String kelas = scanner.nextLine();
        
        DataSiswa siswaBaru = new DataSiswa(nama, kelas);
        daftarSiswa.add(siswaBaru);
        System.out.println("Siswa berhasil ditambahkan untuk tahun ajaran" + tahunAjaran + ".");    
    }

   
3. Metode lihatSiswa
   Metode ini digunakan untuk menampilkan daftar siswa yang sudah diinputkan dalam tahun ajaran baru. jika kosong maka akan muncul "tidak ada sata siswa" jika kosong.
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

   
5. Metode updateSiswa
   Metode ini digunakan untuk meng-update data siswa jika ada kesalahan misalkan kelas/nama dari siswa tersebut. kita akan diminta untuk memilih id siswa lalu dicek apakah id tersebut tersedia jika iya maka akan diminta memasukkan nama dan kelas baru.
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


7. Metode hapusSiswa
   Metode ini digunakna untuk menghapus data siswa dari daftar. masukkan id siswa yang ingin di hapus lalu id yang dipilih tadi akan terhapus dari data/daftar.

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

8. Metode menu
   ini adalah metode utama untuk menjalankan program. pengguna akan diminta untuk memilih opsi dari menu yang ditampilkan opsi-opsi tersebut ada menambahkan siswa, melihat data siswa, meng-update siswa, menghapus siswa, dan keluar.
   setiap opsi akan memanggil metode sesuai untuk menjalankan tindakan yang diperintahkan.

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


## PENJELASAN OUTPUT
1. Masuk ke Menu Utama
   
   ![image](https://github.com/user-attachments/assets/eb1182fb-4151-44f9-befe-a98beadc8a51)

3. Menu Menambah Siswa
   
   ![image](https://github.com/user-attachments/assets/cea12fdb-8264-4b93-95c3-b3213e1edfa3)

5. Menu Melihat Data Siswa
   
   ![image](https://github.com/user-attachments/assets/cfa7ac3f-0607-481e-bf0b-d147bd51e010)

7. Menu Meng-update Siswa
   
   ![image](https://github.com/user-attachments/assets/4b724daa-6b53-4b71-8f80-5e69f2ce7fb4)
   ![image](https://github.com/user-attachments/assets/85607940-e526-4064-bef8-ecd4f133f8a0)


9. Menu Hapus data Siswa
    
    ![image](https://github.com/user-attachments/assets/b27f3dfb-484a-4704-b4cc-57835a7478f8)
   ![image](https://github.com/user-attachments/assets/eac85a38-7981-4a5b-a884-6012aaa69fd9)

   
