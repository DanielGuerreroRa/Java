package com.corenetworks.presetacion;

import java.util.Scanner;

public class Ejercicio4If {
    //Devolver si un número es par o impar
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número: ");
        int numero = teclado.nextInt();
        if (numero %2 == 0){
            System.out.println("Es Par");
        }else System.out.println("Es Impar");
    }

    public static class Ejercicio2 {
        public static void main(String[] args) {
            byte $byte =1;
            short $short = 5;
            int $int =12_000;
            long $long = 123_456L;
            float $float = 1233.34F;
            double $double = 1234.34;
            char $char = '\n';
            boolean $boolean = true;

            System.out.println("Byte " + $byte);
            System.out.println("Short " + $short);
            System.out.println("int " + $int);
            System.out.println("long " + $long);
            System.out.println("float " + $float);
            System.out.println("double " + $double);
            System.out.println("char " + $char);
            System.out.println("boolean " + $boolean);
        }
    }
}
