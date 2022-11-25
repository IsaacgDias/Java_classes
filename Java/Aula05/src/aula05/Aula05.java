/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

/**
 *
 * @author Aluno_Tarde
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Jogo game = new Jogo();
       game.setNome("Minecraft");
       game.setTipo("Sobrevivência");
       game.setPlataforma("PC");
       game.setValor(199.90);
       game.setQuant(5);
       
       System.out.println("Nome: " + game.getNome());
       System.out.println("Tipo: " + game.getTipo());
       System.out.println("Plataforma: " + game.getPlataforma());
       System.out.println("Valor: " + game.getValor());
       System.out.println("Quantidade: " + game.getQuant());
    }
    
}
