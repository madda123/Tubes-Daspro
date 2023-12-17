package controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;

import model.Akun;
import model.DetilTransaksi;
import model.PaketData;
import model.Pengguna;
import model.Transaksi;
import model.Pulsa;

public class ApkControl {
    HashMap<String, Pengguna> penggunas = new HashMap<>();
    LinkedHashMap<String, PaketData> paketDatas = new LinkedHashMap();
    HashMap<String, Pulsa> pulsas = new HashMap<>();
    ArrayList<Transaksi> transaksis = new ArrayList<>();

    int HashMapCount = 2;

    Pengguna pengguna1 = new Pengguna();
    Pengguna pengguna2 = new Pengguna();

    PaketData paketData1 = new PaketData();
    PaketData paketData2 = new PaketData();
    PaketData paketData3 = new PaketData();
    PaketData paketData4 = new PaketData();
    PaketData paketData5 = new PaketData();
    PaketData paketData6 = new PaketData();
    PaketData paketData7 = new PaketData();
    PaketData paketData8 = new PaketData();
    PaketData paketData9 = new PaketData();

    Pulsa pulsa1 = new Pulsa();
    Pulsa pulsa2 = new Pulsa();

    public void dataPengguna() {
        pengguna1.setIdPengguna("1").setName("Madda Athia Rahman").setnoHp("0812121212").setEmail("madda@gmail.com")
                .setPassword("124");
        pengguna2.setIdPengguna("2").setName("nanda").setnoHp("0823232323").setEmail("nanda@gmail.com")
                .setPassword("123");

        penggunas.put(pengguna1.getIdPengguna(), pengguna1);
        penggunas.put(pengguna2.getIdPengguna(), pengguna2);
    }

    public void dataPaketData() {
        paketData1.setIdPaketData("1.1").setNamaPaketData("Harian1").setHargaPaketData(5000)
                .setIsiPaketData("1 Gb/1 Hr");
        paketData2.setIdPaketData("1.2").setNamaPaketData("Harian2").setHargaPaketData(10000)
                .setIsiPaketData("4 Gb/1 Hr");
        paketData3.setIdPaketData("1.3").setNamaPaketData("Harian3").setHargaPaketData(17000)
                .setIsiPaketData("7 Gb/1 Hr");
        paketData4.setIdPaketData("2.1").setNamaPaketData("Mingguan1").setHargaPaketData(18000)
                .setIsiPaketData("3 Gb/7 Hr");
        paketData5.setIdPaketData("2.2").setNamaPaketData("Mingguan2").setHargaPaketData(25000)
                .setIsiPaketData("6 Gb/7 Hr");
        paketData6.setIdPaketData("2.3").setNamaPaketData("Mingguan3").setHargaPaketData(34000)
                .setIsiPaketData("10 Gb/7 Hr");
        paketData7.setIdPaketData("3.1").setNamaPaketData("Bulanan1").setHargaPaketData(40000)
                .setIsiPaketData("8 Gb/30 Hr");
        paketData8.setIdPaketData("3.2").setNamaPaketData("Bulanan2").setHargaPaketData(54000)
                .setIsiPaketData("12 Gb/30 Hr");
        paketData9.setIdPaketData("3.3").setNamaPaketData("Bulanan3").setHargaPaketData(68000)
                .setIsiPaketData("18 Gb/30 Hr");

        paketDatas.put(paketData1.getIdPaketData(), paketData1);
        paketDatas.put(paketData2.getIdPaketData(), paketData2);
        paketDatas.put(paketData3.getIdPaketData(), paketData3);
        paketDatas.put(paketData4.getIdPaketData(), paketData4);
        paketDatas.put(paketData5.getIdPaketData(), paketData5);
        paketDatas.put(paketData6.getIdPaketData(), paketData6);
        paketDatas.put(paketData7.getIdPaketData(), paketData7);
        paketDatas.put(paketData8.getIdPaketData(), paketData8);
        paketDatas.put(paketData9.getIdPaketData(), paketData9);

    }

    public void dataPulsa() {
        pulsa1.setIdPulsa("1").setHargaPulsa(50000).setIsiPulsa("50000");
        pulsa2.setIdPulsa("2").setHargaPulsa(100000).setIsiPulsa("100000");

        pulsas.put(pulsa1.getIdPulsa(), pulsa1);
        pulsas.put(pulsa2.getIdPulsa(), pulsa2);

    }

    public void Login() {
        dataPengguna();
        Scanner input1 = new Scanner(System.in);
        String index = "";
        boolean lanjut = true;
        while (lanjut == true) {
            for (int i = 1; i <= HashMapCount; i++) {
                System.out.println();
                System.out.println("=====================================================");
                System.out.println("SILAHKAN ISI DATA UNTUK MASUK DAN MELAKUKAN TRANSAKSI");
                System.out.println("=====================================================");
                System.out.println();
                System.out.print("Masukan Nomor HP\t: ");
                String no = input1.nextLine();
                if (penggunas.get(String.valueOf(i)).getnoHp().equals(no)) {
                    index = String.valueOf(i);
                    System.out.print("Masukan Password\t: ");
                    String pw = input1.nextLine();

                    if (penggunas.get(index).getPassword().equals(pw)) {
                        System.out.println();
                        System.out.println("                   BERHASIL LOGIN!                   ");

                        lanjut = false;
                        break;
                    } else {
                        System.out.println();
                        System.out.println("                   PASSWORD SALAH!                   ");
                    }
                } else {
                    System.out.println();
                    System.out.println("          NOMOR HANDPHONE TIDAK TERDAFTAR!           ");
                }
            }
        }
    }

