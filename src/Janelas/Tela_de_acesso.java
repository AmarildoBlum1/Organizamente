package Janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conexaomysql.conexãoMysql;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

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
		tfUsuario.setBounds(139, 195, 353, 23);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		tfsenha = new JPasswordField();
		tfsenha.setBounds(139, 267, 353, 23);
		contentPane.add(tfsenha);
		
		JLabel lbbemvindo = new JLabel("Seja Bem-Vindo ao Organizamente");
		lbbemvindo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 21));
		lbbemvindo.setDoubleBuffered(true);
		lbbemvindo.setBounds(124, 74, 409, 50);
		contentPane.add(lbbemvindo);
		
		JButton btncadastro = new JButton("Cadastre-se");
		btncadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela_cadastro exibir = new Tela_cadastro();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btncadastro.setBounds(324, 320, 168, 23);
		contentPane.add(btncadastro);
		
		JButton btnacesso = new JButton("Login");
		btnacesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					
					Connection con = conexãoMysql.faz_conexao();
					
					String sql = "select * from tb_Usuario where nomeUsuario=? and senha=?";
					
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, tfUsuario.getText());
					stmt.setString(2, new String (tfsenha.getPassword()));
					
					ResultSet rs = stmt.executeQuery();
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Esse usuário existe");
					}else {
						JOptionPane.showMessageDialog(null, "Esse usuário não existe");
					}
					
					stmt.close();
					con.close();
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnacesso.setBounds(139, 320, 168, 23);
		contentPane.add(btnacesso);
	}
}
