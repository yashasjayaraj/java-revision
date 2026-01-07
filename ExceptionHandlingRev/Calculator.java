package ExceptionHandlingRev;

public class Calculator {
    
    public void divideByZero(int number){
        try{
            int x = number/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    public int add(int number1,int number2) throws ArithmeticException{
        // int res = number1 + number2;
        throw new ArithmeticException("throw Arthematic exception");
    }

    public void usingAdd(){
        try {
            add(10, 20);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
