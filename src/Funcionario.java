import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    /*
     * Utilizei este metodo para poder armazenar todos os funcionarios criados dentro de uma Array, quando for necessario fazer pesquisa de funcionario faça-a pelo 
     * atributo "Nome".
     */
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(String nome, String cargo, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0;
    }

    public void adicionarFuncionario(String nome, String cargo, float salario) {
        Funcionario f = new Funcionario(nome, cargo, salario);
        funcionarios.add(f);
        System.out.println("Funcionário " + nome + " adicionado.");
    }

    public void removerFuncionario(String nome) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).nome.equalsIgnoreCase(nome)) {
                funcionarios.remove(i);
                System.out.println("Funcionário " + nome + " foi removido.");
                return; 
            }
        }
        System.out.println("Funcionário " + nome + " não foi encontrado.");
    }

    public String getInfo() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: " + salario;
    }

    public String getInfoSemSalario() {
        return "Nome: " + nome + ", Cargo: " + cargo;
    }

    public void exibirInfo() {
        System.out.println(getInfo());
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            f.exibirInfo();
        }
    }
}
