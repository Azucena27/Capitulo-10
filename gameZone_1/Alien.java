/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

/**
 *
 * @author Azucena
 */
public class Alien {
    
    protected Integer ojos;
    protected String nombre;
    protected float maldad;
    
    public Alien (Integer ojos, String nombre, float maldad){
        this.ojos = ojos;
        this.nombre = nombre;
        this.maldad = maldad;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s, Numero de ojos: %d, Maldad: %.2f ", nombre, ojos, maldad);
    }
            
}
