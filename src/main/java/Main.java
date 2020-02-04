import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {


        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();


        Cistell cistell_manigues = new Cistell(0);
        Cistell cistell_cossos = new Cistell(0);

        Cosidor cosidor_manigues = new Cosidor(cistell_manigues,"Maniga");
        Cosidor cosidor_cossos = new Cosidor(cistell_cossos,"Cos");
        
        Ensamblador ensamblador = new Ensamblador(cistell_manigues,cistell_cossos, "Peça");

            executor.execute(cosidor_manigues);
            executor.execute(cosidor_cossos);
            executor.execute(ensamblador);


    }
}
