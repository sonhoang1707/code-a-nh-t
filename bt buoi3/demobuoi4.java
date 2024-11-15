// import java.util.Scanner;
// public class demobuoi4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Nhập số: ");
//         int n = scanner.nextInt();

//         System.out.print("Nhập số 2: ");
//         int m = scanner.nextInt();

//         System.out.print("Nhập số 3: ");    
//         int p = scanner.nextInt();

//         if (n >= m && n >= p) {
//             System.out.println(  n +"lớn nhất ");
            
//         } if (m >= n && m >= p) {
//             System.out.println(m+ " lớn nhất");
            
//         } else {
//             System.out.println(p+ " lớn nhất");
//         }
//     }
// }




// cách 2
import java.util.Scanner;
public class demobuoi4 {
public static void main(String[] args) {
      int a, b,c;
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Nhập cạnh a: ");   
      a = scanner.nextInt();
      
      System.out.print("Nhập cạnh b: ");
      b = scanner.nextInt();
      
      System.out.print("Nhập cạnh c: ");
      c = scanner.nextInt();
      int max = a;
      if (c > max) {
        max = c;
      }
      if (b > max) {
        max = b;
      }
      
      System.out.println("Cạnh l��n nhất là: " + max);
  } 
}