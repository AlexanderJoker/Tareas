
import Help.Argentina;
import Help.Mexico;
import Help.Usa;
//@author Alexander Tinoco  
public class Main {
public static void main(String[] args) {
Usa us= new Usa();
Mexico mex=new Mexico();
Argentina argen=new Argentina();        
System.out.println("Pais: " + us.getPais() + 
"\n Presidente: " + us.getPresidente());
System.out.println("Pais: " + mex.getPais() + 
"\n Presidente: " + mex.getPresidente());
System.out.println("Pais: " + argen.getPais() + 
"\n Presidente: " + argen.getPresidente());         
}   
}