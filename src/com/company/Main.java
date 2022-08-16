package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner enterScanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Digite o primeiro valor");
        num1 = enterScanner.nextInt();
        System.out.println("Digigte o segundo valor");
        num2 = enterScanner.nextInt();
        int soma;
        soma = num1 + num2;
        int sub;
        sub = num1 - num2;
        int div;
        div = num1 / num2;

        System.out.println("O resultado da soma é igual a: " + soma);
        System.out.println("O resultado da subtração é igual a: " + sub);
        System.out.println("O resultado da divisão é igual a: " + div);
        System.out.println("O resultado da contatenação é igual a: " + num1 + num2);
    }
}
