
// Giải phương trình bậc hai

import java.util.Scanner;
public class GiaiPhuongTrinhBacHai{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

       
       
        double delta = b * b - 4 * a * c;
        
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println( "x1: " + x1 + " x2: " +x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
           System.out.println( "x: " + x);
        } else {
          System.out.println( "Phương trình vô nghiệm");
        }
    }
}













// import java.util.Scanner;

// public class GiaiPhuongTrinhBacHai {

//     public static void main(String[] args) {
//         // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
//         Scanner scanner = new Scanner(System.in);

//         // Nhập các hệ số a, b, c
//         System.out.print("Nhập hệ số a: ");
//         double a = scanner.nextDouble();

//         System.out.print("Nhập hệ số b: ");
//         double b = scanner.nextDouble();

//         System.out.print("Nhập hệ số c: ");
//         double c = scanner.nextDouble();

//         // Giải phương trình bậc hai
//         giaiPhuongTrinhBacHai(a, b, c);

//         // Đóng đối tượng Scanner sau khi sử dụng
//         scanner.close();
//     }

//     public static void giaiPhuongTrinhBacHai(double a, double b, double c) {
//         // Tính delta (b^2 - 4ac)
//         double delta = b * b - 4 * a * c;

//         if (delta > 0) {
//             // Hai nghiệm phân biệt
//             double x1 = (-b + Math.sqrt(delta)) / (2 * a);
//             double x2 = (-b - Math.sqrt(delta)) / (2 * a);
//             System.out.println("Phương trình có hai nghiệm phân biệt:");
//             System.out.println("x1 = " + x1);
//             System.out.println("x2 = " + x2);
//         } else if (delta == 0) {
//             // Một nghiệm kép
//             double x = -b / (2 * a);
//             System.out.println("Phương trình có một nghiệm kép:");
//             System.out.println("x = " + x);
//         } else {
//             // Vô nghiệm
//             System.out.println("Phương trình vô nghiệm.");
//         }
//     }
// }
