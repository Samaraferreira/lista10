package prova.lista10.q4;

public class Circle implements Geometric {

    private Float area;
    private Float perimeter;

    @Override
    public Float calcArea(Float pi, Float r) {
        area = pi * (float) Math.pow(r, 2);
        return area;
    }

    @Override
    public Float calcPerimeter(Float pi, Float r) {
        perimeter = (2 * pi * r) * r;
        return perimeter;
    }

    @Override
    public Float getArea() {
        return area;
    }

    @Override
    public Float getPerimeter() {
        return perimeter;
    }
}
