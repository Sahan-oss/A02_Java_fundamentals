public class question_10 {
    public static void main(String[] args) {
        int[] arr = {11, 20, 33, 40, 55, 60};

        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0)
                System.out.print(num + " ");
        }
    }
}
