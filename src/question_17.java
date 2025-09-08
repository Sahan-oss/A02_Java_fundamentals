public class question_17 {
    public static void main(String[] args) {
        int[] arr = {15, 7, 20, 3, 11};
        int min = arr[0];

        for (int num : arr) {
            if (num < min)
                min = num;
        }
        System.out.println("Smallest = " + min);
    }
}
