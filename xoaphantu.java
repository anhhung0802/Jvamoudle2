import java.util.Scanner;

public class xoaphantu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập giá trị cho các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập giá trị cần xóa: ");
        int value = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == value){
                index = i;
                break;
            }
        }
        if (index!=-1){
            for (int i = index; i <n-1 ; i++) {
                arr[i]=arr[i+1];
            }
            n--;
            System.out.println("Phần tửu đã được xóa");
        }else {
            System.out.println("không tìm thấy phần tử");
        }
        System.out.println("Mảng sau khi xóa: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
