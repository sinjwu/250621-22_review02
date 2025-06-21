import java.util.Scanner;

public class ReScanSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int square = number * number;
        System.out.println("Result: " + square);
        sc.close();
    }
}
