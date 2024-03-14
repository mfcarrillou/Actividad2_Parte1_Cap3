package cap3_ej19;

public class TrianguloEquilatero {
    double lado;
    
    protected double calcularPerimetro(){
        return lado * 3;
    }
    
    protected double calcularAltura(){
        return (lado * Math.sqrt(3))/2;
    }
    
    protected double calcularArea(){
        return (Math.pow(lado,2) * Math.sqrt(3))/4;
    }
    
}
