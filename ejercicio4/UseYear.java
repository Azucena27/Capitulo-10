/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Azucena
 */
public class UseYear{
    
        public static void main(String[] args) {
        Year año1= new Year();
        System.out.println("Año 1: "+ año1.getDias());

        LeapYear año2 = new LeapYear();
        System.out.println("Año 2: "+ año2.getDias());
    }
        
}
