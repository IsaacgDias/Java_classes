/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String data_de_entrada;
    String Rg;
    double total;
    double anual;
    
    void exibirNome(){
        System.out.println("Nome do funcionário: " + this.nome);
    }
    void exibirDepartamento(){
        System.out.println("Nome do departamento: " + this.departamento);
    }
    void exibirSalario(){
        System.out.println("Salario: " + this.salario);
    }
    void exibirData(){
        System.out.println("Data de entrada no banco " + this.data_de_entrada);
    }
    void exibirRg(){
        System.out.println("RG: " + this.Rg);
        
    }
    void recebeAumento(){
        total = this.salario + 0.500;
    }
    void calculaGanhoAnual(){
        anual = this.total * 12;
    }
    void dados(){
        System.out.println("Valor do aumento do salario: " + this.total);
        System.out.println("Ganho por ano: " + this.anual);
    }
}
