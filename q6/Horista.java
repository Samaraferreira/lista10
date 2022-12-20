package prova.lista10.q6;

public class Horista extends Trabalhador {

    private Float horas;

    public Float getHoras() {
        return horas;
    }

    public Horista(String nome, Double salario, String id, int idade, Float horas) {
        super(nome, salario, id, idade);
        this.horas = horas;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() * horas;
    }
}
