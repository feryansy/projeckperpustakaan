package com.Model.control;

import java.util.List;
import java.util.Scanner;

import com.Model.Utility;
import com.Model.model.buku;


public class bukuConstroler {
    private List<buku> listbuku;
    static Scanner scan = new Scanner(System.in);

    // ini adalah konstruktor unutk BarangController
    public bukuConstroler(List<buku> listbuku) {
        this.listbuku = listbuku;
        menubuku();
    }
    void menubuku() {
        int pilih = 0;
        do {
            show();

            System.out.println("[1] Input Buku");
            System.out.println("[2] Update Buku");
            System.out.println("[3] Hapus Buku");
            System.out.println("[0] Halaman Utama");
            System.out.println("Pilih Menu \n ============");
            pilih = Utility.inputInt(scan.nextLine());

            switch (pilih) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    input();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    hapus();
                    break;
                default:
                    break;
            }
        } while (pilih != 0);
    }

    void show() {
        System.out.println(
                "______________________________________________________________________________");
        System.out.println(
                "| NO |     Nama Buku     |          Penerbit          |          Stok         |");
        System.out.println(
                "===============================================================================");
        int i = 1;
        for (buku buku : listbuku) {
            System.out.printf("|%-4s|%-21s|%-25s|%-23s| %n", i++, buku.getNama(),
                    buku.getPenerbit(), buku.getJumlahbuku());
        }
    }

    void input() {
        // String nama, alamat, jenis_kelamin, nim;
        buku b = new buku();
        System.out.println("Masukkan Nama Buku");
        b.setNama(scan.nextLine());
        System.out.println("Masukkan Penerbit");
        b.setPenerbit(scan.nextLine());
        System.out.println("Masukkan Stok Barang");
        b.setJumlahbuku(Utility.inputInt(scan.nextLine()));
        listbuku.add(b);
    }

    void update() {
        System.out.println("======Ubah Data Buku======");
        System.out.println("~Kosongkan Data Jika Tidak Ingin Dirubah~");
        System.out.println("~Ketik 0 kembali ke menu utama-");
        System.out.println("Pilih NO :");
        int inputan = Utility.inputInt(scan.nextLine());
        if (inputan > 0 && --inputan < listbuku.size()) {
            System.out.println("Masukkan nama");
            String nama = scan.nextLine();

            if (!nama.equals("")) {
                listbuku.get(inputan).setNama(nama);
            }
            System.out.println("Masukkan Penerbit");
            String penerbit = scan.nextLine();

            if (!penerbit.equals("")) {
                listbuku.get(inputan).setPenerbit(penerbit);
            }
            System.out.println("Masukkan Stok");
            int stok = Utility.inputInt(scan.nextLine());
            if (stok >= 0) {
                listbuku.get(inputan).setJumlahbuku(stok);
                
            }
        }
    }

    void hapus() {
        System.out.println("Masukkan No");
        int inputan = Utility.inputInt(scan.nextLine());

        if (inputan > 0 && --inputan < listbuku.size()) {
            listbuku.remove(inputan);
            System.out.println("\n Data Berhasil Dihapus \n");
        }
    }
}
