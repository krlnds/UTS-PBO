package uts_a11202113246;

public class MahasiswaLulus extends Mahasiswa {
    // attribut
    int tahunWisuda;
    float ipk;
    boolean wisuda;


    // fungsi u/ cetak info data krs mahasiswa
    public void infoMahasiswa() {
        super.infoMahasiswa();
        if (ikutWisuda()) {
            System.out.println("Tahun Wisuda : " + this.tahunWisuda);
        }
        System.out.println("IPK : " + this.ipk);

    }

    // fungsi u/ manampung apakah mahasiswa lulus mengikuti wisuda atau tidak
    public boolean ikutWisuda() {
        if (wisuda == true) {
            return true;
        } else {
            return false;
        }
    }

}