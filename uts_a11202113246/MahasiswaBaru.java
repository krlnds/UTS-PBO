package uts_a11202113246;

public class MahasiswaBaru extends Mahasiswa {

    // atttribut variable
    String asalSekolah;

    /// fungsi u/ cetak info data mahasiswa
    public void infoMahasiswa() {
        super.infoMahasiswa();
        if (ikutOspek()){
            System.out.println("Ospek : Wajib");

        }else{
            System.out.println("Ospek : Tidak Wajib");

        }
        System.out.println("Asal Sekolah : " + this.asalSekolah);

    }

    // fungsi u/ manampung apakah mahasiswa wajib mengikuti ospek
    public boolean ikutOspek() {
        if (super.semester != 1) {
            return false;
        } else {
            return true;
        }

    }

}