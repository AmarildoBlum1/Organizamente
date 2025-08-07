package Classes;
import java.util.Scanner;

public class main {
	
		private static Scanner input = new Scanner(System.in);
		
		public static void adicionarUsuario() {
			
			Scanner scanner = new Scanner(System.in);
			
			Usuario user1 = new Usuario(null, null, null, null);
			
			System.out.println("Digite o seu CPF: ");
			user1.setCpfUsuario(scanner.nextLine());
			
			System.out.println("Digite seu nome:");
			user1.setNomeUsuario(scanner.nextLine());
			
			System.out.println("Digite seu e-mail");
			user1.setEmail(scanner.nextLine());
			
			System.out.println("Cadastre sua senha");
			user1.setSenha(scanner.next());
				
	}
		
		public static void obterInfoUsuarios() {
			
			//Usuario user1.getCpfUsuario();
			
			}
			
//			Usuario.getCpfUsuario();
//			Usuario.getNomeUsuario();
//			Usuario.getEmail();
		
		public static void adicionarTarefa() {
			
			Scanner scan = new Scanner(System.in);
			Scanner scanint = new Scanner(System.in);
			
			Tarefas tarefa1 = new Tarefas(null, 0, null, null, null, null, null, false);
			
			System.out.println("Digite o id da tarefa");
			tarefa1.setId_tarefa(scanint.nextInt());
			
			
			System.out.println("Digite a categoria da tarefa");
			tarefa1.setCategoria(scan.nextLine());
			
			System.out.println("Digite o Titulo da tarefa");
			tarefa1.setTitulo(scan.nextLine());
			
			System.out.println("Digite a descrição");
			tarefa1.setDescricao(scan.nextLine());
			
			System.out.println("Digite o prazo");
			tarefa1.setPrazo(scan.next());
		}
		
		public static void menu() {
			
			System.out.println("-------------------------------");
			System.out.println("Seja Bem-Vindo ao Organizamente");
			System.out.println("-------------------------------");
			System.out.println("------Digite a opção desejada--");
			System.out.println("-------------------------------");
			System.out.println("1 - Cadastrar Usuario----------");
			System.out.println("2 - Adicionar Tarefa-----------");
			System.out.println("3 - Sair-----------------------");
			
			int option = input.nextInt();
			
			switch (option) {
			
			case '1':
				adicionarUsuario();
				break;
			
			case '2': 
				adicionarTarefa();		
				break;
				
			case '3':
				System.exit(0);
				
			}
			
		}
		
	public static void main(String[] args) {
		
		menu();
		
		
	}
}
