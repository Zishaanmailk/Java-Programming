public class selection_sort {
    public static void main(String[] args) {

    int[] arrr={1,5,6,73,8,59,748,93,95,77,78,54,47};
    int[] result=select( arrr);
    for(int i=0;i<arrr.length;i++){
        System.out.print(" "+result[i]);
        System.out.print(" ");

    }
    }
    public static int[] select(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
           int min=i;
           for(int j=i;j<n;j++){
               if(arr[j]<arr[min]){
                   min=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
        }
        return arr;
    }
}
