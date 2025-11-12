public class ArraySumAvg {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
    double Avg = (double) sum / numbers.length;
    System.out.println("The sum is :" +sum);
    System.err.println("The Average is :" +Avg);
    }

}
