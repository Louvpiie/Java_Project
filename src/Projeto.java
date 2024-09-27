import java.time.LocalDate;

public class Projeto {
    private String nome;
    private LocalDate prazo;
    private Funcionario responsavel;

    // Construtor com todos os atributos
    public Projeto(String nome, LocalDate prazo, Funcionario responsavel) {
        this.nome = nome;
        this.prazo = prazo;
        this.responsavel = responsavel;
    }

    // Construtor com parâmetros reduzidos
    public Projeto(String nome, LocalDate prazo) {
        this(nome, prazo, null);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    // Método para adicionar um funcionário ao projeto
    public void adicionarFuncionario(Funcionario funcionario) {
        this.responsavel = funcionario;
    }

    // Método para remover o funcionário do projeto
    public void removerFuncionario() {
        this.responsavel = null;
    }

    // Método para validar se o prazo é maior que a data atual
    public boolean validarPrazo() {
        return this.prazo.isAfter(LocalDate.now());
    }
}
