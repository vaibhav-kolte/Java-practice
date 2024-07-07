public class Problem2 {
    public static void main(String[] args) {
        int start = 101;
        int stop = 1000;
        boolean isCurrentNumberPrime;
        int count = 0;

        for (int i = Math.max(start, 2); i <= stop; i++) {
            isCurrentNumberPrime = true;

            for (int j = 2; j < i - 1; j++) {
            // for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                    isCurrentNumberPrime = false;
                    break;
                }
            }

            if (isCurrentNumberPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println("count = " + count);
    }
}
