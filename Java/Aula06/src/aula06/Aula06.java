/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06;

/**
 *
 * @author Aluno_Tarde
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" ----------------- Objeto Carro -----------------");
        Carro v1 = new Carro("Opala","Chervolet","Preto");
        v1.setDirecao("Hidraulica");
        v1.setQtdPorta(2);
        System.out.println("Nome do carro: " + v1.getNome());
        System.out.println("Marca: " + v1.getMarca());
        System.out.println("Cor: " + v1.getCor());
        System.out.println("Tipo de direção: " + v1.getDirecao());
        System.out.println("Quantidade de porta: " + v1.getQtdPorta());
        

        System.out.println("------------------ Objeto Moto ---------------");
        Moto m1 = new Moto("Suzuki","Canin","Amarelo");
        m1.setCilindrada(150);
        m1.setCarenagem(true);
        System.out.println("Nome da moto: " + m1.getNome());
        System.out.println("Marca: " + m1.getMarca());
        System.out.println("Cor: " + m1.getCor());
        System.out.println("Cilindradas: " + m1.getCilindrada());
        System.out.println("Possuir Carenagem: " + m1.getCarenagem());
        
    }
    
}
