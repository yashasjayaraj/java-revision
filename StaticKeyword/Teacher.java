package StaticKeyword;

public class Teacher {
    public static String name;
    public int UID;

    public Teacher(int UID){
        this.UID = UID;
    }

    @Override
    public String toString(){
        return "Teacher {name='" + name + "',UDI="+UID+"}";
    }
}
