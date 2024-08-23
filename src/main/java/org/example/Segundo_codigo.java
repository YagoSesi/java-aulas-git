package org.example;

import java.util.Scanner;

public class Segundo_codigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o número da divisão: \n");
        int x = scanner.nextInt();

        System.out.println("Divisão do número " + x + "\n");

        for (int cont = x; cont <= 10 *x; cont+=x) {
            int res = cont / x;
            System.out.println(cont + " X "+ x +" = " + res);
        }
        scanner.close();
    }
}