import java.util.Scanner;

public class Program {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE CADASTRO =====");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Buscar pessoa");
            System.out.println("4 - Remover pessoa");
            System.out.println("5 - Editar pessoa");
            System.out.println("0 - Sair");


        do{
            System.out.print("\nOpção: ");

            while (!sc.hasNextInt()){
                System.out.println("\nDigite apenas numeros.\n");
                sc.next();//Descarta a entrada invalida
                System.out.print("Opção: ");
            }
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao < 0 || opcao > 5){
                System.out.println("Opção invalida! ");
            }
          } while(opcao < 0 || opcao > 5);

            switch (opcao){

                case 1:
                    System.out.print("\nNome: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();

                    Pessoa pessoa = new Pessoa(nome, idade);

                    cadastro.adicionarPessoa(pessoa);
                    break;

                case 2:
                    cadastro.listarpessoas();
                    break;

                case 3:
                    System.out.print("\nDigite o nome para buscar: ");
                    String nomeBusca = sc.nextLine();
                    
                    cadastro.buscarPessoa(nomeBusca);

                    break;

                case 4:
                    System.out.print("Digite o nome da pessoa que deseja remover: ");
                    String nomeRemover = sc.nextLine();

                    cadastro.removerPessoa(nomeRemover);

                    break;  

                case 5:
                    System.out.print("\nDigite o nome da pessoa que deseja editar: ");
                    String nomeEditar = sc.nextLine();
                    
                    System.out.print("\nNovo nome: ");
                    String novoNome = sc.nextLine();

                    System.out.print("Nova idade: ");
                    int novaIdade = sc.nextInt();
                    sc.nextLine();

                    cadastro.editarPessoa(nomeEditar, novoNome, novaIdade);
                    break;

                case 0:
                    System.out.println("\nPrograma encerrado.");
                    break;

                default:
                    System.out.println("\nOpção invalida.");    
            }
        }while (opcao!= 0);

        sc.close();
    }   
}
