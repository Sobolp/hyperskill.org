import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MessageNotifier extends Thread {

    // write fields to store variables here
    String str = new String();


    public MessageNotifier(String msg, int repeats) {
        // implement the constructor
        this.str = msg;
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < repeats; i++){
            threads.add(new MessageNotifier(msg,1));
        }
        for (Thread thread:threads){
            thread.start();
        }
    }

    @Override
    public void run() {
        // implement the method to print the message sroted in a field
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();
        int times = scanner.nextInt();
        MessageNotifier messageNotifier = new MessageNotifier(m,times);

    }
}