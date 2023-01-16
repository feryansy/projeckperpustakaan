package com.Model.control;

import java.util.List;
import java.util.Scanner;

import com.Model.Utility;
import com.Model.model.buku;
import com.Model.model.transaksi;

public class peminjaman {
    private List<transaksi> listtransaksi;
    private List<buku> listbuku;
    Scanner scan = new Scanner(System.in);

    public peminjaman(List<transaksi> listtransaksi, List<buku> listbuku) {
        this.listtransaksi = listtransaksi;
        this.listbuku = listbuku;
        showbuku();
        store();
    }

    void showbuku() {
        System.out.println(
                "______________________________________________________________________________");
        System.out.println(
                "| NO |     Nama buku     |          Penerbit          |          Stok         |");
        System.out.println(
                "===============================================================================");
                int i = 1;
                for (buku buku : listbuku) {
                    System.out.printf("|%-4s|%-21s|%-25s| %n", i++, buku.getNama(),
                            buku.getPenerbit(),
                            buku.getJumlahbuku());
                }
    }

    void store() {
        String inputan = "Y";
        do {

            System.out.println("\n~Ketik 0 kembali ke menu utama-");
            System.out.println("Input No :");
            int lokasibuku = Utility.inputInt(scan.nextLine());
            if (lokasibuku > 0 && --lokasibuku < listbuku.size()) {

                System.out.println("Jumlah");
                int jumlah = Utility.inputInt(scan.nextLine());
                int stok = listbuku.get(lokasibuku).getJumlahbuku();

                if (jumlah <= stok) {

                    listbuku.get(lokasibuku).setJumlahbuku(stok -= jumlah);

                    String namabuku = listbuku.get(lokasibuku).getNama();
                    String penerbit = listbuku.get(lokasibuku).getPenerbit();

                    System.out.println("------------------------------------------------------------");
                    System.out.printf("Nama Barang |%-21s|Penerbit  |%-25s|Stok|%-23s| %n",
                            namabuku,
                            penerbit,
                            listbuku.get(lokasibuku).getJumlahbuku());

                    transaksi transaksi = new transaksi();
                    transaksi.setNamabuku(namabuku);
                    transaksi.setSisa(jumlah);
                    transaksi.setPenerbit(penerbit);
                    listtransaksi.add(transaksi);

                    System.out.println("Peminjaman Berhasil");
                } else {
                    System.out.println("Jumlah Peminjaman Melebihi Stok");
                }
            }

            System.out.println("apakah ingin melanjutkan peminjaman (Y/N) ? ");
            inputan = scan.nextLine();
        } while (inputan.equalsIgnoreCase("y"));
    }
}
