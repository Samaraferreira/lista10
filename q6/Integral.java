package prova.lista10.q6;

public class Integral extends Trabalhador {

    public Integral(String nome, Double salario, String id, int idade) {
        super(nome, salario, id, idade);
    }

    @Override
    public Double getSalario() {
        float bonus;

        if (super.getIdade() > 30) {
            bonus = 0.25F;
        } else {
            bonus = 0.16F;
        }

        return super.getSalario() + (super.getSalario() * bonus);
    }
}
