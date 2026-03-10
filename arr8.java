
//rotate array by K elements- block swap algorithm
import java.util.*;

public class arr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value of k:");
        int k = sc.nextInt();
        k = k % n; // in case k is greater than n
        int res[] = new int[n];
        int counter = 0;

        for (int i = k; i < n; i++) {
            res[i] = arr[counter];
            counter++;
        }
        for (int i = 0; i < k; i++) {
            res[i] = arr[counter];
            counter++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
