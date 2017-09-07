/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto0609;

/**
 *
 * @author alumno
 */
public class Calculo {
  
    public double area(double L) {

        double area=0,PI=3.1416;
        //int number=0;
        try {
            
            area = PI*(L*L);

        } catch (Exception e) {
            System.out.println("Ocurrio un problema.!!!");
        }
        return area;
    }
    
        public double longitud(double L) {

        double longitud=0,PI=3.1416;
        //int number=0;
        try {
            
            longitud = 2*PI*L;

        } catch (Exception e) {
            System.out.println("Ocurrio un problema.!!!");
        }
        return longitud;
    }
}
