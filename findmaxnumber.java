import java.util.Scanner;

public class findmaxnumber {
    public static int main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhập số dòng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị cho phần tử tại vị trí [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;

    }
}
