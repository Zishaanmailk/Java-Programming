import java.util.Scanner;
 public class SimpleLineEncoding{
    static void  unipolarNZD(int[] bits){
        for(int i=0;i<bits.length;i++){
            if(bits[i]==1){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
     static void polarNZD(int[] bits){
        for(int i =0; i<bits.length;i++){
            if(bits[i]==1){
                System.out.println("+1");
            }
            else{
                System.out.println("-1");
            }
        }
    }
    static void manchester(int[] bits){
        for(int i=0; i<bits.length;i++){
            if(bits[i]==1){
                System.out.println("+1 -1");
            }
            else{
                System.out.println("-1 +1");
            }
        }
    }
    static void differentialManchester(int[] bits){
        int lastLevel = 1; 
        for(int i=0; i<bits.length;i++){
            if(bits[i] == 0){
                
                lastLevel = -lastLevel;
            }
            
            System.out.println(lastLevel + " " + (-lastLevel));
            
            lastLevel = -lastLevel;
        }
    }
    
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the lenght of the i/p bits: ");
            int n =input.nextInt(); 
            
            System.out.println("Enter the bits (0 or 1): ");
            int[] bits = new int[n]; 
            for(int i =0; i<n;i++){ 
                bits[i] = input.nextInt(); 
            }
            
            System.out.println("Unipolar Non-Zero Differential Encoding : 1");
            System.out.println("Polar Non-Zero Differential Encoding : 2");
            System.out.println("Manchester Encoding : 3");
            System.out.println("Differential Manchester Encoding : 4");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt(); 
            
            
            switch(choice){
                case 1 :
                    unipolarNZD(bits);
                    break;
                case 2 :
                    polarNZD(bits);
                    break;
                case 3 :
                     manchester(bits);
                     break;
                case 4 :
                     differentialManchester(bits);
                     break;
                default :
                     System.out.println("Not a valid choice.... Please try again.");
                     break;
            }
        }
    }
 }