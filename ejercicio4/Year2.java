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
public class Year2 {
    
    public int dias;

    public Year2() {
        this.dias = 365;
    }

    public void daysElapsed(int mes, int dia) {
        int[] meses = {0, 31, 28, 31, 30, 31, 30, 30, 31, 30, 31, 30, 31};
        for (int i = 0; i < mes; i++) {
            dia += meses[i];
        }
        System.out.println("Han transcurrido "+dia+" dias desde 1 de Enero");
    }

    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }


}
