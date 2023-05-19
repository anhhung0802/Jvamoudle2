package songuyento;

import java.util.Scanner;

public class Hienthisonguyento {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bạn muốn kiểm tra bao nhiêu số nguyên tố : ");
        int n = Integer.parseInt(scanner.nextLine());
        Check(n);
        Run(n);
    }

    public static void Check(int n) {
        while (n < 1) {
            System.out.println("Vui lòng nhập lại vì số nguyên tố muốn kiểm tra phải lớn hơn 1 : ");
            n = Integer.parseInt(scanner.nextLine());
             Run(n);
        }
    }

    public static void Run(int n) {

        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
