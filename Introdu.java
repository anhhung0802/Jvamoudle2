import java.util.Scanner;

public class NumberToWordConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số nguyên không âm: ");
        int number = input.nextInt();

        if (number <0 || number > 999) {
            System.out.println("Vui lòng nhập số nguyên không âm từ 0 đến 999.");
            return;
        }

        String result = "";

        // Chuyển đổi hàng trăm
        switch (number / 100) {
            case 1:
                result = "Một trăm";
                break;
            case 2:
                result = "Hai trăm";
                break;
            case 3:
                result = "Ba trăm";
                break;
            case 4:
                result = "Bốn trăm";
                break;
            case 5:
                result = "Năm trăm";
                break;
            case 6:
                result = "Sáu trăm";
                break;
            case 7:
                result = "Bảy trăm";
                break;
            case 8:
                result = "Tám trăm";
                break;
            case 9:
                result = "Chín trăm";
                break;
        }

        // Chuyển đổi hàng chục và đơn vị
        int remainder = number % 100;
        switch (remainder / 10) {
            case 1:
                switch (remainder % 10) {
                    case 0:
                        result += " mười";
                        break;
                    case 1:
                        result += " mười một";
                        break;
                    case 2:
                        result += " mười hai";
                        break;
                    case 3:
                        result += " mười ba";
                        break;
                    case 4:
                        result += " mười bốn";
                        break;
                    case 5:
                        result += " mười năm";
                        break;
                    case 6:
                        result += " mười sáu";
                        break;
                    case 7:
                        result += " mười bảy";
                        break;
                    case 8:
                        result += " mười tám";
                        break;
                    case 9:
                        result += " mười chín";
                        break;
                }
                break;
            2:
                result += " hai mươi";
                break;
            case 3:
                result += " ba mươi";
                break;
            case 4:
                result += " bốn mươi";
                break;
            case 5:
                result += " năm mươi";
                break;
            case 6:
                result += " sáu mươi";
                break;
            case 7:
                result += " bảy mươi";
                break;
            case 8:
                result += " tám mươi";
                break;
            case 9:
                result += " chín mươi";
                break;
        }

        if (remainder > 10 && remainder % 10 != 0) {
            result += " ";
        }

        switch (remainder % 10) {
            case 1:
                result += "một";
                break;
            case 2:
                result += "hai";
                break;
            case 3:
                result += "ba";
                break;
            case 4:
                result += "bốn";
                break;
            case 5:
                result += "năm";
                break;
            case 6:
                result += "sáu";
                break;
            case 7:
                result += "bảy";
                break;
            case 8:
                result += "tám";
                break;
            case 9:
                result += "chín";
                break;
        }

        if (number == 0) {
            result = "Không";
        }

       System.out.println("Số " + number + " được viết thành chữ là: " + result);
    }
}
