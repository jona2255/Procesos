public class Ensamblador implements Runnable {


    Cistell cistellManigues;
    Cistell cistellCossos;
    String part;

    public Ensamblador(Cistell cistellManigues, Cistell cistellCossos, String peça) {
        this.cistellManigues = cistellManigues;
        this.cistellCossos = cistellCossos;
        part = peça;
    }

    @Override
    public void run() {
        for (;;) {
            try {
                cistellManigues.agafar();
                cistellManigues.agafar();
                Thread.sleep((long) ((Math.random() * 10) + 10));
                cistellCossos.agafar();
                Thread.sleep((long) ((Math.random() * 10) + 10));
                System.out.println("Peça feta : " + part);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
