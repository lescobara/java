package gui;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class FormularioRespuesta extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FormularioRespuesta(Estudiante fuenteEstudiante)
	{
		super("Formulario Respuesta");
		
		getContentPane().setLayout(null);
		JLabel label = new JLabel("Nombre: " +fuenteEstudiante.getNombre());
		JLabel label2 = new JLabel("Apellido: " +fuenteEstudiante.getApellidos());
		JLabel label3 = new JLabel("Edad: " +fuenteEstudiante.getEdad());
		JLabel label4 = new JLabel("Género: "+fuenteEstudiante.getGenero());
		JLabel label5 = new JLabel("Código: "+fuenteEstudiante.getCodigo());
		
		label.setBounds(100, 30, 300, 10);
		label2.setBounds(100, 50, 300, 10);
		label3.setBounds(100, 70, 300, 10);
		label4.setBounds(100, 90, 300, 10);
		label5.setBounds(100, 110, 300, 10);

		getContentPane().add(label);
		getContentPane().add(label2);
		getContentPane().add(label3);
		getContentPane().add(label4);
		getContentPane().add(label5);

		setVisible(true);
		setSize(400,300);
	}
	
}