    public void Menu() {
        dataPengguna();
        dataPaketData();
        dataPulsa();

        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                      MENU UTAMA                     ");
        System.out.println("=====================================================");
        System.out.println();
        System.out.println("Hai " + pengguna1.getName());
        System.out.println("Saldo Pulsa Anda Adalah " + pengguna1.getPulsaPengguna());
        System.out.println("Silahkan Input Angka List Sesuai Dengan Kebutuhan Anda");
        System.out.println();
        System.out.println("1. Cek Paket Data Aktif");
        System.out.println("2. Beli Pulsa");
        System.out.println("3. Beli Paket Data");
        System.out.println("4. Keluar");
        System.out.println();
        System.out.print("Input Angka List\t: ");
    }

    public void cekPaket() {
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                    Cek Paket Data                   ");
        System.out.println("=====================================================");
        System.out.println();
        if (pengguna1.getIsPaketAktif() == true) {
            System.out.println("Anda Memiliki Paket Yang Sedang Aktif,");
            System.out.println("Yaitu Paket " + pengguna1.getNamaPaketAktif());
        } else {
            System.out.println("Anda Tidak Memiliki Paket Yang Sedang Aktif");
            System.out.println("Segera Lakukan Pembelian Paket!");
        }
    }

    public void belanjaPulsa() {
        dataPulsa();
        dataPengguna();
        Scanner input1 = new Scanner(System.in);
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                     DAFTAR PULSA                    ");
        System.out.println("=====================================================");
        System.out.println();
        for (Map.Entry<String, Pulsa> entry1 : pulsas.entrySet()) {
            String key = entry1.getKey();
            Pulsa tPulsa = entry1.getValue();
            System.out.println("Kode Pulsa \t\t: " + key);
            System.out.println("Harga \t\t\t: " + tPulsa.getHargaPulsa());
            System.out.println("Isi \t\t\t: " + tPulsa.getIsiPulsa());
            System.out.println();
        }
        System.out.print("Pilih Kode Pulsa\t: ");
        boolean lanjut = true;
        while (lanjut) {
            String pilihan = input1.nextLine();
            switch (pilihan) {
                case "1":
                    pengguna1.setPulsaPengguna(50000);
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "2":
                    pengguna1.setPulsaPengguna(100000);
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "3":
                    System.out.println();
                    System.out.println("                 KEMBALI KE MENU UTAMA               ");
                    lanjut = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("                  KODE TIDAK TERSEDIA!               ");
                    lanjut = false;
                    break;
            }
        }
    }

    public void belanjaPaketData() {
        dataPaketData();
        dataPengguna();
        Scanner input1 = new Scanner(System.in);
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                  DAFTAR PAKET DATA                  ");
        System.out.println("=====================================================");
        System.out.println();
        for (Map.Entry<String, PaketData> entry1 : paketDatas.entrySet()) {
            String key = entry1.getKey();
            PaketData tPaket = entry1.getValue();
            System.out.println("Kode Paket \t\t: " + key);
            System.out.println("Nama Paket\t\t: " + tPaket.getNamaPaketData());
            System.out.println("Harga \t\t\t: " + tPaket.getHargaPaketData());
            System.out.println("Isi \t\t\t: " + tPaket.getIsiPaketData());
            System.out.println();
        }
        System.out.print("Pilih Kode Paket\t: ");
        boolean lanjut = true;
        while (lanjut) {
            String pilihan = input1.nextLine();
            switch (pilihan) {
                case "1.1":
                    pengguna1.setIsPaketAktif(true);
                    pengguna1.setNamaPaketAktif("Harian 1 (1 Gb/1Hr)");
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "1.2":
                    pengguna1.setIsPaketAktif(true);
                    pengguna1.setNamaPaketAktif("Harian 2 (4 Gb/1Hr)");
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "1.3":
                    pengguna1.setIsPaketAktif(true);
                    pengguna1.setNamaPaketAktif("Harian 3 (7 Gb/1Hr)");
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "2.1":
                    pengguna1.setIsPaketAktif(true);
                    pengguna1.setNamaPaketAktif("Mingguan 1 (3 Gb/7Hr)");
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "2.2":
                    pengguna1.setIsPaketAktif(true);
                    pengguna1.setNamaPaketAktif("Mingguan 2 (6 Gb/7Hr)");
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "2.3":
                    pengguna1.setIsPaketAktif(true);
                    pengguna1.setNamaPaketAktif("Mingguan 3 (10 Gb/7Hr)");
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "3.1":
                    pengguna1.setIsPaketAktif(true);
                    pengguna1.setNamaPaketAktif("Bulanan 1 (8 Gb/30Hr)");
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "3.2":
                    pengguna1.setIsPaketAktif(true);
                    pengguna1.setNamaPaketAktif("Bulanan 2 (12 Gb/30Hr)");
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "3.3":
                    pengguna1.setIsPaketAktif(true);
                    pengguna1.setNamaPaketAktif("Bulanan 1 (18 Gb/30Hr)");
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("                  KODE TIDAK TERSEDIA!               ");
                    lanjut = false;
                    break;
            }

        }
    }
}
