package bai3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyQueue {
    public static Queue<String> list = new LinkedList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\"1. Nhập tên phụ huynh nộp hồ sơ \\n\" +\n" +
                    "\"2. Phụ huynh tiếp theo\\n\" +\n" +
                    "\"3. Thoát \\n\");");
            System.out.println("nhập lựa chọn của bạn ");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num){
                case 1:
                    System.out.println("nhập tên phụ huynh vao hàng chờ");
                    list.add(sc.nextLine());
                    break;
                case 2:
                    if (list.isEmpty()){
                        System.out.println("Không còn phụ huynh tiếp ");
                    }else {
                        System.out.println("Phụ huynh tiếp là " + list.poll());
                    }
                    break;
                case 3:
                    System.out.println("thoát");
                    System.exit(0);
                    break;
                default:
                    System.err.println("nhập lại đi ");
                    break;
            }
        }
    }
}
