//Tạo một chương trình yêu cầu người dùng nhập tên và tuổi, sau đó in ra một câu như:
//"Xin chào [tên], bạn [tuổi] tuổi."
package baitap;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ten: ");
        String name = input.nextLine();
        System.out.println("Tuoi: ");
        int age = input.nextInt();
        System.out.println("Xin chao "+ name +" ban "+ age +" tuoi.");
    }
}
