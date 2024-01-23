/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author rezel
 */
 


 class Bola {
    float r;
    double pi;

    float Volume() {
        double volume = (4.0 / 3.0) * pi * r * r * r;
        System.out.println("Volume Bola: " + volume);
        return (float) volume;
    }
}

class Kubus {
    float s;

    float Volume() {
        float volume = s * s * s;
        System.out.println("Volume Kubus: " + volume);
        return volume;
    }
}

class Tabung {
    double pi;
    float r;
    float tinggi;

    float Volume() {
        double volume = pi * r * r * tinggi;
        System.out.println("Volume Tabung: " + volume);
        return (float) volume;
    }
}

     




