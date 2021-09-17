import java.util.HashMap;

public class Distant {
    private HashMap<String ,Integer> distanceFromPlace = new HashMap<>();
    private boolean isNight;

    public HashMap<String, Integer> getDistanceFromPlace() {
        return distanceFromPlace;
    }

    public void addDistanceFromPlace(String key, Integer value) {
        this.distanceFromPlace.put(key,value);
    }

    public boolean isNight() {
        return isNight;
    }

    public void setNight(boolean night) {
        isNight = night;
    }
}
