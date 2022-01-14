class Diagrama{
  Diagrama(){
    System.out.println("Diagrama");
  }
}

class Estructura extends Diagrama{
  Estructura(){
    System.out.println("Estructura");
  }
}

class Comportamiento extends Diagrama{
  Comportamiento(){
    System.out.println("Comportamiento");
  }
}
  
class Clases extends Estructura{
  Clases(){
    System.out.println("Clases");
  }
//EJERCICIO 1  
  static Diagrama d1 = new Clases();
}

class Componentes extends Estructura{
  Componentes(){
	System.out.println("Componentes");
  }
}

class Objetos extends Estructura{
  Objetos(){
    System.out.println("Objetos");
  }
}

class Perfiles extends Estructura{
  Perfiles(){
    System.out.println("Perfiles");
  }
}

class estructuraCompuesta extends Estructura{
  estructuraCompuesta(){
    System.out.println("estructuraCompuesta");
  }
}

class Despliegue extends Estructura{
  Despliegue(){
    System.out.println("Despliegue");
  }
}

class Paquete extends Estructura{
  Paquete(){
    System.out.println("Paquete");
  }
}

class Actividad extends Comportamiento{
  Actividad(){
    System.out.println("Actividad");
  }
}

class Integracion extends Comportamiento{
  Integracion(){
	System.out.println("Integracion");
  }
}

class casoDeUso extends Comportamiento{
  casoDeUso(){
    System.out.println("casoDeUso");
  }
}

class Estados extends Comportamiento{
  Estados(){
    System.out.println("Estados");
  }
  
}

class Secuencia extends Integracion{
  Secuencia(){
  System.out.println("Secuencia");
  } 

//EJERCICIO 2
  Diagrama d2 = new Estructura();
//EJERCICIO 4
  Estructura e1 = new Clases();
  Estructura e2 = new Componentes();
  Estructura e3 = new Objetos();
  Estructura e4 = new Perfiles();
  Estructura e5 = new estructuraCompuesta();
  Estructura e6 = new Despliegue();
  Estructura e7 = new Paquete();
}

class Comunicacion extends Integracion{
  Comunicacion(){
    System.out.println("Comunicacion");
  }
}

class Interaccion extends Integracion{
  Interaccion(){
    System.out.println("Interaccion");
  }
}

class Sincronizacion extends Integracion{
  Sincronizacion(){
    System.out.println("Sincronizacion");
  }
}

class EjemploHerencia{
  public static void main(String[] arg){
//EJERCICIO 1
{System.out.println("-> Ejercicio 1 <-");}
Clases a = new Clases();
	  
//EJERCICIO 3
//	Secuencia a = new Secuencia();
  }
}



 

	
