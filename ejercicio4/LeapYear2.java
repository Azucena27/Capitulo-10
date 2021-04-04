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
public class LeapYear2 extends Year2{
    
    public LeapYear2() {
        this.dias = 366;
    }

    public void daysElapsed(int mes, int dia) {
        int[] meses = {0, 31, 29, 31, 30, 31, 30, 30, 31, 30, 31, 30, 31};
        for (int i = 0; i < mes; i++) {
            dia += meses[i];
        }
      System.out.println("Han transcurrido "+dia+" dias desde 1 de Enero");
    }

    @Override
    public int getDias() {
        return super.getDias();
    }
    
}
