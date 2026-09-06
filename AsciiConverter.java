public class AsciiConverter {
    public static void main(String[] args){
        String s = "Logan";

        for (Character c : s.toCharArray()){
            System.out.println((int)c);
        }
    }
}
