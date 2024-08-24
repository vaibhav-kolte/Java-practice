package problems;

public class P075_StringBuilder {
    public static void main(String[] args) {
        System.out.println("String builder example.");

        String[] stringArray = Utility.getStringArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (String string : stringArray) {
            stringBuilder.append(string);
            stringBuilder.append(" ");
        }
        System.out.println("Result: " + stringBuilder);
    }
}
