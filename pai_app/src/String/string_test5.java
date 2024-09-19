package String;


import java.util.Random;
import java.util.Scanner;

//随机验证码
public class string_test5 {
    public static void main(String[] args) {
        System.out.println(creatCode(4));
        System.out.println(creatCode(6));


    }

    public static String creatCode(int n){
        String code = "";
        String codes = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(62);
            code += codes.charAt(index);
        }
        return code;
    }
}
