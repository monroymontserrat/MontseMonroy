package com.corenetworks.Presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class e6Fechas {

    public static void main(String[] args) {
        //Calcular la edad de una persona que nació el 30 de agosto 1992
        Period edadP = Period.between(LocalDate.of(1992,8,30),LocalDate.now());
        System.out.println("Edad-->"+edadP.getYears());

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        //Mostrar la fecha de hoy
        System.out.println("Hoy estamos a -->");
        System.out.println(LocalDate.now());

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        //sumar dos meses a la fecha inicio 9 de octubre de 2023
        System.out.println("sumar dos meses a la fecha inicio 9 de octubre de 2023");
        System.out.println(LocalDate.of(2023,10,9).plusMonths(2));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");


    }
}

