public class Circle implements Figure {
    @Override
    public double getPerimetr() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
}
