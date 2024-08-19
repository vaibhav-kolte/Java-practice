package problems;

public class P046_ArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("Array Palindrome or not.");

        int[] array = Utility.getIntegerArray();

        System.out.println("Your array is" + (checkArrayIsPalindrome(array) ? "" : " not") + " palindrome array.");
    }

    private static boolean checkArrayIsPalindrome(int[] array) {
        int prevIndex = array.length - 1;
        for (int i = 0; i <= prevIndex / 2; i++) {
            if (array[i] == array[prevIndex]) {
                prevIndex--;
            } else {
                return false;
            }
        }
        return true;
    }
}
