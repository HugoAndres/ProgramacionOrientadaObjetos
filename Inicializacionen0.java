/*Crea una clase que contenga variables sin inicializar para
verificar que Java inicializa automáticamente*/

public class Ejercicio1{
  int x;
  public static void main(String[] arg){
    Ejercicio1 e1 = new Ejercicio1();//Crear objetojeto
    System.out.println("El valor es "+e1.x);
  }
}

