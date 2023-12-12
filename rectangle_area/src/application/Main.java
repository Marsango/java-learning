package application;
import entities.Rectangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height");
        Rectangle rec = new Rectangle();
        rec.width = sc.nextInt();
        rec.height = sc.nextInt();
        System.out.println("AREA = "+ rec.area());
        System.out.println("AREA = "+ rec.perimeter());
        System.out.println("AREA = "+ rec.diagonal());
    }
}