public class Calculation {
    private double num1;
    private String arithmeticOperation;
    private double num2;
    private double result;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    private double plus(){
        result = num1 + num2;
        return result;
    }

    private double minus(){
        result = num1 - num2;
        return result;
    }

    private double division(){
        result = num1 / num2;
        return result;
    }

    private double multifly(){
        result = num1 * num2;
        return result;
    }

    private String getArithmeticOperation() {
        return arithmeticOperation;
    }

    private void setArithmeticOperation(String arithmeticOperation) {
        this.arithmeticOperation = arithmeticOperation;
    }

    private double getNum1() {
        return num1;
    }

    private void setNum1(double num1) {
        this.num1 = num1;
    }

    private double getNum2() {
        return num2;
    }

    private void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setCalculation(CalculatorButtons calButtons){
        setNum1(calButtons.getNum1());
        setNum2(calButtons.getNum2());
        setArithmeticOperation(calButtons.getArithmeticOperation());
    }

    public void checkArithmeticOperation(){
        switch (getArithmeticOperation()){
            case "+":{
                plus();
                break;
            }
            case "-":{
                minus();
                break;
            }
            case "*":{
                multifly();
                break;
            }
            case "/":{
                division();
                break;
            }
            default:{
                break;
            }
        }
    }

    void calculationStart(){
        switch (getArithmeticOperation()){
            case "+" :{
                System.out.println(plus());
            }
            case "-" :{
                minus();
            }
            case "*" :{
                multifly();
            }
            case "/" :{
                division();
            }
            default:{
                break;
            }
        }
    }
}
