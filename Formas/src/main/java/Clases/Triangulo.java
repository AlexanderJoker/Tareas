package Clases;
/**
 *
 * @author Alexander Tinoco
 */
public class Triangulo extends Formas{
private int angulo;
private int angulo1;
public Triangulo()
 {   
 }
public void Dibujar()
{
System.out.println("Triangulo \n El area del triangulo es: " + angulo);
}
public void areaTriangulo(int angulo, int angulo1)
{
 angulo=(angulo*angulo1)/2;
 this.angulo=angulo;
}
}