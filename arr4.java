
//reverse an array
import java.util.*;

public class arr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res[] = new int[n];
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            res[count++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
