/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasinheritance;
import java.util.Scanner;
/**
 *
 * @author rezel
 */
public class TugasInheritance {

    public static void main(String[] args) {
        
class BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih bangun ruang:");
        System.out.println("1. Balok");
        System.out.println("2. Bola");
        System.out.println("3. Tabung");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hitungVolumeBalok();
                break;
            case 2:
                hitungVolumeBola();
                break;
            case 3:
                hitungVolumeTabung();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    static void hitungVolumeBalok() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok: " + volume);
    }

    static void hitungVolumeBola() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        System.out.println("Volume bola: " + volume);
    }

    static void hitungVolumeTabung

            }
}
}