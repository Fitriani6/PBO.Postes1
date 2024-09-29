# Nama : Fitriani
# NIM : 2309116021
# Kelas : A 2023
# Penjelasan Program Manajemen Akademik Siswa

# Penjelasan kelas data.siswa package siswa
Pada data siswa ini untuk merepresentasikan objek siswa secara individual. Setiap objek siswa memiliki atribut atau properti, dan kelas ini menyediakan konstruktor, getter, setter, dan method untuk menangani data tersebut.
Properti Kelas DataSiswa:
id: Digunakan untuk mengidentifikasi setiap siswa. Nilai ini otomatis bertambah setiap kali objek DataSiswa baru dibuat. ID ini digunakan sebagai identitas utama dalam operasi CRUD.
nama: Nama siswa misalnya Helen.
kelas: Kelas dari siswa, misalnya 1A atau 2B.
idSiswa: Properti statis yang digunakan untuk menghasilkan ID siswa secara otomatis dan berkelanjutan. 

    public DataSiswa(String nama, String kelas) {
    this.id = idSiswa++;
    this.nama = nama;
    this.kelas = kelas;
}
Constructor ini digunakan untuk membuat objek siswa baru. Setiap kali objek DataSiswa dibuat, ID siswa akan otomatis ditingkatkan dengan menggunakan properti statis idSiswa.

