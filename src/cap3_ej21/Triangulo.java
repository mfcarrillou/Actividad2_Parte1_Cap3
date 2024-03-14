package cap3_ej21;

public class Triangulo {
    double a,b,c,s;
    
    protected double calcularPerimetro(){
        return a + b + c;
    }
    
    protected double calcularSemiperimetro(){
        return calcularPerimetro()/ 2;
    }
    
    protected double calcularArea(){
        s = calcularSemiperimetro();
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
        
}
