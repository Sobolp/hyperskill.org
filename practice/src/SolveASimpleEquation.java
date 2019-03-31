import java.util.Scanner;

public class SolveASimpleEquation {
    /**
     * Given a simple equation, you should output the correct value for variable "x".
     * The equation has two numbers greater than 0 and variable "x", and between these can be "+", "-" or "=".
     * Numbers, variable "x", symbols "+", "-", "=" all separated by a space.
     * <p>
     * It is guaranteed that the equation is correct. The result should be an integer.
     * Sample Input 1:
     * 5 + x = 15
     * Sample Output 1:
     * 10
     * Sample Input 2:
     * x - 8 = 10
     * Sample Output 2:
     * 18
     * Sample Input 3:
     * 10 = 12 + x
     * Sample Output 3:
     * -2
     */
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] arr = scanner.nextLine().split(" ");

            int sighn = -1;
            int par = -1;
            int xInd = -1;
            int aInd = -1;
            int a = 0;
            int bInd = -1;
            int b = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("+") || arr[i].equals("-")) {
                    sighn = i;
                } else if (arr[i].equals("=")) {
                    par = i;
                } else if (arr[i].equals("x")) {
                    xInd = i;
                } else if ((i < par || par == -1) && (i < xInd || xInd == -1) && (aInd == -1)) {
                    a = Integer.parseInt(arr[i]);
                    aInd = i;
                } else if (aInd == -1) {
                    a = Integer.parseInt(arr[i]);
                    aInd = i;
                } else {
                    b = Integer.parseInt(arr[i]);
                    bInd = i;
                }
            }
            int result = 0;
            if (xInd < par) {
                if (aInd < par) {
                    if (sighn == aInd - 1) {
                        if (arr[sighn].equals("-")) {
                            result += a;
                        } else {
                            result -= a;
                        }
                    } else {
                        result -= a;
                    }
                } else {
                    result += a;
                }
                if (sighn == bInd - 1 && arr[sighn].equals("-")) {
                    result -= b;
                } else {
                    result += b;
                }
            } else {
                result += a;
                if (bInd < par) {
                    if (arr[sighn].equals("-")) {
                        result -= b;
                    } else {
                        result += b;
                    }
                } else if (sighn == bInd - 1) {
                    if (arr[sighn].equals("-")) {
                        result += b;
                    } else {
                        result -= b;
                    }
                } else {
                    result -= b;
                    if (arr[sighn].equals("-")) {
                        result *= -1;
                    }
                }
            }
//            System.out.println(Arrays.toString(arr));
//            System.out.println("a = " + a);
//            System.out.println("b = " + b);
//            System.out.println("aInd = " + aInd);
//            System.out.println("bInd = " + bInd);
//            System.out.println("xInd = " + xInd);
//            System.out.println("result = " + result);
            System.out.println(result);
        }
    }

}
