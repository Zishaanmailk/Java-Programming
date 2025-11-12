import java.util.*;

class String_3{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        int size=0;

        size =name.length();


        System.out.println("The length of the string is: "+size);
        System.out.println("The first letter of the string is: "+name.charAt(0)+" and last word is "+name.charAt(size-1));
        
        name=name.toLowerCase();
        Character palindrome[]=new Character[size];
        for(int i=0;i<size;i++){
            palindrome[i]= name.charAt(size-1-i);
        }
        
        
        System.out.println("Is the string palindrome: "+palindrome.equals(name));
        
        
        System.out.println("Is the string palindrome: "+palindrome.equals(name));
        name= name.replace('a', 'o');
        System.out.println("After replacing 'a' with 'o',we get: "+name );
        

        
    }
}
//Kirlosk