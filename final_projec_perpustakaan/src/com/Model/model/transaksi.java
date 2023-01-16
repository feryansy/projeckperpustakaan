package com.Model.model;

public class transaksi {
    private String Namabuku;
    private int sisa;
    private String penerbit;

    public String getPenerbit() {
        return this.penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getNamabuku() {
        return this.Namabuku;
    }

    public void setNamabuku(String Namabuku) {
        this.Namabuku = Namabuku;
    }

    public int getSisa() {
        return this.sisa;
    }

    public void setSisa(int sisa) {
        this.sisa = sisa;
    }

    public transaksi() {
    }


}
