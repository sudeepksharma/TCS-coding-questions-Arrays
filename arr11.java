
// Remove duplicates from an unsorted array
import java.util.*;

public class arr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size & number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
        }
        int[] res = new int[map.size()];
        int counter = 0;
        for(int i: map.keySet()){
            res[counter] = i;
            counter++;
        }
        for(int i: res){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
