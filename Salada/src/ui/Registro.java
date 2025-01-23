package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Toolkit;

public class Registro extends JFrame {

	private JPanel panelPrincipal;
	private JPanel panelRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registro.class.getResource("/img/ola.jpg")));
		setTitle("Salada: Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 472);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(153, 153, 153));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		panelPrincipal.add(getPanelRegistro(), BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}

	private JPanel getPanelRegistro() {
		if (panelRegistro == null) {
			panelRegistro = new JPanel();
			panelRegistro.setBackground(new Color(153, 153, 153));
		}
		return panelRegistro;
	}
}
