import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*Hotel hotel = new Hotel("test","Budapest");
        hotel.setRating(3);
        hotel.setRating(4);
        hotel.setRating(4);
        Ticket ticket = new Ticket();
        ticket.setStudent(true);
        System.out.println(ticket.isStudent);*/

        BusTransportation line1 = new BusTransportation();
        line1.setBusLine1("Uranvaros", 0);
        line1.setBusLine1("Olympia uzlethaz", 2);
        line1.setBusLine1("Mecsek Aruhaz", 3);
        line1.setBusLine1("Kulturalis Kozpont", 5);
        line1.setBusLine1("Tuzer utca", 8);
        line1.setBusLine1("PETAV", 10);

        line1.startingTime.add(437);line1.startingTime.add(457);line1.startingTime.add(517);
        line1.startingTime.add(532);line1.startingTime.add(547);line1.startingTime.add(602);
        line1.startingTime.add(612);line1.startingTime.add(622);line1.startingTime.add(632);
        line1.startingTime.add(640);line1.startingTime.add(650);line1.startingTime.add(710);
        line1.startingTime.add(730);line1.startingTime.add(1030);line1.startingTime.add(1130);
        line1.startingTime.add(1230);line1.startingTime.add(1330);line1.startingTime.add(1330);
        line1.startingTime.add(1430);line1.startingTime.add(1459);line1.startingTime.add(1520);
        line1.startingTime.add(1546);line1.startingTime.add(1601);line1.startingTime.add(1616);
        line1.startingTime.add(1642);line1.startingTime.add(1657);line1.startingTime.add(1722);
        line1.startingTime.add(1747);line1.startingTime.add(1842);line1.startingTime.add(1930);
        line1.startingTime.add(2050);line1.startingTime.add(2130);line1.startingTime.add(2205);
        line1.startingTime.add(2250);line1.startingTime.add(2330);

        System.out.println(line1.getStartingTime());

        System.out.println(line1.nextBusAvailable());




    }
}
