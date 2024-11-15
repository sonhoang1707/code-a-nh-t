 import java.util.Scanner;       //import  java.util.Scanner;
 public class kiemtranamnhuan {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập năm: ");
        year = scanner.nextInt();
    
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " là năm nhuận");
            } else {
                System.out.println(year + " không phải là năm nhuận");
            }
        }
 }
