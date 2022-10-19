package ad211.dovbyshev;

public class Circle {
    private double radius;
    private double centerCoordinates;

    public Circle(double radius, double centerCoordinates) {
        this.radius = radius;
        this.centerCoordinates = centerCoordinates;
    }

    public Circle(double centerCoordinates) {
        radius = 0;
        this.centerCoordinates = centerCoordinates;
    }

    public double getArea() {
        if(!isZeroRadius()){
            return(3.14 * radius * radius);
        }
        else{
            System.out.println("The circle is a dot");
            return 0;
        }
    }

    public double circumference() {
        if(!isZeroRadius()){
            return(2 * 3.14 * radius);
        }
        else{
            System.out.println("The circle is a dot");
            return 0;
        }
    }

    private boolean isZeroRadius(){
        boolean isZero = false;
        if(radius == 0){
            isZero = true;
        }
        return isZero;
    }
}
