public class Stack {

    private final int MAX_SIZE = 100;
    private int top;
    private Object item[] = new Object[MAX_SIZE];

    public Stack() {
        this.top = -1;
    }

    // isEmpty function

    public boolean isEmpty() {
        // if (top == -1) {
        // return true;
        // } else {
        // return false;
        // }

        return top < 0;
    }

    // push function

    public void push(Object Element) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack is full on push");
        } else {
            top++;
            item[top] = Element;
        }
    }

    // pop function

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty on pop");
        } else {
            top--;
        }
    }

    // pop function hold the element

    public Object pop(Object Element) {
        if (isEmpty()) {
            return ("stack is empty on pop");
        } else {

            Element = item[top];
            top--;
            return Element;
           
        }
    }

    // peek function hold the top element of stack without remove it

    // public Object peek(Object stackTop) {
        public Object peek() {
        if (isEmpty()) {
            return ("stack is empty on peek");
        } else {
            // stackTop = item[top];
            return item[top];
        }
    }

    // print function

    public void print() {
        System.out.print('[');
        for (int i = top; i >= 0; i--) {
            System.out.print(item[i] + " ");
        }
        System.err.print(']');
        System.out.println();
    }

}
