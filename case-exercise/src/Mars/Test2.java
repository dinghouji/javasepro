package Mars;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        creatcode(n);
    }

    public static void creatcode(int n){

        Random r = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {

            int type = r.nextInt(3);
            switch (type) {
                case 0:code += r.nextInt(10); break;
                case 1:code += (char)(r.nextInt(26) + 65); break;
                case 2:code += (char)(r.nextInt(26) + 97); break;
            }
        }
        System.out.println(code);

    }
}
