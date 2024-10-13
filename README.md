# Nama : Fitriani
# NIM : 2309116021
# Kelas : A 2023

## Penjelasan Program Manajemen Akademik Siswa
Dalam sistem pendidikan, pengelolaan data siswa merupakan bagian penting dari manajemen akademik yang harus dilakukan secara terorganisir dan efisien. Hal ini mencakup pengelolaan informasi seperti nama siswa, kelas, dan tahun ajaran. pengelola data siswa secara digital akan mempermudah pekerjaan administratif di institusi pendidikan yang dimana admin dapat melakukan CRUD.

## Penjelasan Packages manajemensiswa2
Didalam packages ini terdapat class Manajemensiswa2.Siswa dan interface CRUDOperations untuk mengelola operasional sistem akademik secara keseluruhan

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
Encapsulation melibatkan pembungkusan data dengan cara menggunakan getter dan setter untuk melindungi akses langsung ke properti dari luar kelas. dalam studi kasus saya nama dan kelas menjadi properti dari getter dan setter.

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
    // Implementasi metode CRUD
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
    
## Penjelasaan Output

