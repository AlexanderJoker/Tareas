package Encapsulamiento;
//@author Alexander Tinoco
 public class Ciudadano {
 //Atributos    
 private String nombre;
 private String apellido;
 private int edad;
 private int experiencia;
 public Ciudadano()
 {
  //Inicializacion de los atributos en el constructor   
  this.nombre=nombre;
  this.apellido=apellido;
  this.experiencia=experiencia;
  this.edad=edad;
 }
 public void setNombre(String nombre)
 {
  this.nombre=nombre;
 }
 public String getNombre()
 {
  return nombre;
 }
 public void setApellido(String apellido)
 {
  this.apellido=apellido;
 }
 public String getApellido()
 {
  return apellido;
 }
 public void setExperiencia(int experiencia)
 {
  this.experiencia=experiencia;
 }
 public int getExperiencia()
 {
  return experiencia;
 }
 public void setEdad(int edad)
 {
  this.edad=edad;
 }
 public int getEdad()
 {
  return edad;
 }
}