package prova.lista10.q5;

import java.math.BigDecimal;

public class Manager extends Employee {

    private String department;

    public Manager(String name, String cpf, String birthDate, BigDecimal salary, String department) {
        super(name, cpf, birthDate, salary);
        this.department = department;
    }

    @Override
    public BigDecimal calcSalary() {
        BigDecimal bonus = new BigDecimal(1500);
        return super.getSalary().add(bonus);
    }
}
