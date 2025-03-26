package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOK28278 {
    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            if (input == 1){
                int value = Integer.parseInt(st.nextToken());
                stack.push(value);
            } else if (input == 2) {
                if (stack.empty()){
                    sb.append("-1\n");
                }
                else {
                    sb.append(stack.pop()+"\n");
                }
            } else if (input == 3) {
                sb.append(stack.size()+"\n");
            } else if (input == 4) {
                if(stack.empty()){
                    sb.append("1\n");
                }
                else {
                    sb.append("0\n");
                }
            }else {
                if (stack.empty()){
                    sb.append("-1\n");
                }
                else {
                    sb.append(stack.peek()+"\n");
                }
            }
            System.out.print(sb);
        }
    }
}
