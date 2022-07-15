package practice;

public class Over {

    int add(int i, int j){
        return i+j;
    }
    public static void main(String[] args) {
        short s = 5;
     //   System.out.println(add(s,6));

    }
}

class Constructor{
    static String str;
    public void Contructor(){
        System.out.println("in constructor");
        str="hello worlr";
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(str);
    }
}
