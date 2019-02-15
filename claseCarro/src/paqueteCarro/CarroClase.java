package paqueteCarro;

import javax.swing.JOptionPane;

public class CarroClase {
	
	//Definición de atributos
	private int velocidad;
	private String marca;
	private int modelo;

	public CarroClase(int ingresoVelocidad, int ingresoCambio, String ingresoMarca, int ingresoModelo) {
		// TODO Auto-generated constructor stub
		velocidad=ingresoVelocidad;
		marca=ingresoMarca;
		modelo=ingresoModelo;
	}

	//metodos
	public int cajaDeVelocidad (int ingresoCambio)
	{
		for (int i=ingresoCambio;i<=5;i++)
		{
			if (i==1)
			{
				velocidad=velocidad*1;
				//System.out.println("velocidad 1="+velocidad);
			}
		
			if (i==2)
			{
				velocidad=velocidad*2;
				//System.out.println("velocidad 2="+velocidad);
			}
			
			if (i==3)
			{
				velocidad=velocidad*3;
				//System.out.println("velocidad 3="+velocidad);
			}
		
			if (i==4)
			{
				velocidad=velocidad*4;
				//System.out.println("velocidad 4="+velocidad);
			}
		}
		
		return velocidad;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ingresoVelocidad,modelo,ingresoCambio;
		String marca;

		marca=JOptionPane.showInputDialog("Ingrese la Marca");
		ingresoVelocidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad inicial"));
		modelo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo"));
		ingresoCambio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cambio"));
		//crear objeto del tipo carroClase
		CarroClase objetoCarrito=new CarroClase(ingresoVelocidad,ingresoCambio,marca,modelo);
				
		System.out.println("el carro de marca: "+marca+" modelo: "+modelo+ "con un una velocidad de:" +ingresoVelocidad+" y cambio:"+ingresoCambio);
		while (ingresoCambio<=5)
		{
			System.out.println("tiene una nueva velocidad de:" +objetoCarrito.cajaDeVelocidad(ingresoCambio));
		}
	}

}
