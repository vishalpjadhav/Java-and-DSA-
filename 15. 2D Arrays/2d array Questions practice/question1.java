/*
Question 1 Print the number of 7’s that are 
in the 2d array. Example : 
Input - int array = ( (4,7,8},(8,8,7} }; 
Output - 2  
*/

public class question1 {
    public static int Count(int array[][]){
        int count = 0;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<=array[0].length-1; j++){
                if(array[i][j]== 7){
                    count ++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        int array[][] = {{4,7,8},
                        {1,7,7},
                    {0,7,0}};
        Count(array);
    }
}
