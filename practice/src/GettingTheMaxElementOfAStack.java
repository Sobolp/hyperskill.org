import java.util.*;

/**
 * Write a program simulating a stack that can effectively return the current max element.
 * Your program should read a sequence of commands of different types from the standard input.
 * <p>
 * There are three types of commands:
 * <p>
 * push v is to add an element (v) to a top of the stack;
 * pop is to remove the top element of the stack;
 * max is to return the current max in the stack.
 * The time complexity of these operations should not depend on the stack size (constant time, O(1)).
 * <p>
 * Hint: you may use several standard stacks to write a solution.
 * <p>
 * Input data format
 * <p>
 * The first line contains the number of commands. Next lines contain one of the following commands: push v, pop, max.
 * <p>
 * Output data format
 * <p>
 * The program must output the current max for each command max.
 * <p>
 * Note, that if your methods have time complexity more than O(1), your solution will not be accepted by timeout restriction.
 * Sample Input 1:
 * 5
 * push 2
 * push 1
 * max
 * pop
 * max
 * Sample Output 1:
 * 2
 * 2
 * Sample Input 2:
 * 5
 * push 1
 * push 2
 * max
 * pop
 * max
 * Sample Output 2:
 * 2
 * 1
 * Sample Input 3:
 * 10
 * push 2
 * push 3
 * push 9
 * push 7
 * push 2
 * max
 * max
 * max
 * pop
 * max
 * Sample Output 3:
 * 9
 * 9
 * 9
 * 9
 */

public class GettingTheMaxElementOfAStack {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        MyStack stack = new MyStack();
        for (int i = 0; i < n; i++) {
            stack.run(Arrays.asList(scanner.nextLine().split("\\s+")));
        }
    }
}

class MyStack {
    private Deque<Integer> maxValue = new ArrayDeque<>();

    private void push(Integer e) {
        Integer prevMax = maxValue.peekLast() == null ? Integer.MIN_VALUE : maxValue.peekLast();
        maxValue.offerLast(prevMax < e ? e : prevMax);
    }

    private void pop() {
        maxValue.pollLast();
    }

    private Integer max() {
        return maxValue.peekLast();
    }

    public void run(List<String> command) {
        switch (command.get(0)) {
            case "push":
                this.push(Integer.parseInt(command.get(1)));
                break;
            case "pop":
                this.pop();
                break;
            case "max":
                System.out.println(this.max());
                break;
            default:
                System.out.println("Wrong command");
                break;
        }
    }

}