import java.util.Scanner;

public class PrScanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        System.out.println("숫자1: " + num1);
        char operator = sc.next().charAt(0);
        System.out.println("연산자: " + operator);
        double num2 = sc.nextDouble();
        System.out.println("숫자2: " + num2);
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                if (num2 == 0) {
                    System.out.println("나눌 수 없음");
                    return;
                }
                break;
            default:
                System.out.println("잘못된 입력");
                return;
        }
        System.out.println("결과: " + result);
    }
}
