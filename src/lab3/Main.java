package lab3;
import lab3.Parent.Parent;
public class Main {
    public static void main(String[] args) {

        Parent bcalc1 = new Parent();

        System.out.println(bcalc1.add(10, 20));
        System.out.println(bcalc1.sub(10, 20));

        lab3.Child.Child sCalc1 = new lab3.Child.Child();
        System.out.println(sCalc1.add(10, 20));
        System.out.println(sCalc1.sub(10, 20));
        System.out.println(sCalc1.sin(90));
    }
}
