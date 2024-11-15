import java.util.Scanner;
public class bodymass {
    public static void main(String[] args) {
        double bodyMass, weight, height;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập cân nặng (kg): ");
        weight = scanner.nextDouble();
        
        System.out.print("Nhập chiều cao (m): ");
        height = scanner.nextDouble();
        
        bodyMass = weight / (height * height);
        
        System.out.printf("Chỉ số BMI  của bạn là " + bodyMass);
    }
}
