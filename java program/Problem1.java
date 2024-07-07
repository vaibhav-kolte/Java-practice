public class Problem1 {
    public static void main(String[] args) {
        String name = "Vaibhav";

        System.out.println("\n\nMethod 1");
        int i = 0;
        int nameLenght = name.length();
        while (i < nameLenght) {
            System.out.println(name.charAt(i));
            i++;
        }

        System.out.println("\n\nMethod 2");
        for (int j = 0; j < name.length(); j++) {
            System.out.println(name.charAt(j));
        }

        System.out.println("\n\nMethod 3");
        char[] nameChar = name.toCharArray();
        for (char ch : nameChar) {
            System.out.println(ch);
        }

    }
}
