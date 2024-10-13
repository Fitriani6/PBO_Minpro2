/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemensiswa2.Siswa;

/**
 *
 * @author Lenovo
 */
public class SiswaAktif extends DataSiswa {
    private String status = "Aktif"; // Menambahkan properti status

    // Constructor
    public SiswaAktif(String nama, String kelas) {
        super(nama, kelas); // Memanggil constructor dari superclass
    }

    // Getter untuk status
    public String getStatus() {
        return status;
    }

    // Override method tampilkanInfo untuk menampilkan data siswa dengan status aktif
    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Kelas: " + kelas + ", Status: " + status);
    }
}
