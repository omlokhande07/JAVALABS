package lab3.Parent;

public class Parent {
    public static void setA(int a) {
        Parent.a = a;
    }

    public static void setB(int b) {
        Parent.b = b;
    }

    public static int a,b;

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }
    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }
}