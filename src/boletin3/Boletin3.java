/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Consumo  consumo1= new Consumo();
     consumo1.setLitros(50f);
     consumo1.setpGas(1.57F);
     
     Consumo  consumo2= new Consumo(20f,5f,20f,7f);
     System.out.println("Consumo medio =" + consumo2.consumoMed());
     consumo2.setLitros(23f);
     System.out.println("Velocidad media =" + consumo2.getVmed());
    }
    
}
