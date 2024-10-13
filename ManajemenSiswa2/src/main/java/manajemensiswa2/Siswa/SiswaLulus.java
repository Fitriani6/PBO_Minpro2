/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemensiswa2.Siswa;

/**
 *
 * @author Lenovo
 */
public class SiswaLulus extends DataSiswa {
    private final String tahunLulus; // Menambahkan properti tahun lulus

    // Constructor
    public SiswaLulus(String nama, String kelas, String tahunLulus) {
        super(nama, kelas); // Memanggil constructor dari superclass
        this.tahunLulus = tahunLulus;
    }

    // Getter untuk tahun lulus
    public String getTahunLulus() {
        return tahunLulus;
    }

    // Override method tampilkanInfo untuk menampilkan data siswa yang sudah lulus
    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Kelas: " + kelas + ", Tahun Lulus: " + tahunLulus);
    }
}
