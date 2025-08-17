/*
 Viết một chương trình minh họa vấn đề khi sử dụng nextInt() theo sau là nextLine(), 
và sửa lỗi bằng cách thêm một dòng nextLine() bổ sung để xử lý ký tự xuống dòng.
 */
package baitap;
import java.util.Scanner;
public class bai9 {public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ten: ");
            String ten = scanner.nextLine();
            System.out.print("Nhap tuoi: ");
            int tuoi = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Que quan: ");
            String que = scanner.nextLine();
            System.out.println(ten);
            System.out.println(tuoi);
            System.out.println(que);
}
    
}
