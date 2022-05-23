package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o primeiro número");
        a = scan.nextInt();

        System.out.println("Digite o segundo número");
        b = scan.nextInt();

        int somar = somar(a , b );
        int subtrair = subtrair(a , b) ;
        int multiplicar = multiplicar (a ,b );
        int dividir = dividir ( a , b );

        System.out.println("somar " + somar);
        System.out.println("subtrair " + subtrair);
        System.out.println("multiplicar " + multiplicar);
        System.out.println("dividir " + dividir);

    }

    private static int dividir(int a, int b) {
        return a / b ;
    }

    private static int somar(int a, int b) {
       return a + b ;
}
    private static int subtrair(int a, int b) {
        return a - b ;
}   private static int multiplicar(int a, int b) {
return  a * b ;
    }
}