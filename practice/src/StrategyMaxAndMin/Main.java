package StrategyMaxAndMin;

import java.util.Scanner;

class Finder {

    private FindingStrategy strategy;

    public Finder(FindingStrategy strategy) {
        // write your code here
        this.strategy = strategy;
    }

    /**
     * It performs the search algorithm according to the given strategy
     */
    public int find(int[] numbers) {
        // write your code here
        int result = strategy.getDefaultValue();
        for ( int i: numbers ) {
            result = strategy.takeOne(result,i);
        }
        return result;
    }
}

interface FindingStrategy {

    /**
     * Returns one of two values
     */
    int takeOne(int elem1, int elem2);

    /**
     * Returns the default value of a concrete implementation
     */
    int getDefaultValue();
}

class MaxFindingStrategy implements FindingStrategy {

    public int takeOne(int elem1, int elem2) {
        // write your code here
        return  elem1 > elem2 ? elem1 : elem2 ;
    }

    public int getDefaultValue() {
        // write your code here
        return Integer.MIN_VALUE;
    }
}

class MinFindingStrategy implements FindingStrategy {

    public int takeOne(int elem1, int elem2) {
        // write your code here
        return elem1 < elem2 ? elem1 : elem2 ;
    }

    public int getDefaultValue() {
        // write your code here
        return Integer.MAX_VALUE;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String args[]) {

        final Scanner scanner = new Scanner(System.in);

        final String[] elements = scanner.nextLine().split("\\s+");
        int[] numbers = null;

        if (!elements[0].equals("EMPTY")) {
            numbers = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                numbers[i] = Integer.parseInt(elements[i]);
            }
        } else {
            numbers = new int[0];
        }

        final String type = scanner.nextLine();

        Finder finder = null;

        switch (type) {
            case "MIN":
                finder = new Finder(new MinFindingStrategy());
                break;
            case "MAX":
                finder = new Finder(new MaxFindingStrategy());
                break;
            default:
                break;
        }

        if (finder == null) {
            throw new RuntimeException(
                    "Unknown strategy type passed. Please, write to the author of the problem.");
        }

        System.out.println(finder.find(numbers));
    }
}