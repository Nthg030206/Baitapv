/*
Đọc số nguyên bằng Scanner
Viết một chương trình yêu cầu người dùng nhập hai số nguyên và in ra tổng của chúng.
 */
package baitap;
import java.util.Scanner;
public class Bai3 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Nhap a: ");
         int a= input.nextInt();
         System.out.print("Nhap b: ");
         int b= input.nextInt();
         int s= a+b; 
         System.out.println("Tong la: "+s);
     }
}
