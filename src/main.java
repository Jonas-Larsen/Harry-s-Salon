import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        FrisorBookingSystem bookingSystem = new FrisorBookingSystem();
        Date dato= new Date();


        List<Date> ledigeTider= bookingSystem.findLedigeTider(dato, 30);

        System.out.println("Ledige tider for " + dato);
        for (Date ledigTid : ledigeTider){
            System.out.println(ledigTid);
        }
    }
}
