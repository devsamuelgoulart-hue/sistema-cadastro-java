import java.util.ArrayList;

public class Cadastro {

    private ArrayList<Pessoa>pessoas;

    public Cadastro(){
        pessoas = new java.util.ArrayList<>();
    }
    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
        System.out.println("\nPessoa cadastrada com sucesso!");
    }
    public void removerPessoa(String nome){
        for(int i = 0; i < pessoas.size();i++){
            if(pessoas.get(i).getNome().equalsIgnoreCase(nome)){
                pessoas.remove(i);
                System.out.println("\nPessoa removida com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");  
    }
    public void buscarPessoa(String nome){

        for(Pessoa pessoa : pessoas){
            if(pessoa.getNome().equalsIgnoreCase(nome)){
                System.out.println("\nPessoa encontrada: ");
                pessoa.apresentar();
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }
    public void editarPessoa(String nome, String novoNome, int novaIdade){

        for(Pessoa pessoa : pessoas){

            if(pessoa.getNome().equalsIgnoreCase(nome)){

                pessoa.setNome(novoNome);
                pessoa.setIdade(novaIdade);

                System.out.println("\nCadastro editado com sucesso! ");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");

    }
    public void listarpessoas(){
        if(pessoas.isEmpty()){
            System.out.println("\nNenhuma pessoa cadastrada.");
            return;
        }
        System.out.println("\n--- Pessoas cadastradas ---\n");

        for(Pessoa pessoa : pessoas){
            pessoa.apresentar();
            System.out.println("----------------");
        }
    }
}
