package com.Model;

import java.text.NumberFormat;
import java.util.Locale;

public class Utility {
    public static final int inputInt(String angka) {
        int inputan = -1;
        try {
            inputan = Integer.parseInt(angka);
        } catch (Exception e) {
            if (!angka.equals("")) {
                System.out.println("Inputkan Angka Dengan Benar");
            }
        }
        return inputan;
    }

}
