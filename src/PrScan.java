import java.util.Scanner;

public class PrScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("안녕 " + name);
    }
}