package ExceptionHandlingRev;

public class ExceptionMain {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.divideByZero(10);
        obj.usingAdd();
        System.out.println("Program still ran after expection");
    }
}
