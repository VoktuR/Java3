public class Main {

    public static void main(String[] args) {
        startThreads();
    }

    public synchronized static void startThreads() {
        LettersManager lettersManager = new LettersManager();
        Thread tA = new Thread(new LetterThreadA(lettersManager));
        Thread tB = new Thread(new LetterThreadB(lettersManager));
        Thread tC = new Thread(new LetterThreadC(lettersManager));
        tA.start();
        tB.start();
        tC.start();

        /*
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ThreadA tA = new ThreadA();
        ThreadB tB = new ThreadB();
        ThreadC tC = new ThreadC();
        executorService.submit(tA);
        executorService.submit(tB);
        executorService.submit(tC);
        executorService.shutdown();

         */
    }
}
