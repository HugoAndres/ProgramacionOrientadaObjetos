/*Escribe un programa que demuestre que independiente
mente de cuantos objetos se creen de una clase, sólo hay
una única instancia de un campo static.*/

public class Ejercicio3{
  double base;
  static double altura; //metodo de objeto si no tiene 
  static int numero;// variables de clase 
  
  Ejercicio3 (double base, double altura, int numero){
    this.base = base;
	this.altura = altura;
	this.numero = numero;
  }
  
  double area(){
	return base*altura/2;
  }
  
  public static void main (String[] arg){
	Ejercicio3 e1 = new Ejercicio3(3,5,1);
	System.out.println("El area del Triangulo "+e1.numero+" es:"+e1.area());
	
	Ejercicio3 e2 = new Ejercicio3(4,5,2);	
	System.out.println("El area del Triangulo "+e2.numero+" es:"+e2.area());
	
	Ejercicio3 e3 = new Ejercicio3(4,5,1);
	Ejercicio3 e4 = new Ejercicio3(4,5,4);
	System.out.println("El area del Triangulo "+e3.numero+" es:"+e1.area());
	System.out.println("El area del Triangulo "+e4.numero+" es:"+e2.area());
  }
  
} 
 