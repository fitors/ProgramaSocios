package Ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 453);
		contentPane =  new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(49, 34, 143, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnListar = new JButton("LISTAR SOCIOS");
		btnListar.setForeground(Color.BLACK);
		btnListar.setBounds(10, 237, 252, 43);
		contentPane.add(btnListar);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rodolfo\\Downloads\\Logo Centro C. (3).jpg"));
		lblNewLabel_1.setBounds(272, 77, 252, 263);
		contentPane.add(lblNewLabel_1);
		
		JButton btnBajaDeSocio = new JButton("BAJA DE SOCIO");
		btnBajaDeSocio.setForeground(Color.BLACK);
		btnBajaDeSocio.setBounds(10, 180, 252, 43);
		contentPane.add(btnBajaDeSocio);
		
		JButton btnAltaDeSocio = new JButton("ALTA DE SOCIO");
		btnAltaDeSocio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaSocio alta = new AltaSocio();
				alta.setVisible(true);
				alta.setLocationRelativeTo(null);
			}
		});
		btnAltaDeSocio.setForeground(Color.BLACK);
		btnAltaDeSocio.setBounds(10, 120, 252, 43);
		contentPane.add(btnAltaDeSocio);
		
		JButton btnBusMod = new JButton("BUSCAR O MODIFICAR");
		btnBusMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBusMod.setForeground(Color.BLACK);
		btnBusMod.setBounds(10, 291, 252, 43);
		contentPane.add(btnBusMod);
	}

}
