package exeptionPkg;

public class MalNumeroADividir extends Exception{
	
	//Tomado de https://elbauldelprogramador.com/manejar-excepciones-en-java/
	
	MalNumeroADividir() {
	       super("No es posible dividir entre cero");
	   }
	
	public static float dividir(float a, float b)throws MalNumeroADividir{
	    if(b == 0){
	        throw new MalNumeroADividir();
	    }
	    return a / b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a;
	    try
	    {
	        a = dividir(5,0);
	        System.out.println("Valor de a = "+a);
	    }
	    catch(MalNumeroADividir err)
	    {
	        System.out.println(err);
	    }
	    finally{
	        a = 0;
	    }
	    System.out.println("Valor de a = "+a);

	}

}
