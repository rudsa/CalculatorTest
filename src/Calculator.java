import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        CalculatorDisplay calDisplay = new CalculatorDisplay();
        calDisplay.turnOn();
        CalculatorButtons calButtons = new CalculatorButtons();
        calButtons.enterNum1();
        calButtons.enterArithmeticOperation();
        calButtons.enterNum2();
        calDisplay.displayArithmeticOperation(calButtons);
        Calculation cal = new Calculation();

    }
}
