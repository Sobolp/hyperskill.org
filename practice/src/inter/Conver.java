package inter;

public class Conver {
    public static void voce(Speakable presentor){
        presentor.speak();
    }

    public static void main(String[] args) {
        Duck vasya = new Duck();
        voce(vasya);
        Man kolya = new Man();
        voce(kolya);

    }
}
