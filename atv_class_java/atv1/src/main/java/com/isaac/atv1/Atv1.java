/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.isaac.atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Atv1 {

    public static void main(String[] args) {
       Funcionario f1 = new Funcionario();
       f1.nome = "Joana";
       f1.departamento = "331-IJ";
       f1.salario = 3.356;
       f1.data_de_entrada = "17/11/2022";
       f1.Rg = "MG-10.234.567";
       
       f1.exibirNome();
       f1.exibirDepartamento();
       f1.exibirSalario();
       f1.exibirData();
       f1.exibirRg();
       f1.recebeAumento();
       f1.calculaGanhoAnual();
       f1.dados();
    }
}
