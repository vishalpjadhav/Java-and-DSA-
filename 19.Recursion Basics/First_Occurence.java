public class First_Occurence {
    public static int First_Occ(int arr[], int key,int i) {
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return First_Occ(arr , key , i+1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 8, 8, 5 };
        int key = 5, i = 0;
        System.out.println(First_Occ(arr,key,i));

    }
}
