public class str {
    public static void main(String[] args) {
        String b="";
        String a = "Hello";
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        int n=a.length();
        for(int i=n-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        System.out.println("rev: "+b);
        System.out.println(" "+n);
    }
}
