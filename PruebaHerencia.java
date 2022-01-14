class Figura 
{
	 
		Figura()
	{ 
			System.out.println("Constructor figura"); 
	}
} 

class Figura3D extends Figura
{
	static Figura f = new Cuadro();

	Figura3D()
	{
		System.out.println("Constructor figura 3D");

	}
}

class Figura2D extends Figura
{
	
	Figura2D()
	{
		System.out.println("Constructor figura 2D");

	}
}

class Linea extends Figura
{
	Linea()
	{
		System.out.println("Contructor Linea");
	}

} 


//clases hijas de figura 3D
class Prisma extends Figura3D
{
	Figura b = new Triangulo();
	Prisma()
	{ 
		System.out.println("Constructor Prisma"); 
	}
}

class Hexagonal extends Prisma
{

	Hexagonal()
	{ 
		System.out.println("Constructor Prisma Hexagonal"); 
	}
}

class Cubo extends Figura3D
{
	Cubo()
	{
		System.out.println("Constructor Cubo3D");
	}
}

class Esfera extends Figura3D
{
	Esfera()
	{
		System.out.println("Constructor Esfera"); 
	}
}
 
 //hijas de figura 2D
class Cuadro extends Figura2D
{
	Cuadro()
	{
		System.out.println("Constructor Cuadro"); 
	}
}

class Triangulo extends Figura2D
{
	Triangulo()
	{
		System.out.println("Constructor Triangulo"); 
	}
}

//clases hijas de linea
class Curva extends Linea
{
	Curva()
	{
		System.out.println("Constructor Linea Curva"); 
	}
}

class Recta extends Linea
{
	Recta()
	{
		System.out.println("Constructor Linea Recta"); 
	}
}

class Quebrada extends Linea
{
	Quebrada()
	{
		System.out.println("Constructor Linea Quebrada"); 
	}
}
//clase main 

public class PruebaHerencia 
{
	public static void main(String[] arg)
	{
		Hexagonal hex = new Hexagonal();
	}

}