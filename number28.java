import java.util.Scanner;
public class number28 {
    public static final double PI = 3.14159;
    private double radius;
    number28(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double calculateLength() {
        return 2 * PI * radius;
    }
    public double calculateSquare() {
        return PI * Math.pow(radius, 2);
    }
    public double calculateDiameter() {
        return 2 * radius;
    }

    public static void main(String args[]) {
        System.out.print("Input a radius: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double testRadius = sc.nextDouble();
            number28 testnumber28 = new number28(testRadius);
            System.out.println("Radius = " + testnumber28.getRadius());
            System.out.println("Length = " + testnumber28.calculateLength());
            System.out.println("Square = " + testnumber28.calculateSquare());
            System.out.println("Diameter = " + testnumber28.calculateDiameter());
        }
        else {
            System.out.println("It's not a number.");
        }
    }
}
