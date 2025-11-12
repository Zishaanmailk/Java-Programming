import java.util.Scanner;
 public class CRC{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the data array: ");
        int size = scan.nextInt();
        
        int data[] = new int[size];
        
        System.out.println("Enter data bits one by one: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter bit " + (i + 1) + ": "); 
            data[i] = scan.nextInt();
        }
         
        System.out.print("Enter the size of the divisor array: ");
        int div_size = scan.nextInt();
        
        int divisor[] = new int[div_size];
        System.out.println("Enter divisor bits one by one: ");
        for (int i = 0; i < div_size; i++) {
            System.out.print("Enter bit " + (i + 1) + ": ");
            divisor[i] = scan.nextInt();
        }
        
        int rem[] = divideDataWithDivisor(data, divisor);
        
        System.out.print("Remainder: ");
        for (int i = 0; i < rem.length - 1; i++) {
            System.out.print(rem[i]);
        }
        System.out.println();
        
        System.out.println("Generated CRC code is: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]); 
        }
        for (int i = 0; i < rem.length - 1; i++) {
            System.out.print(rem[i]);
        }
        System.out.println();
        
              int sentData[] = new int[data.length + rem.length - 1];
        System.out.println("Enter received data bits (" + sentData.length + " bits): ");
        for (int i = 0; i < sentData.length; i++) {
            System.out.print("Enter bit " + (i + 1) + ": ");
            sentData[i] = scan.nextInt();
        }
       
        receiveData(sentData, divisor);
        scan.close();
    } 
    
        static int[] divideDataWithDivisor(int oldData[], int divisor[]) {
        int rem[] = new int[divisor.length];
        int data[] = new int[oldData.length + divisor.length];
        System.arraycopy(oldData, 0, data, 0, oldData.length);
        System.arraycopy(data, 0, rem, 0, divisor.length);
        for (int i = 0; i < oldData.length; i++) {
            if (rem[0] == 1) {
                for (int j = 1; j < divisor.length; j++) {
                    rem[j - 1] = exorOperation(rem[j], divisor[j]);
                }
            } 
            else {
                for (int j = 1; j < divisor.length; j++) {
                    rem[j - 1] = exorOperation(rem[j], 0);
                }
            }
            rem[divisor.length - 1] = data[i + divisor.length];
        }
        return rem;
        }
    
        static int exorOperation(int x, int y) {
        return (x == y) ? 0 : 1;
    }
    static void receiveData(int data[], int divisor[]) {
         int rem[] = divideDataWithDivisor(data, divisor);
        for (int i = 0; i < rem.length; i++) {
            if (rem[i] != 0) {
                System.out.println("Corrupted data received!");
                return;
            }
        }
        System.out.println("Data received without any error.");
    }

   
 }