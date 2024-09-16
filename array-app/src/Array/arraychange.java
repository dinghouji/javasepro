package Array;
//翻转数组元素

public class arraychange {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40 ,50};

        for (int i = 0 ,j = a.length - 1; i < j; i++ ,j--) {
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;

        }
        for (int j : a) {
            System.out.print( " " + j);

        }
    }
}
