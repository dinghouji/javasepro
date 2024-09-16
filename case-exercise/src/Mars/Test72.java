package Mars;

import java.util.Scanner;

public class Test72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        search(start, end);
    }

    public static void search(int start, int end) {
        int count = 0;
        OUT:
        for (int i = start; i <= end; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    continue OUT;
                }
            }

            count++;
            System.out.print(i + " ");

        }
        System.out.println("素数的个数为：" + count);

    }
}
