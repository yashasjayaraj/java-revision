package StaticKeyword;

public class Example {
    public static void main(String[] args) {

        // Static variable so it is shared among all the objects.
        Teacher.name = "Varshitha";
        Teacher t1 = new Teacher(10);
        Teacher t2 = new Teacher(20);

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        System.out.println(Example.AddNumbers(10, 20));
    }

    // Static Method
    public static int AddNumbers(int x,int y){
        int a;
        a = x+y;
        return a;
    } // Inside static method instance/class variables are not allowed. 

    
}
