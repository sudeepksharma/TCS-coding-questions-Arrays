
// average of array elements
import java.util.*;

public class arr9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size & number of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        float avg = (float) sum / n;
        System.out.println(avg);
        sc.close();
    }
}
