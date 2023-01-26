package Ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AltaSocio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtRut;
	private JTextField txtDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaSocio frame = new AltaSocio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AltaSocio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rodolfo\\Downloads\\Logo Centro C. (3).jpg"));
		lblNewLabel_1.setBounds(261, 54, 252, 263);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAltaDeSocio = new JLabel("ALTA DE SOCIO");
		lblAltaDeSocio.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblAltaDeSocio.setBounds(38, 11, 143, 43);
		contentPane.add(lblAltaDeSocio);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 65, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblRut = new JLabel("Rut");
		lblRut.setBounds(10, 93, 46, 14);
		contentPane.add(lblRut);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(10, 124, 46, 14);
		contentPane.add(lblDireccion);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(58, 62, 158, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtRut = new JTextField();
		txtRut.setColumns(10);
		txtRut.setBounds(58, 90, 158, 20);
		contentPane.add(txtRut);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(58, 121, 158, 20);
		contentPane.add(txtDireccion);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(150, 198, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(20, 198, 89, 23);
		contentPane.add(btnLimpiar);
	}

}
