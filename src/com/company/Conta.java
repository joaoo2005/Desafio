package com.company;

public class Conta {

    int num1 = 5;
    double num2 = 5;
    double soma;
    double subtracao;
    double divisao;
    double contatena;



    public void setSoma(int soma){
        this.soma = num1 + num2;
    }

    public void setSubtracao(double subtracao){
        this.subtracao = num1 - num2;
    }

    public void setDivisao(double divisao){
        this.divisao = num1 / num2;
    }

    public void setContatena(int contatena){
        this.contatena = num1;
    }

    public int result1(){
        return (int) this.soma;
    }

    public int result2(){
        return (int) this.subtracao;
    }

    public int result3(){
        return (int) this.divisao;
    }

    public int result4(){
        return (int) this.contatena;
    }

    public void imprimir(){
        System.out.println("Soma = " + this.soma);
        System.out.println("Subtração = " + this.subtracao);
        System.out.println("Divisão = " + this.divisao);
        System.out.println("Contatenação = " + this.contatena);
    }
}

