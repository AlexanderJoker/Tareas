package Clases;
/**
 *
 * * @author Alexander Tinoco
 */
public class Circulo extends Formas{
    private double radio;
    public Circulo()
    {
    }
    public void CalcularRadio(double radio)
    {
     radio=Math.PI*Math.pow(radio,2);
     this.radio=radio;
    }    
    public void Dibujar()
    {
    System.out.println("Circulo \n Su radio es: " + radio);
    }
    }
    

