import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "  (a + b)";
        Expression exp = new Expression();
        var result = exp.isBalanced(str);
        System.out.println(result);



    }
}