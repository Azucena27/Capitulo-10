/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Azucena
 */
public class HolidayCabinRental extends CabinRental {

    private static int RECARGO = 150;
    private int noFinSemana;
    private int noHabitacion;

    public HolidayCabinRental(int noFinSemana, int noHabitacion) {
        this.noHabitacion = noHabitacion;
       int alquiler;
        switch (this.noHabitacion){
            case 1: 
                alquiler = 950;
                break;
            case 2: 
                alquiler = 950;
                break;
            case 3: 
                alquiler = 950;
                break;
            default: 
                alquiler = 1100;
        }
        this.alquiler = alquiler*noFinSemana+RECARGO;
    }

    /**
     * @return the noFinSemana
     */
    public int getNoFinSemana() {
        return noFinSemana;
    }

    /**
     * @param noFinSemana the noFinSemana to set
     */
    public void setNoFinSemana(int noFinSemana) {
        this.noFinSemana = noFinSemana;
    }

    /**
     * @return the noHabitacion
     */
    public int getNoHabitacion() {
        return noHabitacion;
    }

    /**
     * @param noHabitacion the noHabitacion to set
     */
    public void setNoHabitacion(int noHabitacion) {
        this.noHabitacion = noHabitacion;
    }
    
}
