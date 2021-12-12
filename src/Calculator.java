import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculation cal = new Calculation();
        double num1 = scan.nextDouble();
        cal.setNum1(num1);
        String arithmeticOperation = scan.next();
        cal.setArithmeticOperation(arithmeticOperation);
        double num2 = scan.nextDouble();
        cal.setNum2(num2);
        cal.calculationStart();
    }
}
