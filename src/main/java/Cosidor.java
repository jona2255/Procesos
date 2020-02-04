public class Cosidor implements Runnable {

    Cistell cistell;
    String tipus;

    public Cosidor(Cistell cistella, String tipusa) {
        this.cistell = cistella;
        this.tipus = tipusa;
    }


    @Override
    public void run() {
        for (;;) {
            try {

                cistell.crear(tipus);
                Thread.sleep((long) ((Math.random() * 10) + 10));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
