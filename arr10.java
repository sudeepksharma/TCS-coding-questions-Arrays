
// Remove duplicates from a sorted array
import java.util.*;

public class arr10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size and elements of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[k] != arr[j]) {
                k++;
                arr[k] = arr[j];
            }
        }

        for (int i = 0; i < k + 1; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}