package String;

import java.util.Scanner;

public class string_test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入登录名称：");
            String loginName = sc.nextLine();
            System.out.println("请输入登录密码：");
            String passWord = sc.nextLine();

            if(!login(loginName,passWord)){
                count++;
            }
            else {
                System.out.println("恭喜你成功浸入账号");
                break;
            }
        }
        if(count == 3){
            System.out.println("您输入的三次都没正确，请修改密码！！！");
        }


    }

    public static boolean login(String loginName, String passWord) {
        String okLoginName = "Mars";
        String okPassWord = "19856116770";

        if(loginName.equals(okLoginName) && passWord.equals(okPassWord)) {

            return true;
        }
        System.out.println("您的密码或用户名输入不正确，请检查后重新输入！");
        return false;


    }
}
