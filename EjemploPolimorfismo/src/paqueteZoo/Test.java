package paqueteZoo;

public class Test {
	 public static void main (String[] arg){
	 
	 /**Creamos anim, un objeto Perro de tipo Animal*/
	 Animal anim= new Perro("goliath") ;
	 anim.tipoAnimal();
	 anim.comunicarse();
	 System.out.println();
	   
	 /**Creamos perro, un objeto Perro de tipo Perro*/
	 Perro perro=new Perro("Firulais");
	 perro.tipoAnimal();
	 perro.comunicarse();
	 System.out.println();
	   
	 /**Creamos animalPolimorfico, un objeto perro de tipo Animal
	  * asignamos una referencia ya existente*/
	 System.out.println("Animal polimorfico");
	 Animal animalPolimorfico=perro;
	 animalPolimorfico.tipoAnimal();
	 System.out.println();
	   
	 /**reasignamos la referencia del objeto anim a el objeto perro
	  * esto es valido ya que ambos son de tipo Perro*/
	 perro=(Perro) anim;
	 perro.tipoAnimal();
	 System.out.println();
	  
	 /**Creamos gat, un objeto Gato de tipo Animal*/
	 Animal gat=new Gato("pichi");
	 gat.tipoAnimal();
	 gat.comunicarse();
	 System.out.println();
	  
	 /**Creamos cat, un objeto Gato de tipo IAnimal
	  * Para esto aplicamos polimorfismo usando la Interface*/
	 IAnimal cat = new Gato("pitufa");
	 cat.comunicarse();
	  
	 System.out.println("\nConstante en la interfaz Animal : "+IAnimal.valor);
	 } 
	}