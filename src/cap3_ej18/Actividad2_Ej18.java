package cap3_ej18;

import java.util.Scanner;

public class Actividad2_Ej18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        InfoEmpleado empleado = new InfoEmpleado();
        
        System.out.println("Ingrese el código del empleado: ");
        empleado.codigo = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Ingrese el nombre del empleado: ");
        empleado.nombre = entrada.nextLine();
        
        System.out.println("Ingrese el número de horas trabajadas al mes del empleado: ");
        empleado.horas_trabajadas = entrada.nextDouble();
        
        System.out.println("Ingrese el valor por hora trabajada: ");
        empleado.valor_hora = entrada.nextDouble();
        
        System.out.println("Ingrese el porcentaje de retención en la fuente: ");
        empleado.p_retencionf = entrada.nextDouble();
       
        System.out.println("\nCódigo del empleado: " + empleado.codigo);
        System.out.println("Nombre del empleado: " + empleado.nombre);
        System.out.println("Salario bruto del empleado: " + empleado.calcularSalarioBruto());
        System.out.println("Salario neto del empleado: " + empleado.calcularSalarioNeto());
    }
    
}
