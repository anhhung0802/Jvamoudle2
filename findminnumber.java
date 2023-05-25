import java.util.Scanner;

public class findminnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[]arr = new int[size];
        System.out.println("Nhập giá trị cho các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int min=arr[0];
        for (int i = 0; i <size ; i++) {

        }
    }
}
