# Nama : Fitriani
# NIM : 2309116021
# Kelas : A 2023

## Penjelasan Program Manajemen Akademik Siswa
Dalam sistem pendidikan, pengelolaan data siswa merupakan bagian penting dari manajemen akademik yang harus dilakukan secara terorganisir dan efisien. Hal ini mencakup pengelolaan informasi seperti nama siswa, kelas, dan tahun ajaran. pengelola data siswa secara digital akan mempermudah pekerjaan administratif di institusi pendidikan yang dimana admin dapat melakukan CRUD.

## Penjelasan Packages manajemensiswa2
Didalam packages ini terdapat class Manajemensiswa2.Siswa dan interface CRUDOperations untuk mengelola operasional sistem akademik secara keseluruhan. 
Import Library adapun beberapa pustaka (library) yang diperlukan yaitu -import com.mycompany.manajemensiswa.Siswa.*; mengimport datasiswa untuk mempresentasikan data siswa

import java.util.ArrayList; untuk menyimpan daftar siswa
import java.util.Scanner untuk mengimpor kelas Scanner untuk membaca onput dari pengguna

## Penjelasan Packages Siswa
Didalam packages Siswa berisi class-class yang terkait dengan data siswa, seperti DataSiswa, SiswaAktif, dan SiswaLulus. Packages ini fokus pada representasi dan informasi mengenai siswa itu sendiri.

## Penjelasan ketentuan
## Inheritance
Inheritance adalah pewarisan properti dan metodenya superclass ke subclassnya dimana dalam studi kasus saya superclassnya adalah DataSiswa dan subclassnya ada SiswaAktif dan SiswaLulus. SiswaAktif dan SiswaLulus mewarisi properti id, nama, kelas dari DataSiswa.

public class SiswaAktif extends DataSiswa {
    private String status = "Aktif";
}

public class SiswaLulus extends DataSiswa {
    private final String tahunLulus;
}


## Encapsulation
Encapsulation melibatkan pembungkusan data dengan cara menggunakan getter(methodnya ada intgetId, string getnama ddan string getkelas) dan setter(methodnya void setnama dan voit setkelas, tambahan juga pakai void tampilkanInfo ini untuk menampilkan informasi dasar siswa) untuk melindungi akses langsung ke properti dari luar kelas. dalam studi kasus saya nama dan kelas menjadi properti dari getter dan setter.

public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

## Abstraction dan Interface
CRUDOperations adalah interface yang mendefinisikan metode CRUD, tapi detail implementasinya disembunyikan. Abstraksi ada karena hanya struktur/metode yang disediakan, dan implementasi disembunyikan sampai di kelas ManajemenSiswa2.

public interface CRUDOperations {
    void tambahSiswa();
    void lihatSiswa();
    void updateSiswa();
    void hapusSiswa();
}


CRUDOperations adalah interface yang menyediakan tempat untuk operasi CRUD jadi interface ini masuk didalam packages manajemensiswa2.

public final class ManajemenSiswa2 implements CRUDOperations {

    @Override
    public void tambahSiswa() {
        // logika tambah siswa
    }
    
    @Override
    public void lihatSiswa() {
        // logika lihat siswa
    }
    
    @Override
    public void updateSiswa() {
        // logika update siswa
    }
    
    @Override
    public void hapusSiswa() {
        // logika hapus siswa
    }
}



## Final keyword
Kelas ManajemenSiswa2 dideklarasikan sebagai final, yang artinya kelas ini tidak bisa dijadikan superclass maka properti tahunAjaran di ManajemenSiswa2 juga dideklarasikan sebagai final, sehingga nilainya tidak bisa diubah setelah diinisialisasi. final ini juga mencegah terjadinya pewarisan pada kelas ManajemenSiswa2.

public final class ManajemenSiswa2 implements CRUDOperations {
    private static final ArrayList<DataSiswa> daftarSiswa = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final String tahunAjaran = "2024/2025";
  }  
## Penjelasaan Output
1. Masuk Menu Utama
   
   ![image](https://github.com/user-attachments/assets/b5e6b95f-9fb2-4d1a-a62a-40d7d0ecc833)

3. Tambah Siswa, Masukkan angka 1 untuk menambah siswa baru disini akan di minta untuk memasukkan nama, apakah siswa ini aktif atau sudah lulus jika aktif maka akan menginputkan kelas sedangkan jika sudah lulus maka akan di minta untuk menginputkan tahun kelulusan
   ![image](https://github.com/user-attachments/assets/037a1693-2d38-443f-9d47-da8844b79aac)

4. Lihat Data, Masukkan angka 2 untuk lihat data siswa
   ![image](https://github.com/user-attachments/assets/6a89f428-7de9-47c3-a7bc-35e44b0fe821)

5. Update Data, Masukkan angka 3 untuk meng-update data siswa
   ![image](https://github.com/user-attachments/assets/48094b95-c13e-45e8-9089-6455a0a93e48)

6. Hapus, masukkan angka 4 untuk menghapus data siswa
   ![image](https://github.com/user-attachments/assets/87c3cf36-77aa-4209-b0eb-e02c9f4ad283)

7. Keluar, jika sudah selesai maka dapat keluar dari program
   ![image](https://github.com/user-attachments/assets/f04db54d-c485-449b-9989-8586c1e64010)






 

