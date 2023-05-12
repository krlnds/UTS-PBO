package uts_a11202113246;

public class MahasiswaTransfer extends MahasiswaBaru {

    String asalUniversitas;

    // fungsi u/ mencetak info data mahasiswa 
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Universitas asal : " + this.asalUniversitas);
    }

    // fungsi u/ manampung apakah mahasiswa wajib mengikuti ospek
    public boolean ikutOspek() {
        return super.ikutOspek();
    }

}