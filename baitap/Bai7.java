/*
 Viết một chương trình sử dụng nextLine() để đọc một câu đầy đủ từ người dùng và in ra.
 */
package baitap;
import java.util.Scanner;
public class Bai7 { public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
            System.out.print("Nhap: ");
            String name = scanner.nextLine();
            System.out.println("Name : "+name);
            
}
    
}
