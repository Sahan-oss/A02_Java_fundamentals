public class question_13 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14};
        int sum = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                sum += num;
        }
        System.out.println("Sum of even numbers = " + sum);
    }
}
