package prova.lista10.q4;

public class Rectangle implements Geometric {

    private Float area;
    private Float perimeter;

    @Override
    public Float calcArea(Float b, Float h) {
        area = b * h;
        return area;
    }

    @Override
    public Float calcPerimeter(Float b, Float h) {
        perimeter = ((2*b) + (2*h)) * b;
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
