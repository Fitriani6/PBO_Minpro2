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
    private String status = "Aktif"; 
    public SiswaAktif(String nama, String kelas) {
        super(nama, kelas); 
    }
    
    public String getStatus() {
        return status;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Kelas: " + kelas + ", Status: " + status);
    }
}
