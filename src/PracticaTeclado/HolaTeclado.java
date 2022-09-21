/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTeclado;

/**
 *
 * @author danic
 */
public class HolaTeclado {
    
        public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        
        System.out.print("Dime tu nombre:");
        nombre = Teclado.LeeCadena();
        
        System.out.print("Dime tu edad:");
        edad = Teclado.LeeEntero();
        
        System.out.print("Hola "+nombre+", tienes "+edad+" años");
        }
}
