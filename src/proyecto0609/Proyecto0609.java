/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto0609;
 import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Proyecto0609 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese Valor en C°");
        float x = num.nextFloat();
        ConversorFahrenheit F = new ConversorFahrenheit();
        double resultado = F.obtenerFahrenheit(x);
        System.out.println("F°= "+resultado);
        Calculo C = new Calculo();
        
        C.area(resultado);
        C.longitud(resultado);
    
        System.out.println("Area: "+ C.area(resultado));
        System.out.println("Longitud: "+ C.longitud(resultado));  
    }
    
}
