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
public class EntryPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle1 = new Circle (2.5);
        Circle circle2 = new Circle (2.5);
        int resul=circle1.compareTo(circle2);
        if(resul==0)
            System.out.println("Son iguales");
        else
        System.out.println("No son iguales");
        
        
        Rectangle rec1 = new Rectangle (10,6);
        Rectangle rec2 = new Rectangle (30,2);
        
        int resultRecs = rec1.compareTo (rec2);
        if(resultRecs==0)
               System.out.println("Son iguales");
        else
        System.out.println("No son iguales");
            
        
       
    }
    
}
