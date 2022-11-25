/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv2;

import java.io.InputStream;

/**
 *
 * @author Aluno_Tarde
 */
public class ContaCorrente {
    private float saldo = -223;
    private String cliente;
    
    public void ContaCorrente(float saldo,String cliente){
    
    }
        public float getSaldo(){
            return saldo;
        }
        public void setSaldo(){
            if(saldo > 0){
             this.saldo = saldo;
             System.out.println("Saldo com sucesso!! " + this.saldo);
            }else{
                saldo = 0;
                System.out.println("Saldo atualizado para: " + saldo);
            }
        }
        public String getCliente(){
            return cliente;
        }
        public void setCliente(){
            this.cliente = cliente;
        }
}
