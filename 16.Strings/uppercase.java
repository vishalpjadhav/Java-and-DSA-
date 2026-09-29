public class uppercase {
    public static String Touppercase(String sen){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(sen.charAt(0));
        sb.append(ch);

        for(int i=1; i<sen.length(); i++){
            if(sen.charAt(i) == ' ' && i<sen.length()-1){
                sb.append(sen.charAt(i));
                i++;
                sb.append(Character.toUpperCase(sen.charAt(i)));
            }else {
                sb.append(sen.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String sen = "java is fun";
        System.out.println(Touppercase(sen));
    }
}
