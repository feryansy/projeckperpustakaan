package com.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.Model.control.bukuConstroler;
import com.Model.control.laporan;
import com.Model.control.peminjaman;
import com.Model.model.buku;
import com.Model.model.transaksi;

public class App {
    static Scanner scan = new Scanner (System.in);
    public static final Locale  locale = new Locale( "in","ID");    
    public static void main(String[] args) throws Exception {
    List<buku> listbuku = new ArrayList<buku>();
    List<transaksi> listtransaksi = new ArrayList<transaksi>();

    do {
        System.out.println("=== TODO LIST APP ===");
        System.out.println("[1] Data buku");
        System.out.println("[2] Transaksi Peminjaman");
        System.out.println("[3] Laporan Transaksi");
        System.out.println("---------------------");
        System.out.print("Pilih menu> ");
    } while (showMenu(listbuku, listtransaksi) != 0);
    
    }
    public static int showMenu(List<buku> buku, List<transaksi> transaksi) {
        int selectedMenu = Utility.inputInt(scan.nextLine());

        switch (selectedMenu) {
            case 1:
                // 2 buat folder controller kemudian bikin nama untuk controllernya
                // 3 bikin contructor
                new bukuConstroler(buku);
                break;
            case 2:

            new peminjaman (transaksi, buku);
            break;
            case 3:

            new laporan (transaksi);
            break;
        }

        return selectedMenu;
    }
            
}
