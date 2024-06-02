package src.may.ex_30052024;

import java.util.Stack;

public class Lab243 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(); //FILO
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.add("D");
        System.out.println(stack); //[A, B, C, D]
        System.out.println(stack.pop()); //D
        System.out.println(stack.peek()); //C
        System.out.println(stack);//[A, B, C]
    }
}
