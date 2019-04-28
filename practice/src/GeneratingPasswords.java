import java.util.*;

/**
 * The password is hard to crack if it contains at least A uppercase letters,
 * at least B lowercase letters, at least C digits and includes exactly N symbols.
 * Also, a password cannot contain two or more same characters coming one after another.
 * For a given numbers A, B, C, N you should output password that matches these requirements.
 * <p>
 * Sample Input 1:
 * 3 4 1 8
 * Sample Output 1:
 * PaSsw0rD
 */
public class GeneratingPasswords {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        List<Character> passwrd = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < a; i++) {
            passwrd.add((char) (rnd.nextInt(26) + 'A'));
        }
        for (int i = 0; i < b; i++) {
            passwrd.add((char) (rnd.nextInt(26) + 'a'));
        }
        for (int i = 0; i < c; i++) {
            passwrd.add((char) (rnd.nextInt(10) + '0'));
        }
        if (n > (a + b + c)) {
            for (int i = 0; i < n - (a + b + c); i++) {
                passwrd.add((char) (rnd.nextInt(26) + 'a'));
            }
        }
        Collections.shuffle(passwrd);
        char prev = passwrd.get(0);
        for (int i = 1; i < n; i++) {
            System.out.print(prev);
            if (prev == passwrd.get(i)) {
                int ascii = (int) passwrd.get(i);
                if (ascii == 122 || ascii == 90 || ascii == 57) {
                    prev = (char) (ascii - 2);
                } else {
                    prev = (char) ++ascii;
                }
            } else {
                prev = passwrd.get(i);
            }
        }
        System.out.print(prev);

    }
}
