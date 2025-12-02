import java.util.Arrays;

public class DynamicArrayExample {
    public static void main(String[] args) {
        int size = 0;
        if (args.length >= 1) {
            size = Integer.parseInt(args[0]);
        } else {
            System.out.println("No size provided as argument. Example uses size=3");
            size = 3;
        }

        try {
            int[] arr = new int[size];
            
            for (int i = 0; i < arr.length; i++) arr[i] = i + 1;
            System.out.println("Created array: " + Arrays.toString(arr));
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException caught: size cannot be negative (" + size + ")");
        }
    }
}
