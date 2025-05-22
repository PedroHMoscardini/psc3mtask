import jakarta.persistence.EntityManager;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public Menu(EntityManager em) {
        while (true) {
            System.out.println("""
                    [1] Login
                    [2] Cadastrar Novo Usuário
                    [3] Acessar Projetos
                    [4] Criar Projeto
                    [5] Criar Tarefa
                    [6] Visualizar Tarefas por Projeto
                    [7] Atualizar Status de Tarefa
                    [8] Sair""");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Login");
                    break;
                case 2:
                    new Register(em);
                    break;
                case 3:
                    System.out.print("Acessar Projetos");
                    break;
                case 4:
                    System.out.print("Criar Projeto");
                    break;
                case 5:
                    System.out.print("Criar Tarefa");
                    break;
                    case 6:
                    System.out.print("Visualizar Tarefas por Projeto");
                    break;
                case 7:
                    System.out.print("Atualizar Status de Tarefa");
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }


}
