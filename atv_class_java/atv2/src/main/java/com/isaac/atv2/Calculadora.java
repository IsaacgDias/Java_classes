/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.atv2;

/**
 *
 * @author Aluno_Tarde
 */
public class Calculadora {
    int soma,subtracao;
    double divisao,multiplicacao,resto;
    double t1,t2,t3,t4,t5;
    void exibirSoma(){
        t1 = this.soma + this.soma;
        System.out.println("Soma: " + t1);
    }
    void exibirSubtracao(){
        t2 = this.soma - this.soma;
        System.out.println("Subtração: " + t2);
    }
    void exibirDivisao(){
        t3 = this.divisao / this.divisao;
        System.out.println("Divisão: " + t3);
    }
    void exibirMultiplicacao(){
        t4 = this.multiplicacao * this.multiplicacao;
        System.out.println("Divisão: " + t4);
    }
    void exibirResto(){
        t5 = this.resto % this.resto;
        System.out.println("Resto: " + t5);
    }
    
    
}
