import java.util.Scanner;

class Product {
    String id;
    String name;
    double price;
    int quantity;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ten SP: ");
        name = sc.nextLine();
        System.out.print("Nhap gia: ");
        price = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        quantity = sc.nextInt();
    }

    double getTotalPrice() {
        return price * quantity;
    }

    void discount(double percent) {
        price = price * (1 - percent / 100);
    }

    void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Price: " + price + " - Quantity: " + quantity);
    }
}
