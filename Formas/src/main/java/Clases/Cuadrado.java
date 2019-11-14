package Clases;

/**
 *
 * @author Alexander Tinoco
 */
public class Cuadrado extends Formas {
   private int area;
public Cuadrado()
 {     
 }
public void Dibujar()
{
System.out.println("Cuadrado \n  Color: El area del cuadrado es: " + area);
}
public void areaCuadrado(int area)
{
 area=(area*area);
 this.area=area;
}
} 