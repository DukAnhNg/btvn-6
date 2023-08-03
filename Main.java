import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập quãng đường di chuyển(km):");
        double length = Double.parseDouble(scanner.nextLine());
        Bus bus = new Bus(length);
        bus.caculate();
        Train train = new Train(length);
        train.caculate();
        Plane plane = new Plane(length);
        plane.caculate();
    }
}
