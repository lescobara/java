package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormularioBasicoSwing extends JFrame implements ActionListener
{
	
	//Declaro atributos en donde se guardar� los valores digitados
	private JTextField textfield,textfield2;
	
	//creamos el constructor
	public FormularioBasicoSwing() {
		  super("Formulario B�sico");
		  getContentPane().setLayout(new FlowLayout());
		  JLabel label = new JLabel("Introduce tu nombre:");
		  textfield = new JTextField("Nombre",20);
		  JLabel label2 = new JLabel("Introduce tu C�digo:");
		  textfield2= new JTextField("C�digo",20);
		  JButton boton = new JButton("Enviar");
		  boton.addActionListener((ActionListener) this);
		  getContentPane().add(label);
		  getContentPane().add(textfield);
		  getContentPane().add(label2);
		  getContentPane().add(textfield2);
		  getContentPane().add(boton);
		  setSize(400,300);
		}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//Al momento de oprimir el bot�n se crea un objeto de la clase estudiante
		Estudiante objetoEstudiante=new Estudiante();
		
		//invoco lo m�todos set para extraer los datos del JTextField
		objetoEstudiante.setNombre(textfield.getText());
		objetoEstudiante.setCodigo(textfield2.getText());
		
		//mostrar datos en pantalla con un mensaje
		JOptionPane.showMessageDialog(null, "El nombre del estudiante es:"+objetoEstudiante.getNombre()+" y el c�digo es:"+objetoEstudiante.getCodigo());

	}
	
	//M�todo PPAL
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			FormularioBasicoSwing objeto=new FormularioBasicoSwing();
			objeto.setVisible(true);
		}

}
