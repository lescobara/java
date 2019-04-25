package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FormularioBasicoSwing extends JFrame implements ActionListener
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Declaro atributos en donde se guardar� los valores digitados
	private JTextField textfield,textfield2,textfield3,textfield4;
	private JRadioButton masculinoButton,femeninoButton;
	
	//creamos el constructor
	public FormularioBasicoSwing() {
		  super("Formulario B�sico");
		  getContentPane().setLayout(new FlowLayout());
		  
		  //Creando campos del formulario
		  JLabel label = new JLabel("Digita Nombre:");
		  textfield = new JTextField(20);
		  JLabel label2 = new JLabel("Digita Apellidos:");
		  textfield2 = new JTextField(20);
		  JLabel label3 = new JLabel("Digita Edad:");
		  textfield3= new JTextField(5);
		  JLabel label4 = new JLabel("Digita C�digo");
		  textfield4= new JTextField(8);
		  //Creando los Radio Buttons para seleccionar g�nero
		  JLabel label5 = new JLabel("Selecciona G�nero");
		  masculinoButton   = new JRadioButton("Masculino");
		  femeninoButton   = new JRadioButton("Femenino");
		  //Creando Bot�n y a�adiendo el listener	 
		  JButton boton = new JButton("Enviar");
		  boton.addActionListener((ActionListener) this);
		  
		  //A�adiendo componentes
		  getContentPane().add(label);
		  getContentPane().add(textfield);
		  getContentPane().add(label2);
		  getContentPane().add(textfield2);
		  getContentPane().add(label3);
		  getContentPane().add(textfield3);
		  getContentPane().add(label4);
		  getContentPane().add(textfield4);
		  getContentPane().add(label5);
		  getContentPane().add(masculinoButton);
		  getContentPane().add(femeninoButton);
		  getContentPane().add(boton);
		  
		  setSize(400,300);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	//M�todo declarado para activar el Listener
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//Al momento de oprimir el bot�n se crea un objeto de la clase estudiante
		Estudiante objetoEstudiante=new Estudiante();
		
		//invoco lo m�todos set para extraer los datos del JTextField
		objetoEstudiante.setNombre(textfield.getText());
		objetoEstudiante.setApellidos(textfield2.getText());
		objetoEstudiante.setEdad(Integer.valueOf(textfield3.getText()));
		objetoEstudiante.setCodigo(textfield4.getText());
		objetoEstudiante.setGenero(this.selectorGenero());
		//mostrar datos en pantalla con un mensaje
		FormularioRespuesta objetoRespuesta=new FormularioRespuesta(objetoEstudiante);
		objetoRespuesta.setVisible(true);
	}
	
	//Metodo declarado para asignar el valor del g�nero
	public String selectorGenero(){
		//Declaro Variable privada del m�todo
		String genero;
		
		/*Si el radio button masculino es seleccionado
		 * entonces el valor de la variable es 
		 * Masculino y retorno la variable*/
		
		if (masculinoButton.isSelected()==true)
		{
			genero="Masculino";
		}
		else
		{
			genero="Femenino";
		}
		return genero;
	}
	
	//M�todo PPAL
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			FormularioBasicoSwing objeto=new FormularioBasicoSwing();
			objeto.setVisible(true);
		}

}
