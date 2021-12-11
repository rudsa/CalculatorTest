public class Calculation {
    private int num1;
    private String cal;
    private int num2;
    private int result;

    private int sum(){
        result = num1 + num2;
        return result;
    }

    private int minus(){
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

    public String getCal() {
        return cal;
    }

    public void setCal(String cal) {
        this.cal = cal;
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
