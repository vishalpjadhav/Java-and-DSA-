public class largest_String {
    public static void main(String[] args) {
        // String arr[] = { "apple", "mango", "banana" };
        // System.out.println(fruits[0].comparetoIgnoreCase(fruits[1]));
        String arr[] = { "dog", "cat", "elephant" };
        String largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
