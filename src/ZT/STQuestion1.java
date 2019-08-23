package ZT;

import java.util.Scanner;
import java.util.Stack;

public class STQuestion1 {
    public static int  solution(String[] s){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length;i++){
            switch (s[i]){
                case "+":stack.push(stack.pop()+stack.pop());
                break;
                case "-":stack.push(-stack.pop()+stack.pop());
                break;
                case "/":int a=stack.pop();
                        int b=stack.pop();
                    stack.push(b/a);
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                default:
                    stack.push(Integer.valueOf(s[i]));
                    break;
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String[] inputs=input.split(" ");

        System.out.println(solution(inputs));
    }
}
