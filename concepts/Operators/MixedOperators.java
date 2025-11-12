class MixedOperators{
    public static void main(String []args){
        int a=4,b=2,c=7;
        int result = ++a *(b--+~c)-(-b);
        System.out.println("Result: "+result);
    }
}