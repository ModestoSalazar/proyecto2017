/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal1;

/**
 *
 * @author alum_tes_c
 */
public abstract class Animal1 {
    private double peso;
    private double altura;
 /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public abstract void correr();
    public abstract void comer(); 
    public abstract void dormir();
    
    public void saltar(){
    System.out.println("El animal salta");
    }
   
    
}
