/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Azucena
 */
public class Candle {
    
    public static final Integer COSTXPULGADA = 2;
    private Color color;
    private Integer height;
    private Integer precio;

    public Integer calcularPrecio(){
        return this.height * COSTXPULGADA;
    }
    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Integer height) {
        this.height = height;
        this.precio = calcularPrecio();
    }

    /**
     * @return the precio
     */
    public Integer getPrecio() {
        return precio;
    }
    
    
}
