package org.example;

import java.util.Scanner; // Importa a classe Scanner

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o número da multiplicação: \n");
        int x = scanner.nextInt();

        System.out.println("Tabuada do número " + x + "\n");

        for (int cont = 1; cont <= 10; cont++) {
            int res = cont * x;
            System.out.println(cont + " X " + x + " = " + res);
        }
        scanner.close();
    }
}