public class question_12 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 25, 8, 30};
        int max = arr[0];

        for (int num : arr) {
            if (num > max)
                max = num;
        }
        System.out.println("Largest = " + max);
    }
}
