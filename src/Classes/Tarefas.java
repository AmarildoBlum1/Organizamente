package Classes;
import java.sql.Date;

public class Tarefas extends Usuario {
	
	private static int id_tarefa;
	private String categoria;
	private String Titulo;
	private String Descricao;
	private Date diacriacao;
	private Date prazo;
	private boolean pentende;
	
	public Tarefas(String cpfUsuario, int id_tarefa, String categoria, String Titulo, String Descricao, Date diacriacao, Date prazo, boolean pentende) {
		super(cpfUsuario);
		cpfUsuario = this.getCpfUsuario();
		id_tarefa = this.id_tarefa;
		categoria = this.categoria;
		Titulo = this.Titulo;
		Descricao = this.Descricao;
		diacriacao = this.diacriacao;
		prazo = this.prazo;
		
	}
	
	public static int getId_tarefa() {
		return id_tarefa;
	}

	public void setId_tarefa(int id_tarefa) {
		this.id_tarefa = id_tarefa;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Date getDiacriacao() {
		return diacriacao;
	}

	public void setDiacriacao(Date diacriacao) {
		this.diacriacao = diacriacao;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public boolean isPentende() {
		return pentende;
	}

	public void setPentende(boolean pentende) {
		this.pentende = pentende;
	}


	public void setPrazo(String next) {
		
	}
}
