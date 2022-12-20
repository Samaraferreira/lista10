package prova.lista10.q5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        List<Employee> managers = new ArrayList<>();

        while (true) {
            System.out.println("1. Adicionar Funcionário\n" +
                    "2. Adicionar Gerente\n" +
                    "3. Obter salário de Funcionário\n" +
                    "4. Obter salário Gerente\n" +
                    "0. Sair");
            System.out.println("Digite uma opção: ");
            int op = scan.nextInt();

            if (op == 0) break;

            switch (op) {
                case 1 -> employees.add(new Employee("Integral 1", "123", "12-04-1999", BigDecimal.valueOf(1000)));
                case 2 -> managers.add(new Manager("Integral 1", "123", "12-04-1999", BigDecimal.valueOf(1000), ""));
                case 3 -> getEmployeeSalary(employees);
                case 4 -> getEmployeeSalary(managers);
            }
        }
    }

    public static void getEmployeeSalary(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.calcSalary());
        }
    }
}
