public class Supermarket {
    private String name;
    private String address;
    private int startingTime;
    private int closingTime;
    private boolean isPaypal;

    public Supermarket(String name, String address) {
        this.name = name;
        this.address = address;
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

    public int getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(int startingTime) {
        this.startingTime = startingTime;
    }

    public int getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }

    public boolean isPaypal() {
        return isPaypal;
    }

    public void setPaypal(boolean paypal) {
        isPaypal = paypal;
    }
}
