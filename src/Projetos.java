import java.text.SimpleDateFormat;
import java.util.Date;

public class Projetos {
    // A classe Projeto deve ter nome, prazo e um objeto Funcionario responsável. .
    // Implemente dois construtores para cada classe, um com todos os atributos e outro com um número reduzido de parâmetros.

    //atributos da classe
    private String nome;
    private SimpleDateFormat  prazo = new SimpleDateFormat("dd/MM/yy"); // como armazenar uma data do jeito certo
    private Funcionarios responsavel = new Funcionarios();


    //construtor que inicializa todos os parâmetros
    public Projeto (String nome, SimpleDateFormat Prazo, Funcionarios responsavel)
    {
        this.nome = nome;
        this.prazo = Prazo;
        this.responsavel = responsavel;
    }

    //construtor com número reduzido de parâmetros
    public Projeto(String nome, SimpleDateFormat Prazo)
    {
        this.nome = nome;
        this.prazo = Prazo;
        this.responsavel = "responsavel não informado";
    }


    //getters e setters
    public String getNomeResponsavel(Funcionario.Nome Responsavel){
         responsavel = Responsavel;
    }



}
