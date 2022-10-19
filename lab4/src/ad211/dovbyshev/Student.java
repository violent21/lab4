package ad211.dovbyshev;

public class Student {

    private String surname;
    private String name;
    private int degree;
    private String group;
    private double averageGrade;

    public Student(String surname, String name, int degree, String group, double averageGrade) {
        this.surname = surname;
        this.name = name;
        this.degree = degree;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    public int nextDegree() {
        return degree + 1;
    }

    public double newAverageGrade(double sum, int count) {
        double grade;

        grade = sum / count;
        return grade;
    }

    public double studentship(double grade) {
        double value;

        if(grade > 85 && grade < 95){
            value = 1980;
        }
        else if(grade > 95){
            value = 2880;
        }
        else{
            value = 0;
        }
        return value;
    }
}
