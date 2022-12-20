package prova.lista10.q5;

public abstract class Person {
    private String name;
    private String cpf;
    private String birthDate;

    public Person(String name, String cpf, String birthDate) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
