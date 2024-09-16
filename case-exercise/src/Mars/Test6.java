package Mars;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //抢红包案例开发
        int[] moneys = {10 ,33 ,666 ,999 ,10000};
        start(moneys);

    }

    public static void start(int[] moneys){
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < moneys.length; j++) {
            System.out.print("请输入任意的字符开始抽奖: ");
            sc.next();  //模拟抽奖的一个过程，用户按下回车键进行抽奖
            Random rand = new Random();

            while (true) {
                int i = rand.nextInt(5);
                if(moneys[i] != 0){
                    System.out.println("恭喜你，抽中了" + moneys[i]);
                    moneys[i] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束！！！");
    }
}
