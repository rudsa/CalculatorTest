import java.util.Scanner;

public class CalculatorButtons {
    private double num1;
    private double num2;
    private String arithmeticOperation;

    Scanner scan = new Scanner(System.in);

    public void enterNum1(){
        this.num1 = scan.nextDouble();
    }

    public void enterNum2(){
        this.num2 = scan.nextDouble();
    }

    public void enterArithmeticOperation(){
        this.arithmeticOperation = scan.next();
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getArithmeticOperation() {
        return arithmeticOperation;
    }

    @Override
    public String toString() {
        return "CalculatorButtons{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", arithmeticOperation='" + arithmeticOperation + '\'' +
                '}';
    }
}
