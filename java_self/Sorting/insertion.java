package Sorting;
public class insertion{
        public static void insert(int arr[]) {
         for(int i=1;i<arr.length;i++){
          int curr = arr[i];
          int prev = i-1;
          while(prev>=0 && arr[prev] > curr) {
            arr[prev+1] = arr[prev];
            prev --;
          }
          arr[prev+1] = curr;
        }
     }
        public static void Print(int arr[]) {
        for(int i =0;i<arr.length;i++){
           System.out.print(arr[i]+"");
        }
        System.out.println();
     }
        public static void main(String args[]) {
        int arr[]={4,6,3,5,2,1};
        insert(arr);
        Print(arr);
    }
}

