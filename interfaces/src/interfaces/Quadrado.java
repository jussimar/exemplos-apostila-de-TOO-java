/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Jussimar
 */
public class Quadrado implements IAreaCalculavel{

    private int lado;
    
    public Quadrado(int lado){
        this.lado = lado;
    }
    @Override
    public double CalculaArea() {
        return this.lado * this.lado;
    }
    
}
