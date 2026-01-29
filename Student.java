import java.util.Scanner;

class Student {
    String id;
    String name;
    double score;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap diem: ");
        score = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Score: " + score);
    }

    boolean isPass() {
        return score >= 5;
    }
}
