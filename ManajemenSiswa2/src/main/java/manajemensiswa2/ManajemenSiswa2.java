/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package manajemensiswa2;
import manajemensiswa2.Siswa.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public final class ManajemenSiswa2 implements CRUDOperations {
    private static final ArrayList<DataSiswa> daftarSiswa = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final String tahunAjaran = "2024/2025";
    
    @Override
    public void tambahSiswa() {
    System.out.print("Masukkan nama siswa: ");
    String nama = scanner.nextLine();

    System.out.print("Apakah siswa aktif? (y/n): ");
    String status = scanner.nextLine().trim(); 

    DataSiswa siswaBaru;

    if (status.equalsIgnoreCase("y")) {
        // Jika siswa aktif, masukkan kelas
        System.out.print("Masukkan kelas siswa: ");
        String kelas = scanner.nextLine();
        siswaBaru = new SiswaAktif(nama, kelas);
        daftarSiswa.add(siswaBaru);
        System.out.println("Siswa aktif berhasil ditambahkan untuk tahun ajaran " + tahunAjaran + ".");
    } else if (status.equalsIgnoreCase("n")) {
        System.out.print("Masukkan tahun kelulusan: ");
        String tahunKelulusan = scanner.nextLine();
        siswaBaru = new SiswaLulus(nama, tahunKelulusan);  
        daftarSiswa.add(siswaBaru);
        System.out.println("Siswa lulus berhasil ditambahkan dengan tahun kelulusan " + tahunKelulusan + ".");
    } else {
        System.out.println("Input tidak valid. Status harus 'y' (aktif) atau 'n' (lulus).");
    }
}

    @Override
    public void lihatSiswa() {
        System.out.println("Tahun Ajaran: " + tahunAjaran);
        if (daftarSiswa.isEmpty()) {
            System.out.println("Tidak ada data siswa.");
        } else {
            for (DataSiswa siswa : daftarSiswa) {
                siswa.tampilkanInfo();
            }
        }
    }

    @Override
    public void updateSiswa() {
        System.out.print("Masukkan ID siswa yang ingin diperbarui: ");
        int id = Integer.parseInt(scanner.nextLine());
    
        for (DataSiswa siswa : daftarSiswa) {
            if (siswa.getId() == id) {
                System.out.print("Masukkan nama baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan kelas baru: ");
                String kelasBaru = scanner.nextLine();
                
                siswa.setNama(namaBaru);
                siswa.setKelas(kelasBaru);
                System.out.println("Data siswa berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Siswa dengan ID tersebut tidak ditemukan.");
    }

    @Override
    public void hapusSiswa() {
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
        ManajemenSiswa2 manajemen = new ManajemenSiswa2();
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
                    manajemen.tambahSiswa();
                    break;
                case 2:
                    manajemen.lihatSiswa();
                    break;
                case 3:
                    manajemen.updateSiswa();
                    break;
                case 4:
                    manajemen.hapusSiswa();
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
