public class Polinomio{
/**********************************************************/
/*             Campos o caracteristicas                   */
/**********************************************************/
  Double a;
  Double b;
  Double c;
/**********************************************************/
/*                    Constructores                       */
/**********************************************************/
  Polinomio(){
    a = b = c = 1.0;
  }
  Polinomio (Double a, Double b, Double c){
	this.a=a; this.b=b; this.c=c;
  }
/**********************************************************/
/*                        Acceso                          */
/**********************************************************/

  public Double getA(){
	return a;
  }
  public void setA(Double a){
	this.a = a;
  }
  public Double getB(){
	return b;
  }
  public void setB(Double b){
	this.b = b;
  }
  public Double getC(){
	return c;
  }
  public void setC(Double c){
	this.c = c;
  }
  @Override
  public String toString(){
	return " "+a+"x^2+"+b+"x+"+c+"=0";
  }
/**********************************************************/
/*                  Método Operaciones                    */
/**********************************************************/
public Polinomio suma(Polinomio p){
  return new Polinomio(a+p.a,b+p.b,c+p.c);
}
/**********************************************************/
/*                       Método Main                      */
/**********************************************************/
  public static void main(String[] arg){
	Polinomio p1 = new Polinomio();
    System.out.println("Ejemplo polinomio");
    System.out.println("p1="+p1);
	System.out.println("p1="+p1.suma(p1));
  }
}