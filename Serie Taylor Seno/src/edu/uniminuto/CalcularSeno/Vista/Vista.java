package co.edu.uniminuto.CalcularSeno.Vista;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Vista extends javax.swing.JFrame {

	public JFrame frame;
	public JTextField jtf_x;
	public JTextField jtf_respuesta;
    public JButton jb_calcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 434, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sen(\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 51));
		lblNewLabel.setBounds(10, 11, 141, 111);
		frame.getContentPane().add(lblNewLabel);
		
		JTextField jtf_x = new JTextField();
		jtf_x.setFont(new Font("Times New Roman", Font.PLAIN, 51));
		jtf_x.setBounds(110, 45, 66, 53);
		frame.getContentPane().add(jtf_x);
		jtf_x.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(")\r\n");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 51));
		lblNewLabel_1.setBounds(186, 11, 40, 111);
		frame.getContentPane().add(lblNewLabel_1);
		
		jb_calcular = new JButton("Calcular");
		jb_calcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		jb_calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jb_calcular.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		jb_calcular.setBounds(220, 51, 131, 45);
		frame.getContentPane().add(jb_calcular);
		
		jtf_respuesta = new JTextField();
		jtf_respuesta.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		jtf_respuesta.setBounds(141, 155, 253, 33);
		frame.getContentPane().add(jtf_respuesta);
		jtf_respuesta.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Es igual a:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(10, 155, 201, 35);
		frame.getContentPane().add(lblNewLabel_2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}

		
}
