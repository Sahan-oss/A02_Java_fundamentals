public class question_08 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int key = 30;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(key + " found in array.");
        else
            System.out.println(key + "not found.");
    }
}
