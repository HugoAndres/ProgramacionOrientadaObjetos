import java.math.BigInteger;

class Ejemplo {
  int x; //Esta inicializada automaticamente por el constructor (variable)
  String cad; //Referencia objeto
  
  void asigna(int x){
	this.x = x;
  }
  
  @Override
  public String toString(){
	return "Esto es un ejemplo " + x;
  }
  public static void main(String[] arg){
	int y;
  Ejemplo e = new Ejemplo();//Crear objetojeto
	Ejemplo s = new Ejemplo();
	e.asigna(7);//Invoca el metodo asigna
	
    System.out.println("Salida= "+e); //Solo las cademas puede usar el +
	System.out.println("Salida= "+s);
  }
}
