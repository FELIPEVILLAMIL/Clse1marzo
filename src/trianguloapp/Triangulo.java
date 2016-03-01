/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloapp;

/**
 *
 * @author Usuario7
 */
public class Triangulo {
        private Punto p1;
        private Punto p2;
        private Punto p3;
        
        private Color colorRell;
        private Color colorLine;

    public Triangulo(Punto p1, Punto p2, Punto p3, Color colorRell, Color colorLine) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.colorRell = colorRell;
        this.colorLine = colorLine;
    }
        
        
        public double CalcularArea(){
            double a=Math.sqrt(Math.pow(this.p1.getX()-this.p2.getX(), 2)+Math.pow(this.p1.getY()-this.p2.getY(), 2));
            double b=calcularDist(this.p2,this.p3);
            double c=  calcularDist(this.p3,this.p1); 
            double p=(a+b+c)/2;
            double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return area;
        }
        private double calcularDist(Punto a,Punto b){
            double res=Math.sqrt(Math.pow(a.getX()-b.getX(), 2)+Math.pow(a.getY()-b.getY(), 2));
            return res;
        }
        }
                
        
        
}
