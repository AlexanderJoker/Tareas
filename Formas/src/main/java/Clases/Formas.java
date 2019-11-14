
package Clases;

/**
 *
 * @author Alexander Tinoco
 */

public class Formas {
   private String dibujar;
   private String color;   
public Formas()
{
}
public void EstablecerColor(String color){
this.color=color;
System.out.println(color);
}
public void Dibujar(String dibujar)
{
this.dibujar=dibujar;    
}
}