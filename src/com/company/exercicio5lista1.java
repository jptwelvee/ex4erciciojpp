package com.company;

import java.util.Scanner;

public class exercicio5lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor em metros.");
        Double numero1 = scanner.nextDouble();
        Byte valorConversao = 100;
        System.out.print("Seu valor em centimetros é:   " + numero1 * valorConversao);
        scanner.close();
    }
}
