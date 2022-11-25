/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.aula04;

/**
 *
 * @author Aluno_Tarde
 */
public class Caneta {
    String cor;
    String marca;
    float preco;
    int quantidade;
    float total;
    String nomeClient;
    int idCliente;
    
    void exibirCor(){
        System.out.println("Cor da caneta: " + this.cor);
    }
    void exibirMarca(){
        System.out.println("Marca da caneta: " + this.marca);
    }
    void calcularPrecoQtd(){
        total = this.preco * this.quantidade;
    }
    void inserirCliente(String nome, int id){
        this.nomeClient = nome;
        this.idCliente = id;
    }
    void exibirCliente(){
        System.out.println("--------- Informações do Cliente ------");
        System.out.println("ID: "+ this.idCliente);
        System.out.println("Nome: " + this.nomeClient);
        System.out.println("----------------------------------------");
    }
    void verificaCor(){
        
        if(this.cor.equals("Azul") || this.cor.equals("Preta")){
            System.out.println("Cor da caneta permitida!");
            System.out.println("Voçê comprou " + this.quantidade + " canetas.");
            System.out.println("Cada caneta custa R$" + this.preco);
            System.out.println("O valor total a pagar é de R$" + total);
        }else{
            System.out.println("Cor da caneta não permitida");
            System.out.println("Não foi possivel realizar a compra!");
        }
    }
}
