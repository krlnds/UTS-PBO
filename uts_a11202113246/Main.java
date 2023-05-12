package uts_a11202113246;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // arraylist untuk menampung data mahasiswa
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        // scanner untuk mengontol data inputan
        Scanner scanner = new Scanner(System.in);

        // attribut variable
        String input = "";
        String input_data = "ya";
        String input_matkul = "";
        int inNilai;

        while (!input.equals("0")) {
            System.out.println("Menu: ");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("\nPilih menu: ");
            input = scanner.nextLine();

            // percabangan if untuk megontrol menu utama 1 = tambah data, 2 = lihat data, o = keluar program
            if (input.endsWith("1")) {
                System.out.println("Kategori Mahasiswa: ");
                System.out.println("1. baru ");
                System.out.println("2. lulus ");
                System.out.println("3. aktif ");
                System.out.println("Masukan nomor kategori mahasiswa: ");
                input = scanner.nextLine();

                // switch case untuk mengontrol menu kategori mahasiswa
                switch (input) {
                    case "1":
                        System.out.print("Apakah mahasiswa transfer?(y/t): ");
                        input = scanner.nextLine();

                        if (input.equals("y")) {
                            System.out.println("\nMasukkan Data Mahasiswa");
                                MahasiswaTransfer mTransfer = new MahasiswaTransfer();

                                System.out.print("NIM : ");
                                mTransfer.nim = scanner.nextLine();

                                System.out.print("Nama : ");
                                mTransfer.nama = scanner.nextLine();

                                System.out.print("Asal Universitas: ");
                                mTransfer.asalUniversitas = scanner.nextLine();

                                System.out.print("Asal Sekolah: ");
                                mTransfer.asalSekolah = scanner.nextLine();

                                System.out.print("Semester : ");
                                mTransfer.semester = scanner.nextInt();

                                System.out.print("Usia: ");
                                mTransfer.usia = scanner.nextInt();

                                System.out.print("KRS :");
                                
                                //Arraylist untuk menampung matakuliah dan nilai dari krs
                                ArrayList<String> matkul = new ArrayList<>();
                                ArrayList<Integer> nilai = new ArrayList<>();
                                int i = 0;
                                // perulangan do untuk mengontrol inputan matakuliah dan nilai
                                do {
                                    scanner = new Scanner(System.in);
                                    System.out.print("\nMatakuliah ke-" + (i + 1) + " = ");
                                    input_matkul = scanner.nextLine();
                                    matkul.add(input_matkul);

                                    scanner = new Scanner(System.in);
                                    System.out.print("nilai " + input_matkul + " = ");
                                    inNilai = scanner.nextInt();
                                    nilai.add(inNilai);

                                    System.out.print("\nTambahkan matakuliah?(y/t): ");
                                    input_data = scanner.next();

                                    i++;
                                } while (!input_data.equals("t"));

                                mTransfer.krs = matkul.toArray(new String[0]);
                                mTransfer.nilai = nilai.toArray(new Integer[0]);

                                mahasiswas.add(mTransfer);


                        } else if (input.equals("t")) {
                            System.out.println("\nMasukkan Data Mahasiswa Baru ");
                                MahasiswaBaru mBaru = new MahasiswaBaru();

                                System.out.print("NIM : ");
                                mBaru.nim = scanner.nextLine();

                                System.out.print("Nama : ");
                                mBaru.nama = scanner.nextLine();

                                System.out.print("Asal Sekolah: ");
                                mBaru.asalSekolah = scanner.nextLine();

                                System.out.print("Semester : ");
                                mBaru.semester = scanner.nextInt();

                                System.out.print("Usia: ");
                                mBaru.usia = scanner.nextInt();

                                System.out.print("KRS :");
                                //Arraylist untuk menampung matakuliah dan nilai dari krs
                                ArrayList<String> matkul = new ArrayList<>();
                                ArrayList<Integer> nilai = new ArrayList<>();
                                int i = 0;
                                // perulangan do untuk mengontrol inputan matakuliah dan nilai
                                do {
                                    scanner = new Scanner(System.in);
                                    System.out.print("\nMatakuliah ke-" + (i + 1) + " = ");
                                    input_matkul = scanner.nextLine();
                                    matkul.add(input_matkul);

                                    scanner = new Scanner(System.in);
                                    System.out.print("nilai " + input_matkul + " = ");
                                    inNilai = scanner.nextInt();
                                    nilai.add(inNilai);

                                    System.out.print("\nTambahkan matakuliah?(y/t): ");
                                    input_data = scanner.next();

                                    i++;
                                } while (!input_data.equals("t"));

                                mBaru.krs = matkul.toArray(new String[0]);
                                mBaru.nilai = nilai.toArray(new Integer[0]);

                                mahasiswas.add(mBaru);

                        } else {
                            System.out.println("input tidak valid");
                        }
                        break;
                    case "2":
                        System.out.println("\nMasukkan Data Mahasiswa Lulus");
                            MahasiswaLulus mLulus = new MahasiswaLulus();

                            System.out.print("NIM : ");
                            mLulus.nim = scanner.nextLine();

                            System.out.print("Nama : ");
                            mLulus.nama = scanner.nextLine();

                            System.out.print("Mengikuti wisuda?(y/t): ");
                            String wisuda = scanner.nextLine();

                            if (wisuda.equals("y")) {
                                mLulus.wisuda = true;
                                System.out.print("Wisuda: ");
                                mLulus.tahunWisuda = scanner.nextInt();
                            } else {
                                mLulus.wisuda = false;
                            }

                            System.out.print("Semester : ");
                            mLulus.semester = scanner.nextInt();

                            System.out.print("Usia: ");
                            mLulus.usia = scanner.nextInt();

                            System.out.print("IPK: ");
                            mLulus.ipk = scanner.nextFloat();

                            System.out.print("KRS :");
                            //Arraylist untuk menampung matakuliah dan nilai dari krs
                            ArrayList<String> matkul = new ArrayList<>();
                            ArrayList<Integer> nilai = new ArrayList<>();
                            int i = 0;
                            // perulangan do untuk mengontrol inputan matakuliah dan nilai
                            do {
                                scanner = new Scanner(System.in);
                                System.out.print("\nMatakuliah ke1-" + (i + 1) + " = ");
                                input_matkul = scanner.nextLine();
                                matkul.add(input_matkul);

                                scanner = new Scanner(System.in);
                                System.out.print("nilai " + input_matkul + " = ");
                                inNilai = scanner.nextInt();
                                nilai.add(inNilai);

                                System.out.print("\nTambahkan matakuliah?(y/t): ");
                                input_data = scanner.next();

                                i++;
                            } while (!input_data.equals("t"));

                            mLulus.krs = matkul.toArray(new String[0]);
                            mLulus.nilai = nilai.toArray(new Integer[0]);

                            mahasiswas.add(mLulus);
                        break;
                    case "3":
                        System.out.println("\nMasukkan Data Mahasiswa Aktif: ");
                            MahasiswaAktif mAktif = new MahasiswaAktif();

                            System.out.print("NIM : ");
                            mAktif.nim = scanner.nextLine();

                            System.out.print("Nama : ");
                            mAktif.nama = scanner.nextLine();

                            System.out.print("Semester : ");
                            mAktif.semester = scanner.nextInt();

                            System.out.print("Usia: ");
                            mAktif.usia = scanner.nextInt();

                            System.out.print("KRS :");
                            //Arraylist untuk menampung matakuliah dan nilai dari krs
                            ArrayList<String> matkul2 = new ArrayList<>();
                            ArrayList<Integer> nilai2 = new ArrayList<>();
                            int j = 0;
                            // perulangan do untuk mengontrol inputan matakuliah dan nilai
                            do {
                                scanner = new Scanner(System.in);
                                System.out.print("\nMatakuliah ke-" + (j + 1) + " = ");
                                input_matkul = scanner.nextLine();
                                matkul2.add(input_matkul);

                                scanner = new Scanner(System.in);
                                System.out.print("nilai " + input_matkul + " = ");
                                inNilai = scanner.nextInt();
                                nilai2.add(inNilai);

                                scanner = new Scanner(System.in);
                                System.out.print("\nTambahkan matakuliah?(y/t): ");
                                input_data = scanner.next();

                                j++;
                            } while (!input_data.equals("t"));

                            mAktif.krs = matkul2.toArray(new String[0]);
                            mAktif.nilai = nilai2.toArray(new Integer[0]);

                            mahasiswas.add(mAktif);
                        break;
                    default:
                        break;
                }

            } else if (input.endsWith("2")) {
                // mencatak daftar mahasiswa menggunakan perulangan for berdasarkan indeks saat data diinputkan
                for (int i = 0; i < mahasiswas.size(); i++) {
                    System.out.println("\nMahasiswa ke-" + (i + 1));
                    mahasiswas.get(i).infoMahasiswa();
                    mahasiswas.get(i).infoKrsMahasiswa();
                }

            } else if (input.endsWith("3")) {
                System.out.print("Keluar");
            } else {
                System.out.print("Menu tidak tersedia");

            }
        }
        scanner.close();

    }

}