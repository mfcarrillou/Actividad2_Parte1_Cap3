package cap3_ej19;

import java.util.Scanner;

public class Actividad2_Ej19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TrianguloEquilatero trianguloEq = new TrianguloEquilatero();
        
        System.out.println("Ingrese el valor de un lado del triángulo equilátero: ");
        trianguloEq.lado = entrada.nextDouble();
        
        System.out.println("\nPerímetro del triángulo equilátero: " + trianguloEq.calcularPerimetro());
        System.out.println("Altura del triángulo equilátero: " + trianguloEq.calcularAltura());
        System.out.println("Área del triángulo equilátero: " + trianguloEq.calcularArea()); 
    }
    
}
