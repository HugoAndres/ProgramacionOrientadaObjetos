import java.util.*;

class EjemploRandom{
  public static void main (String[] arg){
    Random aleatorio = new Random();
	Double promedio=0.0;
	Integer count=0;
	
	do
	{
	  promedio+=aleatorio.nextDouble();
	  count ++;
	  if (count%10000==0)
	    System.out.println("Numero: "+ count + " " + promedio);

	}while((promedio/count)<0.7);
	
	System.out.println("Numero: "+ count + " " + (promedio/count));
  }
}
	 