/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.atv3;

/**
 *
 * @author Aluno_Tarde
 */
public class Televisor {
    int canal, volume;
    boolean ligado = false;
    
    void ligarTelevisor(){
        ligado = true;
    }
    void desligartelevisor(){
        ligado = false;
        canal = 4;
        volume = 6;
    }
    void aumentarVolume(){
        if(this.volume < 10){
        this.volume = this.volume + 1;
        System.out.println("Volume aumentado para: " + this.volume);
        }else{
            System.out.println("Volume no maximo");
        }
    }
    void reduzirVolume(){
        if(this.volume > 0){
        this.volume = this.volume - 1;
        System.out.println("Reduzio o volume para: " + this.volume);
        }else{
            System.out.println("Volume mudo");
        }
    }
    void subirCanal(){
        this.canal = this.canal + 1;
        System.out.println("Canal: " + this.canal);
    }
    void descerCanal(){
        this.canal = this.canal - 1;
        System.out.println("Canal: " + this.canal);
    }
    void mostrarStatus(){
        System.out.println("Esta no canal: " + this.canal);
        System.out.println("E no volume: " + this.volume);
    }
}
