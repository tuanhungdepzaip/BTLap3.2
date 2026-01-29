import java.util.Scanner;

class Employee {
    String id;
    String name;
    double salary;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap luong: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Salary: " + salary);
    }

    double calculateTax() {
        if (salary > 10000000)
            return salary * 0.1;
        return 0;
    }
}
