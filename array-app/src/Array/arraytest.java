package Array;
import java.util.Scanner;
public class arraytest {
    public static void main(String[] args) {
        int[] grade = new int[7];
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        for (int i = 0; i < grade.length; i++) {
            grade[i] = sc.nextInt();
            sum += grade[i];
        }
        System.out.println(sum / grade.length);
    }
}
