/*
 Tạo một chương trình yêu cầu người dùng nhập hai số thực và in ra giá trị trung bình của chúng.
 */
package baitap;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Nhap a: ");
         double sothunhat = scanner.nextDouble();
         System.out.println("Nhap b: ");
         double sothuhai = scanner.nextDouble();
         double tb= (sothunhat+sothuhai)/2;
         System.out.println("Gia tri trung binh la: "+ tb);
        
    }
}
