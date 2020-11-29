public class LettersManager {

    //set first letter (A, B, C)
    private String letter = "A";

    public synchronized void showA() {
        while (!letter.equals("A")) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(letter);
        letter = "B";
        notifyAll();
    }

    public synchronized void showB() {
        while (!letter.equals("B")) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(letter);
        letter = "C";
        notifyAll();
    }

    public synchronized void showC() {
        while (!letter.equals("C")) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(letter);
        letter = "A";
        notifyAll();
    }

}
