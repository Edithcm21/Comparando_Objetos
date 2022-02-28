/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparando_Objetos;

/**
 *
 * @author edith
 */
public class Rectangle implements Draw,Calculate, Comparable<Rectangle>{
    
   private double altura;
    private double base;

    
    public Rectangle(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    

    @Override
    public double calculateArea() {
        return this.altura * this.base;
    }

    @Override
    public void draw(int color) {

    }

    @Override
    public void fill(int color) {

    }

    @Override
    public int compareTo(Rectangle o) {
        int foo = 0;
        if (this.calculateArea() > o.calculateArea())
            foo = 1;
        if (this.calculateArea() < o.calculateArea())
            foo = -1;
        return foo;
    }
    
}
