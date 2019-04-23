import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintIfPrimeTaskTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(4); // assign an object to it

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            // create and submit tasks
            executor.submit( new PrintIfPrimeTask(number));
        }
        executor.shutdown();
    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        // write code of task here
        boolean ifPrime = true;
        if (this.number == 1){
            ifPrime = false;
        }
        for (int i = this.number - 1; i > 1; i--) {
            if (this.number % i == 0) {
                ifPrime = false;
                break;
            }
        }
        if (ifPrime) {
            System.out.println(this.number);
        }
    }
}

