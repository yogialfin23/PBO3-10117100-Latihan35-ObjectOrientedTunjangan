package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 * Deskripsi : program ini berisi program untuk menampilkan tunjangan
 * dari gaji dengan menggunakan oop
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        GajiKaryawan gk = new GajiKaryawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan ? : Rp. ");
        gk.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        gk.status = scn.next();

        gk.HasilHitung(gk.status,gk.gajiPokok);
    }
}
