package Java8Features.Java8Features;

public class EvenOddPrinter {
    private static final Object lock = new Object();
    private static int number = 0;
    private static final int maxCount = 10;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> printEvenNumbers());
        Thread oddThread = new Thread(() -> printOddNumbers());

        evenThread.start();
        oddThread.start();
    }

    private static void printEvenNumbers() {
        while (number <= maxCount) {
            synchronized (lock) {
                if (number % 2 == 0) {
                    System.out.println("Even Thread: " + number);
                    number++;
                }
            }
        }
    }

    private static void printOddNumbers() {
        while (number <= maxCount) {
            synchronized (lock) {
                if (number % 2 != 0) {
                    System.out.println("Odd Thread: " + number);
                    number++;
                }
            }
        }
    }
}
