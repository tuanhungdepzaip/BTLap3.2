import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;
    int year;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tieu de: ");
        title = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        author = sc.nextLine();
        System.out.print("Nhap gia: ");
        price = sc.nextDouble();
        System.out.print("Nhap nam XB: ");
        year = sc.nextInt();
    }

    void display() {
        System.out.println("Title: " + title + " - Author: " + author + " - Price: " + price + " - Year: " + year);
    }

    boolean isExpensive() {
        return price > 200000;
    }

    boolean isOldBook() {
        return year < 2015;
    }
}
