import java.util.Scanner;
public class Timngay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        int day;
        // System.out.print("Nhập năm: ");
        // int year = scanner.nextInt();
        switch (month) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        day = 31;
        break;
        case 4: case 6: case 9: case 11:
        day = 30;
        break;
        case 2:
        day = 28;
       // Kiểm tra năm nhuận 
        // if ((month == 2)  && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
        //     day = 29;
        // }
        break;
        default:
        System.out.println("Tháng không h��p lệ.");
        return;
        }
        System.out.println("Tháng " + month + " có " + day + " ngày.");
    }
}
