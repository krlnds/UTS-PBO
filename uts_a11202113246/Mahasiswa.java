package uts_a11202113246;
import java.util.ArrayList;

public class Mahasiswa {

    //attribut variable
    String nim, nama;
    int semester, usia;
    String[] krs;
    Integer[] nilai;


    // fungsi u/ cetak info data mahasiswa
    public void infoMahasiswa() {
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Usia : " + this.usia);
        System.out.println("Semester : " + this.semester);
        System.out.println("Nilai rata-rata : " + this.hitungRataNilai(nilai));

    }

    // fungsi u/ cetak info data krs mahasiswa
    public void infoKrsMahasiswa() {
        System.out.println("krs: ");
        for (String n : krs) {
            System.out.println("- " + n);
        }
    }
    
    // fungsi u/ menghitung rata2 nilai matakuliah dalam krs
    public float hitungRataNilai(Integer[] nilai) {
        float total = 0;

        for (double n : nilai) {
            total += n;
        }

        return total / nilai.length;
    }

}
