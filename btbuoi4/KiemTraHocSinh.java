import  java.util.Scanner;
public class KiemTraHocSinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập điểm học sinh: ");
        double diem = scanner.nextDouble();
        String xepLoai;
        if (diem <4.0) {
        xepLoai = "học sinh yếu ";
    } else if (diem >=4.0 && diem <7.0) {
        xepLoai = "học sinh trung bình ";
    } else  if (diem >=7.0 && diem <8.0){
        xepLoai = "học sinh khá ";
    } else  if (diem >=8.0 && diem <=10.0){
        xepLoai = "học sinh giỏi ";
    }else {
        xepLoai = " điểm ko hợp lệ";
    }
       System.out.println("Xếp loại học sinh: " + xepLoai);
   
 }
} 












// dùng switch case
// import java.util.Scanner;

// public class KiemTraHocSinh {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Nhập điểm của học sinh: ");
//         double diem = scanner.nextDouble();
        
//        
//         int loaiDiem = -1; // Biến này lưu giá trị kiểu nguyên để dùng trong switch-case

//         if (diem < 0 || diem > 10) {
//             loaiDiem = -1; // Điểm không hợp lệ
//         } else if (diem < 4.0) {
//             loaiDiem = 0; // Học sinh xấu
//         } else if (diem < 7.0) {
//             loaiDiem = 1; // Học sinh trung bình
//         } else if (diem < 8.0) {
//             loaiDiem = 2; // Học sinh bình thường
//         } else {
//             loaiDiem = 3; // Học sinh giỏi
//         }

//         // Sử dụng switch-case để phân loại học sinh
//         String ketQua;

//         switch (loaiDiem) {
//             case 0:
//                 ketQua = "Học sinh xấu";
//                 break;
//             case 1:
//                 ketQua = "Học sinh trung bình";
//                 break;
//             case 2:
//                 ketQua = "Học sinh bình thường";
//                 break;
//             case 3:
//                 ketQua = "Học sinh giỏi";
//                 break;
//             default:
//                 ketQua = "Điểm không hợp lệ";
//                 break;
//         }

//         System.out.println("Kết quả: " + ketQua);
//     }
// }
