package cap3_ej18;

public class InfoEmpleado {
    int codigo;
    String nombre;
    double horas_trabajadas, valor_hora, p_retencionf;
    
    protected double calcularSalarioBruto(){
        return horas_trabajadas * valor_hora;
    }
    
    protected double calcularSalarioNeto(){
        return calcularSalarioBruto() * (1-(p_retencionf/100));
    }
    
}
