package Janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Tela_de_acesso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-429,659
	 */
	private final JLabel label = new JLabel("New label");
	private JTextField tfUsuario;
	private JPasswordField tfsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_de_acesso frame = new Tela_de_acesso();
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
	public Tela_de_acesso() {
		setResizable(false);
		setTitle("Tela de acesso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(62, 188, 67, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(62, 258, 67, 37);
		contentPane.add(lblSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfUsuario.setBounds(139, 188, 353, 37);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		tfsenha = new JPasswordField();
		tfsenha.setBounds(139, 260, 353, 37);
		contentPane.add(tfsenha);
		
		JLabel lbbemvindo = new JLabel("Seja Bem-Vindo ao Organizamente");
		lbbemvindo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 21));
		lbbemvindo.setDoubleBuffered(true);
		lbbemvindo.setBounds(124, 74, 409, 50);
		contentPane.add(lbbemvindo);
	}
}
