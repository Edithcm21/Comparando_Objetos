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
public class Circle implements Draw,Calculate,Comparable<Circle>{
 private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }


    @Override
    public double calculateArea() {
        return Math.PI * (radio*radio);
    }

    @Override
    public void draw(int color) {

    }

    @Override
    public void fill(int color) {

    }

    @Override
    public int compareTo(Circle Circle2) {
        
        int foo = 0;
        if (this.calculateArea() > Circle2.calculateArea())
            foo = 1;
        if (this.calculateArea() < Circle2.calculateArea())
            foo= -1;
        return foo;
    }
    
    
}
