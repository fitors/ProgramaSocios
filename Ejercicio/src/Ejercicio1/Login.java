package Ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsario;
	private JPasswordField jpassContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 181);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 25));
		lblNewLabel.setBounds(158, 11, 104, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USUARIO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 69, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONTRASEÑA");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(10, 104, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUsario = new JTextField();
		txtUsario.setBounds(111, 65, 126, 20);
		contentPane.add(txtUsario);
		txtUsario.setColumns(10);
		
		jpassContraseña = new JPasswordField();
		jpassContraseña.setBounds(109, 101, 128, 20);
		contentPane.add(jpassContraseña);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char [] clave = jpassContraseña.getPassword();
				String claveFinal = new String(clave);
				if (txtUsario.getText().equalsIgnoreCase("fito")&& claveFinal.equals("1234")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido al Sistema", "Ingresaste", JOptionPane.INFORMATION_MESSAGE);
					Principal p = new Principal ();
					p.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "El Usasrio o Contraseña es Incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
					txtUsario.setText("");
					jpassContraseña.setText("");
					jpassContraseña.requestFocus();
					 
					
					
				}
				
					
				
			}
		});
		btnIngresar.setBackground(new Color(255, 255, 255));
		btnIngresar.setForeground(new Color(64, 0, 64));
		btnIngresar.setBounds(282, 65, 120, 53);
		contentPane.add(btnIngresar);
	}
}
