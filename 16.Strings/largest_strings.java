public class largest_strings {
    public static void main(String[] args) {
        String name[] = {"vishal","shivraj","vaibhav","uday"};

        String largest = name[0];
        for(int i=1; i<name.length;i++){
            if(largest.compareToIgnoreCase(name[i]) < 0){
                largest = name[i];

            }
        }
        System.out.println("largest String is :- "+ largest);
    }
}
