public class question_18 {
    public static void main(String[] args) {
        String str = args[0].toLowerCase();
        int count = 0;

        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1)
                count++;
        }
        System.out.println("Number of vowels = " + count);
    }
}
