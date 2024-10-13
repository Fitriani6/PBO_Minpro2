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
    private final String tahunLulus;
    public SiswaLulus(String nama, String tahunLulus) {
        super(nama, "");  
        this.tahunLulus = tahunLulus;
    }

    public String getTahunLulus() {
        return tahunLulus;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Tahun Lulus: " + tahunLulus);
    }
}