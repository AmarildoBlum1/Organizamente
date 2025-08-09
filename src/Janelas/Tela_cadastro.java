package Janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.TextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.DropMode;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class Tela_cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcpf;
	private JTextField txtNomeCompleto;
	private JTextField txtEmail;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_cadastro frame = new Tela_cadastro();
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
	public Tela_cadastro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 102));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtcpf = new JTextField();
		txtcpf.setHorizontalAlignment(SwingConstants.LEFT);
		txtcpf.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
		txtcpf.setText("Cpf");
		txtcpf.setBounds(167, 107, 429, 36);
		contentPane.add(txtcpf);
		txtcpf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cadastre-se aqui");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 37));
		lblNewLabel.setBounds(123, 11, 538, 85);
		contentPane.add(lblNewLabel);
		
		txtNomeCompleto = new JTextField();
		txtNomeCompleto.setText("Nome Completo");
		txtNomeCompleto.setHorizontalAlignment(SwingConstants.LEFT);
		txtNomeCompleto.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
		txtNomeCompleto.setColumns(10);
		txtNomeCompleto.setBounds(167, 154, 429, 36);
		contentPane.add(txtNomeCompleto);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
		txtEmail.setColumns(10);
		txtEmail.setBounds(167, 201, 429, 36);
		contentPane.add(txtEmail);
		
		txtSenha = new JTextField();
		txtSenha.setText("Senha");
		txtSenha.setHorizontalAlignment(SwingConstants.LEFT);
		txtSenha.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
		txtSenha.setColumns(10);
		txtSenha.setBounds(167, 248, 429, 36);
		contentPane.add(txtSenha);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(405, 343, 0, 20);
		contentPane.add(formattedTextField);
		
		JButton btnconcluircadastro = new JButton("Concluir Cadastro");
		btnconcluircadastro.setBounds(167, 305, 190, 23);
		contentPane.add(btnconcluircadastro);
	}
}
