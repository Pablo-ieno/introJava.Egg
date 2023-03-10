/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.backend1.ejerciciosguia2;

/**
 *
 * @author iz-living
 */
public class ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 7;
        int suma = num1 + num2;
    
	double division = num1 / num2;
    
	boolean logico = num2 > num1;
    
	num1++;
        num2--;
        
        System.out.println("el resultado de la suma es " + suma);
        System.out.println("el resultado de la division es " + division);
        System.out.println("el valor lógico es " + logico);
        System.out.println("el valor " + num1++);
        System.out.println("el valor " + num2--);

    }
    
}
