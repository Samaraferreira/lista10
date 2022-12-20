package prova.lista10.q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Geometric> geometrics = new ArrayList<>();

        while (true) {
            System.out.println("1. Adicionar um Círculo;\n" +
                    "2. Adicionar um Retângulo;\n" +
                    "3. Calcular média das áreas;\n" +
                    "4. Calcular média dos perímetros;\n" +
                    "0. Sair");
            System.out.println("Digite uma opção: ");
            int op = scan.nextInt();

            if (op == 0) break;

            switch (op) {
                case 1 -> addNewCircle(scan, geometrics);
                case 2 -> addNewRectangle(scan, geometrics);
                case 3 -> {
                    try {
                        getAreaAverage(geometrics);
                    } catch (IllegalArgumentException | ArithmeticException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                case 4 -> {
                    try {
                        getPerimeterAverage(geometrics);
                    } catch (IllegalArgumentException | ArithmeticException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
            }
        }
    }

    public static void addNewCircle(Scanner scan, List<Geometric> geometrics) {
        System.out.println("Digite o valor do raio: ");
        float radius = scan.nextFloat();

        Circle circle = new Circle();
        circle.calcArea((float) Math.PI, radius);
        circle.calcPerimeter((float) Math.PI, radius);

        geometrics.add(circle);
    }

    public static void addNewRectangle(Scanner scan, List<Geometric> geometrics) {

        System.out.println("Digite o valor da base: ");
        float base = scan.nextFloat();

        System.out.println("Digite o valor da altura: ");
        float height = scan.nextFloat();

        Rectangle rectangle = new Rectangle();
        rectangle.calcArea(base, height);
        rectangle.calcPerimeter(base, height);

        geometrics.add(rectangle);
    }

    public static void getAreaAverage(List<Geometric> geometrics) {
        float sum = 0;

        if (geometrics.size() == 0)
            throw new IllegalArgumentException("Não há nenhum registro");

        for (Geometric geometric : geometrics) {
            if (geometric.getArea() == null) {
                throw new ArithmeticException("Area não foi calculada");
            }
            sum += geometric.getArea();
        }

        System.out.println("Media das areas: " + sum / geometrics.size());
    }

    public static void getPerimeterAverage(List<Geometric> geometrics) {
        float sum = 0;

        if (geometrics.size() == 0)
            throw new IllegalArgumentException("Não há nenhum registro");

        for (Geometric geometric : geometrics) {
            if (geometric.getPerimeter() == null) {
                throw new ArithmeticException("Area não foi calculada");
            }
            sum += geometric.getPerimeter();
        }

        System.out.println("Media dos perimetros: " + sum / geometrics.size());
    }
}
