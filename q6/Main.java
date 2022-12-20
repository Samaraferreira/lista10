package prova.lista10.q6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Trabalhador> horistas = new ArrayList<>();
        List<Trabalhador> integrais = new ArrayList<>();

        while (true) {
            System.out.println("1 – Cadastrar trabalhador Integral\n" +
                    "2 – Cadastrar trabalhador Horista\n" +
                    "3 – Obter salário trabalhador integral (pelo numero de cadastro)\n" +
                    "4 – Obter salário trabalhador horista\n" +
                    "5 – Obter ficha do trabalhador integral\n" +
                    "6 – Obter ficha do trabalhador horista\n" +
                    "7 – Obter maior salário entre os trabalhadores integrais\n" +
                    "8 – Obter maior idade entre os trabalhadores horistas" +
                    "0 – Sair");
            System.out.println("Digite uma opção: ");
            int op = scan.nextInt();

            if (op == 0) break;

            switch (op) {
                case 1 -> integrais.add(new Integral("Integral 1", 1000D, "123", 34));
                case 2 -> horistas.add(new Horista("Horista 1", 500D, "234", 23,4F));
                case 3 -> {
                    try {
                        getSalarioPorID(scan, integrais);
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                case 4 -> {
                    try {
                        getSalarioPorID(scan, horistas);
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                case 5 -> getInfo(scan, integrais);
                case 6 -> getInfo(scan, horistas);
                case 7 -> getMaiorSalario(integrais);
                case 8 -> getMaiorIdade(horistas);
            }
        }
    }

    private static void getMaiorIdade(List<Trabalhador> trabalhadores) {
        int maiorIdade = 0;
        for (int i = 0; i < trabalhadores.size(); i++) {
            Trabalhador trabalhador = trabalhadores.get(i);
            if (i == 0) maiorIdade = trabalhador.getIdade();
            if (trabalhador.getIdade() > maiorIdade) maiorIdade = trabalhador.getIdade();
        }
        System.out.println(maiorIdade);
    }

    private static void getMaiorSalario(List<Trabalhador> trabalhadores) {
        Double maior = 0D;
        for (int i = 0; i < trabalhadores.size(); i++) {
            Trabalhador trabalhador = trabalhadores.get(i);
            if (i == 0) maior = trabalhador.getSalario();
            if (trabalhador.getSalario() > maior) maior = trabalhador.getSalario();
        }
        System.out.println(maior);
    }

    private static void getInfo(Scanner scan, List<Trabalhador> trabalhadores) {
        System.out.println("Digite o ID: ");
        String id = scan.next();
        for (Trabalhador trabalhador : trabalhadores) {
            if (trabalhador.hasId(id)) System.out.println(trabalhador.getInfo());
        }
    }

    private static void getSalarioPorID(Scanner scan, List<Trabalhador> trabalhadores) {
        System.out.println("Digite o ID: ");
        String id = scan.next();
        boolean foiEncontrado = false;

        for (Trabalhador trabalhador : trabalhadores) {
            if (trabalhador.hasId(id)) {
                foiEncontrado = true;
                System.out.println(trabalhador.getSalario());
            }
        }

        if (!foiEncontrado) {
            throw new IllegalArgumentException("ID inválido");
        }
    }
}
