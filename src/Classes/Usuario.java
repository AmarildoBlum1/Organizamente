package Classes;
import java.io.PrintStream;
import java.util.Scanner;

public class Usuario {
	
	public static String cpfUsuario;
	protected static  String nomeUsuario;
	protected  static String email;
	protected  String senha;
	boolean login;

public Usuario(String cpfUsuario, String nomeUsuario, String email, String senha) {
	cpfUsuario = this.cpfUsuario;
	nomeUsuario = this.nomeUsuario;
	email = this.email;
	senha = this.senha;
	login = false;
	}

public Usuario(String cpfUsuario2) {
}

public static  String getCpfUsuario() {
	return cpfUsuario;
}

public  void setCpfUsuario(String cpfUsuario) {
	this.cpfUsuario = cpfUsuario;
}

public static  String getNomeUsuario() {
	return nomeUsuario;
}

public  void setNomeUsuario(String nomeUsuario) {
	this.nomeUsuario = nomeUsuario;
}

public  static String getEmail() {
	return email;
}

public  void setEmail(String email) {
	this.email = email;
}

public String getSenha() {
	return senha;
}

public  void setSenha(String senha) {
	this.senha = senha;
}

public boolean isLogin() {
	return login;
}

public void setLogin(boolean login) {
	this.login = login;
	
	}
}



