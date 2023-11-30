package com.corenetworks.Modelo;

import java.util.Objects;

public class Dado {
    private int dado = (int) (Math.random() * (6 - 1 + 1) + 1);

    @Override
    public String toString() {
        return "Dado{" +
                "dado=" + dado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dado dado1 = (Dado) o;
        return dado == dado1.dado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dado);
    }

    public Dado() {
    }

    public Dado(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }


    public String dibujar1(int num) {
        System.out.println("*");
        return "";
   }

    public String dibujar2(int num) {
        System.out.println("**");
        return "";
    }

    public String dibujar3(int num) {
        System.out.println("***");
        return "";
    }

    public String dibujar4(int num) {
        System.out.println("****");
        return "";
    }

    public String dibujar5(int num) {
        System.out.println("*****");
        return "";
    }

    public String dibujar6(int num) {
        System.out.println("******");
        return "";
    }
    public boolean lanzarDado(){
        System.out.println("El valor del dado es "+dado);
        return false;
    }


}



