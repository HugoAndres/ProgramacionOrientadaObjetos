/*Escribe un programa que invoque a un método calcular la
hipotenusa de un triangulo dados sus catetos.*/

public class Ejercicio2{
double opuesto;
double adyacente;

Ejercicio2 (double opuesto, double adyacente){
	this.opuesto = opuesto;
	this.adyacente = adyacente;
}

double hipotenusa(){
	return Math.sqrt(opuesto*opuesto + adyacente*adyacente);
}

public static void main(String [] arg){
	Ejercicio2 e1 = new Ejercicio2(3,4);
	System.out.println("La hipotenusa es: "+e1.hipotenusa());
}
}	
