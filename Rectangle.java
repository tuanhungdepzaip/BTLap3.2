import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        length = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        width = sc.nextDouble();
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Length: " + length + " - Width: " + width);
    }
}
