package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private JPanel panelPrincipal;
	private JPanel panelRegistro;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblNacimiento;
	private JLabel lblSexo;
	private JLabel lblPassword;
	private JLabel lblPassword2;
	private JButton btnSiguiente;
	private JButton btnCancelar;
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JComboBox comboBox;
	private JRadioButton rdHombre;
	private JRadioButton rdMujer;
	private JPasswordField tfPassword;
	private JPasswordField tfPassword2;

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
		panelPrincipal.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Registro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		panelPrincipal.add(getPanelRegistro(), BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}

	private JPanel getPanelRegistro() {
		if (panelRegistro == null) {
			panelRegistro = new JPanel();
			panelRegistro.setBackground(new Color(153, 153, 153));
			panelRegistro.setLayout(null);
			panelRegistro.add(getLblNombre());
			panelRegistro.add(getLblApellidos());
			panelRegistro.add(getLblNacimiento());
			panelRegistro.add(getLblSexo());
			panelRegistro.add(getLblPassword());
			panelRegistro.add(getLblPassword2());
			panelRegistro.add(getBtnSiguiente());
			panelRegistro.add(getBtnCancelar());
			panelRegistro.add(getTfNombre());
			panelRegistro.add(getTfApellidos());
			panelRegistro.add(getComboBox());
			panelRegistro.add(getRdHombre());
			panelRegistro.add(getRdMujer());
			panelRegistro.add(getTfPassword());
			panelRegistro.add(getTfPassword2());
		}
		return panelRegistro;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			lblNombre.setBounds(20, 24, 65, 31);
		}
		return lblNombre;
	}
	private JLabel getLblApellidos() {
		if (lblApellidos == null) {
			lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			lblApellidos.setBounds(20, 79, 65, 31);
		}
		return lblApellidos;
	}
	private JLabel getLblNacimiento() {
		if (lblNacimiento == null) {
			lblNacimiento = new JLabel("Nacimiento:");
			lblNacimiento.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			lblNacimiento.setBounds(20, 134, 91, 31);
		}
		return lblNacimiento;
	}
	private JLabel getLblSexo() {
		if (lblSexo == null) {
			lblSexo = new JLabel("Sexo:");
			lblSexo.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			lblSexo.setBounds(20, 189, 65, 31);
		}
		return lblSexo;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password:");
			lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			lblPassword.setBounds(20, 244, 73, 31);
		}
		return lblPassword;
	}
	private JLabel getLblPassword2() {
		if (lblPassword2 == null) {
			lblPassword2 = new JLabel("Reintroduzca password:");
			lblPassword2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			lblPassword2.setBounds(20, 299, 172, 31);
		}
		return lblPassword2;
	}
	private JButton getBtnSiguiente() {
		if (btnSiguiente == null) {
			btnSiguiente = new JButton("Siguiente");
			btnSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnSiguiente.setForeground(new Color(255, 255, 255));
			btnSiguiente.setBackground(new Color(0, 153, 0));
			btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnSiguiente.setMnemonic('S');
			btnSiguiente.setBounds(430, 354, 100, 31);
		}
		return btnSiguiente;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnCancelar.setMnemonic('C');
			btnCancelar.setForeground(Color.WHITE);
			btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnCancelar.setBackground(new Color(255, 0, 0));
			btnCancelar.setBounds(537, 354, 100, 31);
		}
		return btnCancelar;
	}
	private JTextField getTfNombre() {
		if (tfNombre == null) {
			tfNombre = new JTextField();
			tfNombre.setBorder(new LineBorder(new Color(0, 0, 0)));
			tfNombre.setBounds(91, 24, 528, 31);
			tfNombre.setColumns(10);
		}
		return tfNombre;
	}
	private JTextField getTfApellidos() {
		if (tfApellidos == null) {
			tfApellidos = new JTextField();
			tfApellidos.setBorder(new LineBorder(new Color(0, 0, 0)));
			tfApellidos.setColumns(10);
			tfApellidos.setBounds(91, 79, 528, 31);
		}
		return tfApellidos;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBorder(new LineBorder(new Color(0, 0, 0)));
			comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"2000", "1999", "1998", "1997", "1996", "1995"}));
			comboBox.setBounds(118, 134, 109, 31);
		}
		return comboBox;
	}
	private JRadioButton getRdHombre() {
		if (rdHombre == null) {
			rdHombre = new JRadioButton("Hombre");
			rdHombre.setBorder(new LineBorder(new Color(0, 0, 0)));
			rdHombre.setSelected(true);
			rdHombre.setMnemonic('H');
			rdHombre.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			rdHombre.setBounds(91, 189, 109, 31);
		}
		return rdHombre;
	}
	private JRadioButton getRdMujer() {
		if (rdMujer == null) {
			rdMujer = new JRadioButton("Mujer");
			rdMujer.setBorder(new LineBorder(new Color(0, 0, 0)));
			rdMujer.setMnemonic('M');
			rdMujer.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			rdMujer.setBounds(226, 189, 109, 31);
		}
		return rdMujer;
	}
	private JPasswordField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JPasswordField();
			tfPassword.setBorder(new LineBorder(new Color(0, 0, 0)));
			tfPassword.setBounds(118, 244, 497, 31);
		}
		return tfPassword;
	}
	private JPasswordField getTfPassword2() {
		if (tfPassword2 == null) {
			tfPassword2 = new JPasswordField();
			tfPassword2.setBorder(new LineBorder(new Color(0, 0, 0)));
			tfPassword2.setBounds(226, 299, 377, 31);
		}
		return tfPassword2;
	}
}
