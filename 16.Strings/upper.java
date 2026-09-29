public class upper {
    public static String ToUppercase(String str){
        if(str.length() == 0) return str;

        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            if(i == 0 || str.charAt(i-1) == ' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "java is fun";
        System.out.println(ToUppercase(str));
    }
}