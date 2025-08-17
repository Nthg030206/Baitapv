/*
 Đọc giá trị Boolean
Viết một chương trình yêu cầu người dùng nhập một giá trị boolean (true hoặc false) và in ra xem người dùng đã nhập true hay false.
 */
package baitap;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap true/false: ");
        boolean d = scanner.nextBoolean();
        System.out.println("In ra: "+d);
    }
}
