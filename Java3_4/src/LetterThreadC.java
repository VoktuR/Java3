public class LetterThreadC extends LetterThread implements Runnable {

    public LetterThreadC(LettersManager lettersManager) {
        super(lettersManager);
    }

    @Override
    public void run() {
        while (counter > 0) {
            lettersManager.showC();
            counter--;
        }
    }
}
