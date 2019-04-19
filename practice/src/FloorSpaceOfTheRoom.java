import java.util.Scanner;

public class FloorSpaceOfTheRoom {
    /**
     * Residents of the country of Malevia often experiment with the plan of their rooms.
     * Rooms can be triangular, rectangular, and round.
     * To quickly calculate the floorage it is required to write a program that gets the type of the room shape and the relevant parameters as input.
     * The program should output the area of the resulting room.
     *
     * The value of 3.14 is used instead of the number π in Malevia.
     *
     * Hint: Math library may help you to solve this task.
     *
     * Input format used by the Malevians:
     *
     * triangle
     * a
     * b
     * c
     *
     * where a, b and c — lengths of the triangle sides.
     *
     * rectangle
     * a
     * b
     *
     * where a and b — lengths of the rectangle sides.
     *
     * circle
     * r
     *
     * where r — circle radius.
     *
     * Note, the input values (a, b, c, r) are doubles and your answer should be, too.
     *
     * Sample Input 1:
     * rectangle
     * 4
     * 10
     * Sample Output 1:
     * 40.0
     * Sample Input 2:
     * circle
     * 5
     * Sample Output 2:
     * 78.5
     * Sample Input 3:
     * triangle
     * 3
     * 4
     * 5
     * Sample Output 3:
     * 6.0
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int n = 0;
        switch (type) {
            case "triangle":
                n = 3;
                break;
            case "rectangle":
                n = 2;
                break;
            case "circle":
                n = 1;
                break;
            default:
                n = 0;
                break;
        }
        double[] dem = new double[n];
        for (int i = 0; i < n; i++) {
            dem[i] = scanner.nextDouble();
        }
        double result = 0;
        switch (type) {
            case "triangle":
                double p = (dem[0] + dem[1] + dem[2]) / 2;
                result = Math.sqrt(p * (p - dem[0]) * (p - dem[1]) * (p - dem[2]));
                break;
            case "rectangle":
                result = dem[0] * dem[1];
                break;
            case "circle":
                result = 3.14 * (Math.pow(dem[0], 2));
                break;
            default:
                result = 0;
                break;
        }
        System.out.println(result);

    }
}
