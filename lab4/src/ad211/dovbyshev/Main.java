package ad211.dovbyshev;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        RightAngledTriangle parameters = new RightAngledTriangle(3, 4);
        System.out.println("Hypotenuse: " + parameters.getHypotenuse());
        System.out.println("Perimeter: " + parameters.getPerimeter());
        System.out.println("Area: " + parameters.getArea());

        Circle circle = new Circle(6, 1);
        Circle zeroCircle = new Circle(1);
        String formattedDouble = new DecimalFormat("#0.00").format(circle.getArea());
        System.out.println("\nArea: " + formattedDouble);
        System.out.println("Circle Length: " + circle.circumference());

        Student student = new Student("Dovbyshev", "Valentin", 2, "AD-211", 90);
        System.out.println("\nChanged to the next degree:  " + student.nextDegree());
        System.out.println("Studentship is: " + student.studentship(student.newAverageGrade(690, 7)));

        Book book = new Book("War and Peace", "Leo Tolstoy", 1865, 34.5, 5);
        System.out.println("\nAmount changed to" + book.newAmountValue(3));
        System.out.println("New price is: " + book.newPrice(3));
        System.out.println("Price of all books: " + book.getPriceOffAll());
    }
}
