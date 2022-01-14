class RangoCar{
  Character min;
  Character max;
  RangoCar(char min, char max){
	  /*verifica el orden*/
    char aux_min, aux_max;
	aux_min = min<max?min:max;
	aux_max = min<max?max:min;
    this.min = min;
	this.max = max;
  }
  @Override
  public String toString(){
    return "["+min+"-"+max+"]";
  }
  
  public static void main (String [] arg){
    RangoCar r1 = new RangoCar('X','R');
	System.out.println(r1);
  }
}