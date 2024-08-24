package problems;

public class P073_DiceRoll {
    public static void main(String[] args) {
        System.out.println("Dice roll using Math.random.");
        for (int i = 0; i < 1000; i++) {
            System.out.print((int) Math.floor(Math.ceil(Math.random() * 6)) + " ");
        }
    }
}
