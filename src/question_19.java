public class question_19 {
    public static void main(String[] args) {
        String str = args[0];
        String rev = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(rev))
            System.out.println(str + " is a Palindrome.");
        else
            System.out.println(str + " is NOT a Palindrome.");
    }
}
