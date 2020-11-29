public class LetterThreadA extends LetterThread implements Runnable {

    public LetterThreadA(LettersManager lettersManager) {
        super(lettersManager);
    }

    @Override
    public void run() {
        while (counter > 0) {
            lettersManager.showA();
            counter--;
        }
    }
}
