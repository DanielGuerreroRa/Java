package com.corenetworks.presentacion;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProbarFecha {
    public static void main(String[] args) {
        //Crear un objeto fecha para el inicio del curso con mes numerico y con la enumeración lLocalDate date=LocalDate.of(2023,10,09);
         LocalDate inicioCurso = LocalDate.of(2023,Month.OCTOBER,9);
         LocalDate inicioCurso2 = LocalDate.of(2023,10,9);
         System.out.println("El inicio del curso es " + inicioCurso );

         //Crear un objeto fecha para el final del curso
         LocalDate finalCurso = LocalDate.of(2024,Month.MARCH,22);
         LocalDate finalCurso2 = LocalDate.of(2024,3,22);
         System.out.println("El final del curso es " + finalCurso);

         //Sumar a la fecha de inicio del curso 5 semanas
         LocalDate inicioCursoMas5Semanas = inicioCurso.plusWeeks(5);
        System.out.println("El inicio del curso más 5 semanas es " + inicioCursoMas5Semanas);

         //Restar a la fecha de final del curso 80 dias
        System.out.println(finalCurso.minusDays(80));

        //Crear una fecha del día 100 de este año
        LocalDate dia100DelAño = LocalDate.ofYearDay(2023,100);
        System.out.println("Día 100 de este año es " + dia100DelAño);

        //Crear la hora del momento en que estas haciendo este ejercicio llamada ahora
        LocalTime ahora = LocalTime.now();
        System.out.println("Ahora son las " + ahora + " horas");

        //Crear la hora del inicio del curso
        LocalTime horaInicioCurso = LocalTime.parse("15:00");
        System.out.println("El curso comienza a las " + horaInicioCurso + " horas");

       //Sumar 5 horas a la hora de inicio de curso
        LocalTime horaInicioCursoMas5 = horaInicioCurso.plusHours(5);
        System.out.println("5 horas despues de que comience el curso es a las " + horaInicioCursoMas5);

       //En 8 semanas será la fecha
        LocalDate fecha8Semanas = LocalDate.now().plusWeeks(8);
        System.out.println("En 8 semanas será la fecha " + fecha8Semanas);

        //Hace 8 semanas era la fecha
        LocalDate fecha8SemanasMenos = LocalDate.now().minusWeeks(8);
        System.out.println("Hace 8 semanas era la fecha " + fecha8SemanasMenos);

       //Sumar a la fecha de inicio de curso 3 días y restarle 2 hrs
        LocalDateTime suma3DiasR2 = LocalDateTime.of(inicioCurso, horaInicioCurso).plusDays(3).minusHours(2);
        System.out.println("Sumar a la fecha de inicio de curso 3 días y restarle 2 horas es " + suma3DiasR2);

        //Imprimir por la consola si la fecha ahora es antes de la hora de salida
        if (LocalTime.now().isBefore(horaInicioCursoMas5)) {
            System.out.println("Es antes");
        }else {
            System.out.println("Es despues");
        }
        //Imprimir por la consola si la fecha ahora es despues de la hora de entrada
        if (LocalTime.now().isAfter(horaInicioCursoMas5)) {
            System.out.println("Es después");
        }else {
            System.out.println("Es antes");
        }
        //Calcular los años trabajados en una empresa del un empleado que inició a trabajar el 6 de Julio de 2012
        LocalDate fechaInicioTrabajo = LocalDate.of(2012,7,6);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaInicioTrabajo,fechaActual);
        int añosTrabajados = periodo.getYears();
        System.out.println("El empleado ha trabajado " + añosTrabajados + " años");

        //Calcular la edad de una persona que nació el 7 de Agosto de 2007
        LocalDate fechaNacimiento = LocalDate.of(2007,8,7);
        Period edad = Period.between(fechaNacimiento,LocalDate.now());
        System.out.println("Edad " + edad);

        //Se tiene una fecha de fabricación y una fecha de expiración calcular el periodo en el que se puede consumir ese producto
        LocalDate fechaFabricacion= LocalDate.of(2023,5,2);
        LocalDate fechaExpiracion= LocalDate.of(2025,4,2);
        Period consumir= Period.between(fechaFabricacion,fechaExpiracion);
        System.out.println("Consumir antes de " + consumir);

        //Declarar la fecha de Navidad y declarar la fecha de Noche Vieja
        LocalDate navidad = LocalDate.of(2023,12,25);
        LocalDate nocheVieja= LocalDate.of(2023,12,31);

		//Compararlas con los métodos isBefore y isAfter
        if (navidad.isBefore(nocheVieja)){
            System.out.println("Navidad es antes de Noche Vieja");
        }else {
            System.out.println("Navidad no es antes de Noche Vieja");
        }

        //Con esta matriz de formato
        DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter.ofPattern("d '('E')' MMM YYYY");
        DateTimeFormatter.ofPattern("w'º semana de ' YYYY");
        DateTimeFormatter.ofPattern("EEEE, dd MMM, YYYY");

        //Aplicarla a la fecha hora actual
        LocalDateTime hoyAhora = LocalDateTime.now();
        System.out.println("Fecha y hora: " + hoyAhora);

        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

    }
}

