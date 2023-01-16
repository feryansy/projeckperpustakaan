package com.Model.control;

import java.util.List;

import com.Model.model.transaksi;

public class laporan {
    private List<transaksi> listtransaksi;

    public laporan(List<transaksi> listtransaksi) {
        this.listtransaksi = listtransaksi;
        showData();
    }

    void showData() {
        System.out.println(
                "___________________________________________________________________");
        System.out.println(
                "| NO |     Nama Buku     |   Sisa    |          Penerbit          |");
        System.out.println(
                "===================================================================");
        int i = 1;
        for (transaksi transaksi : listtransaksi) {
            System.out.printf("|%-5s|%-20s|%-10s|%-25s| %n",
                    i++,
                    transaksi.getNamabuku(),
                    transaksi.getSisa(),
                    transaksi.getPenerbit());

        }
    }
}
