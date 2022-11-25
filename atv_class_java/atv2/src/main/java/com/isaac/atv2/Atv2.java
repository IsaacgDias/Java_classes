/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.isaac.atv2;

/**
 *
 * @author Aluno_Tarde
 */
public class Atv2 {

    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        c1.soma = 3;
        c1.subtracao = 3;
        c1.divisao = 3;
        c1.multiplicacao = 3;
        c1.resto = 3;
        
        c1.exibirSoma();
        c1.exibirSubtracao();
        c1.exibirDivisao();
        c1.exibirMultiplicacao();
        c1.exibirResto();
        
    }
}
