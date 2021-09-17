import java.util.Scanner;

public class Hotel {
    private String name;
    private String address;
    private int prizeForOneDay;
    private int prizeForOneWee;
    private boolean isDogAllowed;
    private boolean isWifi;
    private boolean isInTheCenter;
    private boolean isPaypal;
    private double rating;
    public double sumRating=0;
    public int ratingCount=0;
    public double avarageRating=0;

    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Hotel(String name, String address, int prizeForOneDay, int prizeForOneWee) {
        this.name = name;
        this.address = address;
        this.prizeForOneDay = prizeForOneDay;
        this.prizeForOneWee = prizeForOneWee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrizeForOneDay() {
        return prizeForOneDay;
    }

    public void setPrizeForOneDay(int prizeForOneDay) {
        this.prizeForOneDay = prizeForOneDay;
    }

    public int getPrizeForOneWee() {
        return prizeForOneWee;
    }

    public void setPrizeForOneWee(int prizeForOneWee) {
        this.prizeForOneWee = prizeForOneWee;
    }

    public boolean isDogAllowed() {
        return isDogAllowed;
    }

    public void setDogAllowed(boolean dogAllowed) {
        isDogAllowed = dogAllowed;
    }

    public boolean isWifi() {
        return isWifi;
    }

    public void setWifi(boolean wifi) {
        isWifi = wifi;
    }

    public boolean isInTheCenter() {
        return isInTheCenter;
    }

    public void setInTheCenter(boolean inTheCenter) {
        isInTheCenter = inTheCenter;
    }

    public boolean isPaypal() {
        return isPaypal;
    }

    public void setPaypal(boolean paypal) {
        isPaypal = paypal;
    }

    public double getRating() {
        return avarageRating;
    }

    public void setRating(double rating) {
        this.rating = rating;
        this.sumRating +=rating;
        this.ratingCount++;
        this.avarageRating= sumRating/this.ratingCount;
    }
}
