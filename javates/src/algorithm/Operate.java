package algorithm;

import java.util.Stack;

public class Operate {
    public int calculate(String reg) {
        Stack<String> ops = new Stack<String>();
        Stack<Integer> num = new Stack<Integer>();
        int[] a = new int[1];
        if(reg.startsWith("(")) {
            String[] member = reg.split(" ");
            for(int i = 0; i < member.length; i++) {
                if(member[i].equalsIgnoreCase("(")) {
                    continue;
                } else if(member[i].equalsIgnoreCase("+")) {
                    ops.push(member[i]);
                } else if(member[i].equalsIgnoreCase("-")) {
                    ops.push(member[i]);
                } else if(member[i].equalsIgnoreCase("*")) {
                    ops.push(member[i]);
                } else if(member[i].equalsIgnoreCase("/")) {
                    ops.push(member[i]);
                } else if(member[i].equalsIgnoreCase(")")) {
                    String op = ops.pop();
                    int val1 = num.pop();
                    int temp = 0;
                    switch(op) {
                    case "+":
                        temp = num.pop() + val1;
                        break;
                    case "-":
                        temp = num.pop() - val1;
                        break;
                    case "*":
                        temp = num.pop() * val1;
                        break;
                    case "/":
                        temp = num.pop() / val1;
                        break;
                    }
                    num.push(temp);
                } else {
                    num.push(Integer.parseInt(member[i]));
                }
            }
            return num.pop();
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Operate op = new Operate();
        int result = op.calculate("( 1 + ( 2 * 5 ) )");
        System.out.println("" + result);
    }
}
