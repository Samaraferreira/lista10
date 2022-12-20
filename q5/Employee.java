package prova.lista10.q5;

import java.math.BigDecimal;

public class Employee extends Person {

    private BigDecimal salary;

    public Employee(String name, String cpf, String birthDate, BigDecimal salary) {
        super(name, cpf, birthDate);
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public BigDecimal calcSalary() {
        return salary;
    }
}
