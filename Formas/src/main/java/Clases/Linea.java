package Clases;
/**
 *
 * * @author Alexander Tinoco
 */
public class Linea extends Formas{
    private int largo;
    public Linea()
    {      
    }
    public void Dibujar()
    {
    System.out.println("Linea \n El tamaño de la linea es: " + largo);
    }
    public void Tamanio(int largo)
    {
    this.largo=largo;    
    }
    }