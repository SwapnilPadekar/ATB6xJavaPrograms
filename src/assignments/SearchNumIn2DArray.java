package assignments;

public class SearchNumIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int num = 8;
        int flag = 0;

        for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr.length; j++){
                if (arr[i][j] == num ){
                    flag = 1;
                }
            }
        }
        if(flag ==1){
            System.out.println("Match found");
        }else {
            System.out.println("No match found");
        }
    }
}