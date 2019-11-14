import Clases.Circulo;
import Clases.Cuadrado;
import Clases.Formas;
import Clases.Linea;
import Clases.Triangulo;
/**
 *
 * @author Alexander Tinoco
 */
public class Principal {   
    public static void main(String[] args) {
     Circulo cir= new Circulo();
     Formas fo=new Formas();
     Cuadrado cua=new Cuadrado();
     Linea lin=new Linea();
     Triangulo tri=new Triangulo();
     
     cir.CalcularRadio(30);          
     lin.Tamanio(70);
     tri.areaTriangulo(16, 20);
     cua.areaCuadrado(6);
      
     
     cir.Dibujar();
     cir.EstablecerColor("Circulo verde");
     lin.Dibujar();
     lin.EstablecerColor(" Linea negro");
     tri.Dibujar();
     tri.EstablecerColor(" Triangulo Azul");
     cua.Dibujar();
     cua.EstablecerColor("Cuadrado rojo");
    }    
}