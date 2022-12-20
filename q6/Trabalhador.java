package prova.lista10.q6;

public class Trabalhador {

    private String nome;
    private Double salario;

    private String id;

    private int idade;

    public Trabalhador(String nome, Double salario, String id, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


    public Double getSalario() {
        return salario;
    }

    public String getId() {
        return id;
    }

    public boolean hasId(String id) {
        return this.id.equals(id);
    }

    public String getInfo() {
        return "Trabalhador{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", salario='" + getSalario() + '\'' +
                ", idade=" + idade +
                '}';
    }
}
