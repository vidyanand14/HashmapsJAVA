import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack.peek());
        System.out.println(stack);
        var top2 = stack.pop();
        System.out.println(stack);
        System.out.println(top2);// it shows which element is popped
    }
}