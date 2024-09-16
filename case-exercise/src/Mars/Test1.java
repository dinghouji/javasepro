package Mars;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        double price = calculate(1000 ,10 ,"头等舱");
        System.out.println(price);
    }

    public static double calculate(double price, int month, String type) {
        if(month >= 5 && month <= 10) {
            if(type.equals("头等舱")) {
                return price * 0.9;
            }
            else {
                return price * 0.85;
            }
        }

        else {
            if(type.equals("头等舱")){
                return price * 0.7;
            }
            else {
                return price * 0.65;
            }
        }
    }




}
