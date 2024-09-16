package Mars;

import java.util.Random;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        int[] userNumber = userSelectNumber();
        printArray(userNumber);

        int[] creatNumber = creatLuckNumber();
        printArray(creatNumber);

        contrastNumber(userNumber , creatNumber);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.print("]");
        System.out.println();
    }

    public static int[] userSelectNumber(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; i++) {
            while (true) {
                System.out.println("请输入一个(1~33)的数字：");
                int num = sc.nextInt();
                if(num > 33 || num < 1){
                    System.out.println("请输入(1~33)的数字！");
                    continue;
                }
                if(!exist(arr, num)){
                    arr[i] = num;
                    break;
                }
                else{
                    System.out.println("你输入的数字和前面重复了请重新输入！");
                }
            }
        }

        while (true){
            System.out.println("请输入一个蓝色的号码范围在(1~16):");
            int num = sc.nextInt();
            if(num > 16 || num < 1){
                 System.out.println("你输入的数字不在(1~16)的范围内，请重新输入！！");
            }
            else{
                arr[6] = num;
                break;
            }
        }
        return arr;
    }

    public static boolean exist(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int[] creatLuckNumber(){
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            while (true) {
                int num = random.nextInt(33) + 1;
                if(!exist(arr, num)){
                    arr[i] = num;
                    break;
                }
            }
        }

        //随机蓝球
        int num = random.nextInt(16) + 1;
        arr[6] = num;

        return arr;

    }

    public static void contrastNumber(int[] userNumber,int[] creatNumber){
        int redCount = 0;
        int blueCount = 0;
        for(int i = 0; i < userNumber.length - 1; i++) {
            for(int j = 0; j < creatNumber.length - 1; j++) {
                if (userNumber[i] == creatNumber[j]) {
                    redCount++;
                    break;
                }
            }
        }
        if(userNumber[userNumber.length - 1] == creatNumber[creatNumber.length - 1]){
            blueCount++;
        }

        System.out.println("您命中的红球数量是：" + redCount);
        System.out.println("您命中的蓝球数量是：" + blueCount);

        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜您中一等奖：一千万");
        }
        if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜您中一等奖：五百万");
        }
        if(redCount == 5){
            System.out.println("恭喜您中三等奖：三千");
        }
        if(redCount == 4){
            System.out.println("恭喜您中四等奖：两百");
        }
        if(redCount == 3 && blueCount == 0){
            System.out.println("恭喜您中五等奖：10");
        }
        if(redCount == 2 && blueCount == 1){
            System.out.println("恭喜您中五等奖：10");
        }
        if(redCount == 1 && blueCount == 1){
            System.out.println("恭喜您中六等奖：5");
        }
        if(redCount == 0 && blueCount == 1){
            System.out.println("恭喜您中六等奖：5");
        }
        else {
            System.out.println("抱歉你没中奖！");
        }
    }

}
