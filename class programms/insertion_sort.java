import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = a.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
        }

        int[] result = inser(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] inser(int[] arr, int n) {
       int j;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            // Shift elements that are greater than key to one position ahead
            for(j = i - 1;j >= 0 && arr[j] > key;j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
