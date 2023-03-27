package bai2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static Stack<String> stack = new Stack<>();
    public  static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    "1. Nhập câu\n" +
                    "2. Đảo ngược câu\n" +
                    "3. Thoát\n");
            int num = Integer.parseInt(sc.nextLine());
            switch (num){
                case 1:
                    input();
                    break;
                case 2:
                    reverse();
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
    private static void input() {
        System.out.println("hay nhập câu b muốn ");
        String string = sc.nextLine();
        String arrString[] = string.split(" ");
        for (int i = 0; i < arrString.length; i++) {
            stack.push(arrString[i]);
        }
    }

    private static void reverse() {
        for (int i = 0; i <= stack.size()+1; i++) {
            System.out.print(stack.pop()+" ");
        }
    }

}
