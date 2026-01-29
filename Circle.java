import java.util.Scanner;

class Circle {
    double radius;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        radius = sc.nextDouble();
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    boolean isBigCircle() {
        return getArea() > 100;
    }
}
