import java.util.Random;

public class Cistell {

    int parts;
    int maxManiga = 8;
    int maxCos = 4;

    public Cistell(int i) {
        parts = i;
    }

    public synchronized void agafar() {
        try {

            while (parts == 0){
                wait();
            }
            parts--;
            notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void crear(String tipus) {

        if (tipus.equals("Maniga")){
            try {
            while (parts>=maxManiga) wait();

            parts += 1;
                System.out.println(parts + " Peça feta: " + tipus);

                notifyAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (tipus.equals("Cos")){
            try {
                while (parts>=maxCos) wait();

                parts += 1;
                System.out.println(parts + " Peça feta: " + tipus);

                notifyAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
