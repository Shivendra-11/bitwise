public class bit4 {
    public static int findUniqueNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 4, 5, 5, 5, 6, 3, 4};
        int unique = findUniqueNumber(arr);
        System.out.println("The unique number is: " + unique);
    }
}