
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar aluno");
            System.out.println("2 - Exibir aprovados");
            System.out.println("3 - Média da turma");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Prontuário: ");
                    String prontuario = sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();

                    alunos.add(new Aluno(prontuario, nome, nota));
                    System.out.println("Aluno cadastrado!");
                    break;

                case 2:
                    for (Aluno a : alunos) {
                        if (a.getNota() >= 6.0) {
                            System.out.println(a.getNome());
                        }
                    }
                    break;

                case 3:
                    double soma = 0;

                    for (Aluno a : alunos) {
                        soma += a.getNota();
                    }

                    if (alunos.size() > 0)
                        System.out.println("Média: " + soma / alunos.size());
                    else
                        System.out.println("Nenhum aluno cadastrado.");
                    break;

                case 4:
                    System.out.print("Prontuário: ");
                    String pront = sc.nextLine();

                    boolean encontrou = false;

                    for (Aluno a : alunos) {
                        if (a.getProntuario().equals(pront)) {
                            alunos.remove(a);
                            encontrou = true;
                            break;
                        }
                    }

                    if (encontrou)
                        System.out.println("Aluno removido!");
                    else
                        System.out.println("Aluno não encontrado.");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}