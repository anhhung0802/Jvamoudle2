package songuyento;

import java.util.Scanner;

public class Hienthicacloaihinh {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Nhập lựa chọn của bạn :");
        int n = Integer.parseInt(scanner.nextLine());
        Ham1(n);
    }

    public static void Ham1(int n) {
        switch (n) {
            case 1:

                System.out.println("Nhập cạnh a :");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh b :");
                int b = Integer.parseInt(scanner.nextLine());
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= b; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Nhập chiều cao : ");
                int a1 = Integer.parseInt(scanner.nextLine());
                ;
                for (int i = 0; i < a1; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Nhập chiều cao : ");
                int a2 = Integer.parseInt(scanner.nextLine());
                for (int i =a2; i>=0; i--) {
                    for (int j = 0; j<=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Bái Bai");
        }

    }


}
