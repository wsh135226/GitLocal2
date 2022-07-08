package test;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入我是猪，否则电脑将自动关机！");
        String next = scanner.next();
        if (next == "我是猪"){
            System.out.println("哈哈哈！");
            
        }else {
            System.out.println("五秒后关机！");
            Runtime.getRuntime().exec("Shutdown -s -t 5");
        }
    }
}
