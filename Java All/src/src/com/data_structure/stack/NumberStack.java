package src.com.data_structure.stack;


public class NumberStack {

    private final int[] stack;
    private int count;
    private final int length;

    public NumberStack(int length) {
        this.length = length;
        stack = new int[length];
        count = -1;
    }

    public void push(int value) throws StackUnderflowException {
        System.out.println("count" + length + " " + count);
        if ((length - 1) > count)
            stack[++count] = value;
        else {
            throw new StackUnderflowException("Stack is full");
        }
        System.out.println("count" + length + " " + count);
    }

    public int pop() throws EmptyStackException {
        if (count >= 0) {
            int result = stack[count];
            stack[count--] = 0;
            return result;
        }
        throw new EmptyStackException("Stack is empty");
    }

    public int peek() throws EmptyStackException {
        if (count >= 0)
            return stack[count];
        throw new EmptyStackException("Stack is empty");
    }

    public boolean isEmpty() {
        return count < 0;
    }

    public void printStack() {
        if (count > -1) {
            for (int i = 0; i <= count; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
    }
}
