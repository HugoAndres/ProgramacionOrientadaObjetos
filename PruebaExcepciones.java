class Coordenada {

    private Integer x;
    private Integer y;

    Coordenada() {
        x = y = 0;
    }

    Coordenada(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    Coordenada(String coordenada) {
        int inicio, coma, fin;
        inicio = coordenada.indexOf("(");
        coma = coordenada.indexOf(",");
        fin = coordenada.indexOf(")");
  
        try {
         x= Integer.parseInt(coordenada.substring(inicio+1, coma));
         y = Integer.parseInt(coordenada.substring(coma+1,fin));
      
        } catch (NumberFormatException excepcion) {
            x= 0;
            y=0;
        }
    }

    public String toString() {
        return "(" + x + "." + y + ")";
    }
}

public class PruebaExepciones {

    public static void main(String[] args) {
       Coordenada c1,c2,c3;
       c1= new Coordenada(3,5);
       c2 = new Coordenada("(3z,5)");
       c3= new Coordenada("(2,b)");
       System.out.println(""+c1);   
       System.out.println(""+c2);   
       System.out.println(""+c3);   
    }
    
}