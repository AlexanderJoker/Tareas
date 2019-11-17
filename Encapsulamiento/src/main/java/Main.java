import Encapsulamiento.Ciudadano;
import javax.swing.*;
 //@author Alexander Tinoco
public class Main 
{           
 public static void main(String[] args) 
  {
  Ciudadano persona= new Ciudadano();
  persona.setNombre("Alexander");
  persona.setApellido("Tinoco");
  persona.setEdad(19);
  persona.setExperiencia(2);
  /*String nombre;
  String apellido;
  int edad;
  int experiencia;
  nombre=JOptionPane.showInputDialog("Ingrese nombre");
  persona.setNombre(nombre);
  apellido=JOptionPane.showInputDialog("Ingrese apellido");
  persona.setApellido(apellido);     
  edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
  persona.setEdad(edad);
  experiencia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus años laborales"));
  persona.setExperiencia(experiencia);*/
  JOptionPane.showMessageDialog(null,"Su nombre es: " + persona.getNombre() + " "  
  + persona.getApellido() + "\n Su edad es: " + persona.getEdad() +
  "\n Experiencia laboral: " + persona.getExperiencia() + " Años");    
 }    
}
