import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Test BankAccount ===");
        BankAccount bAcc = new BankAccount("001", "User A", 1000);
        bAcc.deposit(500);
        bAcc.withdraw(200);
        System.out.println("Balance: " + bAcc.checkBalance());
        bAcc.display();

        System.out.println("\n=== Test Book ===");
        Book book = new Book();
        System.out.print("Nhap thong tin sach:\n");
        book.input(sc);
        book.display();
        System.out.println(book.isExpensive() ? "Sach dat" : "Sach khong dat");
        System.out.println(book.isOldBook() ? "Sach cu" : "Sach moi");

        System.out.println("\n=== Test Car ===");
        Car car = new Car();
        System.out.print("Nhap thong tin xe:\n");
        car.input(sc);
        car.display();

        System.out.println("\n=== Test Circle ===");
        Circle circle = new Circle();
        System.out.print("Nhap thong tin hinh tron:\n");
        circle.input(sc);
        circle.display();

        System.out.println("\n=== Test Student ===");
        Student stud = new Student();
        System.out.print("Nhap thong tin sinh vien:\n");
        stud.input(sc);
        stud.display();

        System.out.println("\n=== Test Rectangle ===");
        Rectangle rect = new Rectangle();
        System.out.print("Nhap thong tin hinh chu nhat:\n");
        rect.input(sc);
        rect.display();

        System.out.println("\n=== Test Product ===");
        Product prod = new Product();
        System.out.print("Nhap thong tin san pham:\n");
        prod.input(sc);
        prod.display();

        System.out.println("\n=== Test Employee ===");
        Employee emp = new Employee();
        System.out.print("Nhap thong tin nhan vien:\n");
        emp.input(sc);
        emp.display();

        sc.close();
    }
}
