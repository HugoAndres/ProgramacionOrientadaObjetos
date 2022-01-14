

public class Coordenada{
static int contador;
/**********************************************************/
/*           Posición de las coordenadas                  */
/**********************************************************/	
  public enum Cuadrante{
	SOBRE_EJES,
	CUADRANTE_1,
	CUADRANTE_2,
	CUADRANTE_3,
	CUADRANTE_4
  };
/**********************************************************/
/*             Campos o caracteristicas                   */
/**********************************************************/	
  
  /* Elementos de las coordenadas */
  private Integer x;
  private Integer y; 
  private Cuadrante cuadrante;

/**********************************************************/
/*                  Métodos privados                      */
/**********************************************************/
private void calcula_cuadrante(){
  if (x==0 || y==0)
	cuadrante = Cuadrante.SOBRE_EJES;
  else if(x>0)
	cuadrante = y>0?Cuadrante.CUADRANTE_1:
             Cuadrante.CUADRANTE_4;
  else
	cuadrante = y>0?Cuadrante.CUADRANTE_2:
             Cuadrante.CUADRANTE_3;  
}

/**********************************************************/
/*                    Constructores                       */
/**********************************************************/
  // Cosntruye Origen;
  public Coordenada(){
	x = y = 0;
	cuadrante=Cuadrante.SOBRE_EJES;
  }
  
  public Coordenada(Integer x, Integer y){
	this.x = x;
	this.y = y;
	calcula_cuadrante();
  }
/**********************************************************/
/*                        Acceso                          */
/**********************************************************/
  // Lectura
  public Integer getX(){
	return x;
  }
  
  public Integer getY(){
	return y;
  }
  public Cuadrante getCuadrante(){
	return cuadrante;
  }
  // Modificación
  public void setX(Integer x){
	this.x = x;
	calcula_cuadrante();
  }
  public void setY(Integer y){
	this.y = y;
	calcula_cuadrante();
  }
  @Override
  public String toString(){
	return "("+x+","+y+")";
  }
 
public Coordenada suma(Coordenada c ){
  return new Coordenada(x+c.x,y+c.y);
}
  
/* *********************************************************/
/*                       Método Main                      */
/**********************************************************/

  public static void main(String[] arg){
	Coordenada c1,c2,c3,c4;
	c1 = new Coordenada( 1, 1);
	c2 = new Coordenada( 1,-1);
	c3 = new Coordenada(-1, 1);
	c4 = new Coordenada(-1,-1);
	System.out.print("Las coordenadas son:\n");
	System.out.print(c1); System.out.println(c1.getCuadrante());
	System.out.print(c2); System.out.println(c2.getCuadrante());
	System.out.print(c3); System.out.println(c3.getCuadrante());
	System.out.print(c4); System.out.println(c4.getCuadrante());
	c1.setX(0);	
	System.out.print("Modificados son:\n");
	System.out.print(c1); System.out.println(c1.getCuadrante());
	System.out.println("------------------PRUEBA-------------");
	System.out.println("Numero de instancias"+c1.suma(c2));
  }
}
