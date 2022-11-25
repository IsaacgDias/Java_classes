/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Cliente {
    private String nome;
    private String endereco;
    private float renda;
    
    public void Cliente(String nome, String endereco, float renda){
            this.nome = nome;
            this.endereco = endereco;
            this.renda = renda;
    }
    public void exibirCliente(){
        System.out.println("--------- Informações do Cliente ------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Renda: " + this.renda);
        System.out.println("----------------------------------------");
    }
    public String getNome(){
            return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
            return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public float getRenda(){
        return renda;
    }
    public void setRenda(float renda){
        this.renda = renda;
    }
}
