import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class BusTransportation {

    HashMap<String,Integer> busLine1 = new HashMap<>();
    ArrayList<Integer> startingTime = new ArrayList<>();
    LocalDateTime now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();


    public HashMap<String, Integer> getBusLine1() {
        return busLine1;
    }

    public ArrayList<Integer> getStartingTime() {
        return startingTime;
    }

    public void setBusLine1(String key, Integer value) {
        this.busLine1.put(key,value);
    }
    public int nextBusAvailable(){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int time = Integer.parseInt(hour+ ""+minute);

        for (String key : busLine1.keySet()) {
            System.out.println(key);
        }

        Scanner scanner = new Scanner(System.in);
        String  numberOfStation= scanner.next();
        System.out.println(numberOfStation);
        int delay = busLine1.get(numberOfStation);
        System.out.println(delay);

        System.out.println(time);
        for (int counter = 0;counter< startingTime.size();counter++){
           if(startingTime.get(counter)>time+delay){
               return startingTime.get(counter);

           }
       }return 0;

    }
}
