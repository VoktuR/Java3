public class LetterThreadB extends LetterThread implements Runnable {

    public LetterThreadB(LettersManager lettersManager) {
        super(lettersManager);
    }

    @Override
    public void run() {
        while (counter > 0) {
            lettersManager.showB();
            counter--;
        }
    }
}
