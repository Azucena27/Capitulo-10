/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

/**
 *
 * @author Azucena
 */
public class Die {

    protected int randomValue;

    public Die() {
        randomValue = ((int) (Math.random() * 100) % 6 + 1);
    }

    public void imprimir() {
        System.out.println("Valor del dado: " + randomValue);
    }
    
     public int getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(int randomValue) {
        this.randomValue = randomValue;
    }
}
