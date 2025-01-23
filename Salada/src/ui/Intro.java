package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private JPanel panelRegistro;
	private JButton btnRegistro;
	private JPanel panelLogin;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JTextField tfEmail;
	private JPasswordField tfPassword;
	private JButton btnIniciar;

	/**
	 * Create the frame.
	 */
	public Intro() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Intro.class.getResource("/img/ola.jpg")));
		setTitle("Salada: Intro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 361);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(192, 192, 192));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		panelPrincipal.add(getPanelRegistro());
		panelPrincipal.add(getPanelLogin());
		setLocationRelativeTo(null);
	}

	private JPanel getPanelRegistro() {
		if (panelRegistro == null) {
			panelRegistro = new JPanel();
			panelRegistro.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Registro",
					TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelRegistro.setBounds(156, 214, 332, 97);
			panelRegistro.setLayout(null);
			panelRegistro.add(getBtnRegistro());
		}
		return panelRegistro;
	}

	private JButton getBtnRegistro() {
		if (btnRegistro == null) {
			btnRegistro = new JButton("Registro");
			btnRegistro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					iniciarVentanaRegistro();
				}
			});
			btnRegistro.setForeground(new Color(255, 255, 255));
			btnRegistro.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
			btnRegistro.setBackground(new Color(0, 102, 153));
			btnRegistro.setMnemonic('R');
			btnRegistro.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnRegistro.setBounds(93, 24, 145, 46);
		}
		return btnRegistro;
	}

	private JPanel getPanelLogin() {
		if (panelLogin == null) {
			panelLogin = new JPanel();
			panelLogin.setLayout(null);
			panelLogin.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Inicio", TitledBorder.LEADING,
					TitledBorder.TOP, null, new Color(0, 0, 0)));
			panelLogin.setBounds(39, 17, 565, 178);
			panelLogin.add(getLblEmail());
			panelLogin.add(getLblPassword());
			panelLogin.add(getTfEmail());
			panelLogin.add(getTfPassword());
			panelLogin.add(getBtnIniciar());
		}
		return panelLogin;
	}

	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email:");
			lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			lblEmail.setBounds(10, 26, 109, 26);
		}
		return lblEmail;
	}

	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password:");
			lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			lblPassword.setBounds(10, 78, 109, 26);
		}
		return lblPassword;
	}

	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setBorder(new LineBorder(new Color(0, 0, 0)));
			tfEmail.setText("example@email.com");
			tfEmail.setBounds(97, 30, 437, 21);
			tfEmail.setColumns(10);
		}
		return tfEmail;
	}

	private JPasswordField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JPasswordField();
			tfPassword.setBorder(new LineBorder(new Color(0, 0, 0)));
			tfPassword.setBounds(97, 81, 437, 21);
		}
		return tfPassword;
	}

	private JButton getBtnIniciar() {
		if (btnIniciar == null) {
			btnIniciar = new JButton("Iniciar");
			btnIniciar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkIniciar();
				}
			});
			btnIniciar.setMnemonic('I');
			btnIniciar.setForeground(Color.WHITE);
			btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnIniciar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
			btnIniciar.setBackground(new Color(0, 102, 153));
			btnIniciar.setBounds(207, 121, 145, 46);
		}
		return btnIniciar;
	}

	private void checkIniciar() {
		if (getTfEmail().getText().isBlank() || getTfEmail().getText().isEmpty() || getTfPassword().getText().isBlank()
				|| getTfPassword().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "El email/password no pueden estar vacíos");
		} else {
			iniciarVentanaRegistro();
		}
	}

	private void iniciarVentanaRegistro() {
		Registro frame = new Registro();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
