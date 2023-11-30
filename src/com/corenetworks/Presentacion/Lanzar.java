package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Dado;

public class Lanzar {
    public static void main(String[] args) {
        Dado dado = new Dado();

        int randomNum = (int)(Math.random() * 6);  // 0 to 6
        System.out.println(randomNum+1);
        randomNum=randomNum+1;

        //dado.setDado(6);
        //System.out.println(dado.toString());
        //System.out.println((dado));
        switch (randomNum) {
            case 1:
                System.out.println(dado.dibujar1(1));
                break;
            case 2:
                System.out.println(dado.dibujar2(2));
                break;
            case 3:
                System.out.println(dado.dibujar3(3));
                break;
            case 4:
                System.out.println(dado.dibujar4(4));
                break;
            case 5:
                System.out.println(dado.dibujar5(5));
                break;
            case 6:
                System.out.println(dado.dibujar6(6));
                break;
    }
}}