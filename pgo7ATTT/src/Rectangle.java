public class Rectangle implements Figure{
    @Override
    public double getPerimetr() {
        return 2 * (sideB + sideA) ;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
