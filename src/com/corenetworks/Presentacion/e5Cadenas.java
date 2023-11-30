package com.corenetworks.Presentacion;
//        String texto ="Nunca mates una mosca sobre la cabeza de un tigre";
public class e5Cadenas {
    public static void main(String[] args) {
        //      Mostrar el numero de caracteres del texto anterior
        String texto ="Nunca mates una mosca sobre la cabeza de un tigre";

        //      Mostrar el texto en mayuscula

        System.out.println(texto.toUpperCase());

        //      Mostrar el texto en minúscula

        System.out.println(texto.toLowerCase());

        //     Mostrar la palabra sobre

        System.out.println("Extraer sobre (" + texto.substring(texto.indexOf("sobre"),texto.indexOf("sobre")+"sobre".length())+")");


        //      Mostrar la posicion de la primera palabra m
        System.out.println("posicion de la primera m");
        System.out.println(texto.indexOf("m"));

        //      Longitud de la cadena

        System.out.println("length-->" + texto.length()+ " caracteres");
    }
}
