import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập tên
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        // In ra lời chào
        System.out.println("Xin chào, " + name + "! Chúc bạn một ngày tốt lành.");

        // Đóng Scanner
        scanner.close();
    }
}
