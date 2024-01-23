package com.mycompany.bangunruang;

/**
 *
 * author rezel
 */
public class BangunRuang {

    public class MainClass {
    public static void main(String[] args) {
       
        Bola bola = new Bola();
        bola.r = 28;
        bola.pi = Math.PI;

        
        Kubus kubus = new Kubus();
        kubus.s = 25;

       
        Tabung tabung = new Tabung();
        tabung.pi = Math.PI;
        tabung.r = 7;
        tabung.tinggi = 21;

        
        bola.Volume();
        kubus.Volume();
        tabung.Volume();
    }
}}