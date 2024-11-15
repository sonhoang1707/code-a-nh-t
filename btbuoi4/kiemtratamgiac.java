import java.util.Scanner;

public class kiemtratamgiac {
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập cạnh a: ");
        a = scanner.nextInt();
        
        System.out.print("Nhập cạnh b: ");
        b = scanner.nextInt();
        
        System.out.print("Nhập cạnh c: ");
        c = scanner.nextInt();
        
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("Ba cạnh vừa nhập tạo thành một tam giác.");
            
        } else {    
            System.out.println("Ba cạnh vừa nhập không tạo thành một tam giác.");
    
    }
  }
}