/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.isaac.atv3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Aluno_Tarde
 */
public class Atv3 {

    public static void main(String[] args) throws IOException {
        Televisor tv = new Televisor();
        int n1, n2,n3, n4;
        tv.ligado = false;
        tv.canal = 4;
        tv.volume = 6;
        Scanner liga = new Scanner (System.in);
        System.out.println("Digite 1 para ligar a televisão: ");
        n1 = liga.nextInt();
            
        if(n1 == 1){
            n2 = 0;
            
            while(n1 != 0){
                if(n2 == 5){
                    System.out.println("(1) - Liga televisor (2) - Desligar Console");
                    n3 = liga.nextInt();
                    switch (n3){
                        case 1:
                            tv.ligarTelevisor();
                        break;
                        case 2:
                            n1 = 0;
                    }
                }
                System.out.println("---------------- MENU -----------------");
                System.out.println("1 para MENU, 2 Deligar tv, 3 fim");
                 n4 = liga.nextInt();
                 if(n4 == 2){
                   tv.desligartelevisor();
                   tv.ligado = false;
                   tv.canal = 4;
                   tv.volume = 6;
                   break;
                 }else if(n4 == 3){
                     n1 = 0;
                 }else{
            
            System.out.println("(0) Mostrar Status (1) - Aumentar volume, (2) - Diminuir volume");
            System.out.println("(3) - Subir canal, (4) - Decer canal, (5) - Desligar tv, (6) Deligar Console");
            n2 = liga.nextInt();
          
           switch (n2){
               case 0:
                   tv.mostrarStatus(); 
                   break;
               case 1:
                   tv.aumentarVolume();
                   
                   break;
               case 2:
                   tv.reduzirVolume();
                   break;
               case 3:
                   tv.subirCanal();
                   break;
               case 4:
                   tv.descerCanal();
                   break;
               case 5:
                   tv.desligartelevisor();
                   tv.ligado = false;
                   tv.canal = 4;
                   tv.volume = 6;
                   break;
               case 6:
                   n1 = 0;
                   System.out.println("Console desligado!!");
                   break;
           }
          }
            }       
            System.out.println("Tv desligada, (F6) para ligar!");
        }    
    }
}