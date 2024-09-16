package Mars;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        double sum1 = getavg();

        System.out.println(sum1);
    }
    public static double getavg(){
        int n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i = 0; i < n; i++){
            temp = arr[i];
            for(int j = i+1; j < n; j++){
                if(arr[j] < temp){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int m = 1; m < n - 1; m++){
            sum += arr[m];
        }
        return sum/(n - 2);
    }

}
