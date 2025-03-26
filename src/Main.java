import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            switch (input){
                case 1 : {
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                }
                case 2 : {
                    sb.append(!stack.empty()? stack.pop()+"\n" : "-1\n");
                    break;
                }
                case 3 : {
                    sb.append(!stack.empty() ? stack.size() + "\n" : "0\n");
                    break;
                }
                case 4 : {
                    sb.append(!stack.empty() ? "0\n" : "1\n");
                    break;
                }
                case 5 : {
                    sb.append(!stack.empty() ? stack.peek() + "\n" : "-1\n");
                    break;
                }
            }
            System.out.print(sb);
        }
    }
}

