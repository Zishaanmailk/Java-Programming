public class PositiveNegativeZero {
    public static void main(String[] args) {
        int num = -5;
        String result = (num > 0) ? "Positive" : (num<0) ? "Negative" : "Zero";
        System.out.println("the number " + num + " is " + result);
    }
    
}
