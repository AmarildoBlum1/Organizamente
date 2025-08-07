package org;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	
	private static Scanner input = new Scanner(System.in);
	private static Scanner scanner = new Scanner(System.in);
	private static List<String> tarefas = new ArrayList<>();
	private static List<String> horario = new ArrayList<>();
	private static List<String> usuarios = new ArrayList<>();

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------");
	    System.out.println("-------------Bem-Vindo ao Organizamente----------------");
		menu();
    }

private static void menu() {

    System.out.println("-------------------------------------------------------");
    System.out.println("*****Selecione uma operação que deseja realizar********");
    System.out.println("-------------------------------------------------------");
    System.out.println("|    Opção 1 - Cadastrar usuário    |");
    System.out.println("|    Opção 2 - Criar tarefas        |");
    System.out.println("|    Opção 3 - Ver tarefas          |");
    System.out.println("|    Opção 4 - Realizar tarefas     |");
    System.out.println("|    Opção 5 - Ver usuários         |");
    System.out.println("|    Opção 6 - Sair                 |");
    
    int option = input.nextInt();

    switch (option) {
        case 1:
            cadastrarUsuarios();
            break;
        case 2:
            criarTarefas();
            break;
        case 3:
            verTarefas();
            break;
        case 4:
            realizarTarefas();
            break;
        case 5:
            verUsuarios();
            break;
        case 6:
        	Sair();
        	break;
        default:
            System.out.println("Opção Inválida!");
            menu();
            break;
        }

    }
    
    private static void verUsuarios() {
    	if (!usuarios.isEmpty()) {
    		System.out.println("Usuários:");
    		for (int i = 0; i < usuarios.size(); i++) {
    			System.out.println((i + 1) + " - " + usuarios.get(i));
    		}
    			menu();
    		
    	}
    		else if (usuarios.isEmpty()){
    			System.out.println("Nenhum usuário cadastrado");
    			menu();
    		}
    }

    public static void cadastrarUsuarios() {

        System.out.println("Digite o nome do usuário: ");
        String name = scanner.next();
        usuarios.add(name);
        System.out.println("Usuário " + name + " cadastrado com sucesso!");

        menu();
    }
    public static void criarTarefas() {

    	System.out.println("Digite a tarefa a ser realizada: ");
        String tarefa = scanner.nextLine();
        tarefas.add(tarefa);

        System.out.println("Digite o horário que deseja realizar a tarefa:");
        String hora = scanner.nextLine();
        horario.add(hora);

        System.out.println("Deseja adicionar outra tarefa? (1 para sim, 0 para voltar ao menu)");
        int option = input.nextInt();

        if (option == 1) {
            criarTarefas();
        } else {
            menu();
        }
    }
    private static void verTarefas() {

        System.out.println("---Tarefas à serem realizadas:---");
        if (!tarefas.isEmpty()) {
            System.out.println("Lista de Tarefas:\n");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i) + " (Horário: " + horario.get(i) + ")");
            }
        } else {
            System.out.println("---Nenhuma tarefa cadastrada.---");
        }
        menu();
    }

    private static void realizarTarefas() {

        System.out.println("---Realizar Tarefas---");
        if (!tarefas.isEmpty()) {
            System.out.println("Lista de Tarefas Pendentes:\n");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }

            System.out.println("Digite o número da tarefa que você realizou (ou 0 para voltar ao menu):");
            int escolha = input.nextInt();
            input.nextLine();

            if (escolha > 0 && escolha <= tarefas.size()) {
                String tarefaRealizada = tarefas.remove(escolha - 1);
                horario.remove(escolha - 1);
                System.out.println("Tarefa \"" + tarefaRealizada + "\" realizada com sucesso!");

            } else if (escolha != 0) {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Nenhuma tarefa pendente para realizar.");
        }
        menu();
    }

    private static void Sair() {

        System.exit(0);
    }
}

