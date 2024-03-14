package cap3_ej21;

import java.util.Scanner;

public class Actividad2_Ej21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
       
        System.out.println("Ingrese el valor del primer lado del triángulo: ");
        triangulo.a = entrada.nextDouble();
        System.out.println("Ingrese el valor del segundo lado del triángulo: ");
        triangulo.b = entrada.nextDouble();
        System.out.println("Ingrese el valor del tercer lado del triángulo: ");
        triangulo.c = entrada.nextDouble();
        
        System.out.println("\nPerímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Semiperímetro del triángulo: " + triangulo.calcularSemiperimetro());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
    
}
