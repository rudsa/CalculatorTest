public class Calculation {
    private double num1;
    private String arithmeticOperation;
    private double num2;
    private double result;

    private double plus(){
        result = num1 + num2;
        System.out.println(result);
        return result;
    }

    private double minus(){
        result = num1 - num2;
        System.out.println(result);
        return result;
    }

    private double division(){
        result = num1 / num2;
        System.out.println(result);
        return result;
    }

    private double multifly(){
        result = num1 * num2;
        System.out.println(result);
        return result;
    }

    public String getArithmeticOperation() {
        return arithmeticOperation;
    }

    public void setArithmeticOperation(String arithmeticOperation) {
        this.arithmeticOperation = arithmeticOperation;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    void calculationStart(){
        switch (getArithmeticOperation()){
            case "+" :{
                plus();
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
                System.out.println(result);
                break;
            }
        }
    }
}
