package ad211.dovbyshev;

public class RightAngledTriangle {
    private double base;
    private double height;

    public RightAngledTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea () {
        return ((base * height) / 2);
    }

    public double getHypotenuse() {
        return (Math.sqrt((base * base) + (height * height)));
    }

    public double getPerimeter() {
        return (base + height + getHypotenuse());
    }
}
