/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.isaac.aula04;

/**
 *
 * @author Aluno_Tarde
 */
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.cor = "Azul";
        c1.marca = "BIC";
        c1.preco = 2.50f;
        c1.quantidade = 6;
        int id = 1 + (int) (Math.random() * 100); //números aleatórios de 1 a 99
        c1.inserirCliente("Isaac", id);
        
        c1.exibirCliente();
        c1.exibirCor();
        c1.exibirMarca();
        c1.calcularPrecoQtd();
        c1.verificaCor();
        
        
    }
    
}
