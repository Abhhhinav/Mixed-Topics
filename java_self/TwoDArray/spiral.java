package TwoDArray;
public class spiral {
    public static void sp(int arr[][]){
        int sr = 0;
        int sc = 0;
        int er = arr.length-1;
        int ec = arr[0].length-1;
        while(sr<=er && sc<=ec){
            // top
            for(int j = sc; j<=ec ;j++){
               System.out.print(arr[sr][j] + " ");
            }
            //right
            for(int i = sr + 1; i<=er; i++){
                System.out.print(arr[i][ec] +" ");
            }
            //bottom
            for(int j = ec - 1; j>=sc; j--){
                if(sr==er){
                    break;
                }
                System.out.print(arr[er][j]+" ");
            }
            //left
            for(int i = er - 1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(arr[i][sc] + " ");
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}
                       };
        sp(arr);
    }
}