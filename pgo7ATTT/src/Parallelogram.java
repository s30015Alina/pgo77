public class Parallelogram implements Figure{
    @Override
    public double getPerimetr() {
        return 2 * (baseSide + side) ;
    }

    @Override
    public double getArea() {
        return baseSide * height;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }
    double baseSide;
    double side;
    double height;

    public Parallelogram(double baseSide, double side, double height){
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }
}
