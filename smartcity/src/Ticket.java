public class Ticket {
    private int priceDaily =7;
    private int priceMonthly=100;
    public boolean isStudent;
    private boolean discountSmall;
    public boolean discountBig;

    public int getPriceDaily() {
        if (discountBig){
            return (int) (priceDaily*0.1);
        }else if (discountSmall){
            return (int) (priceDaily *0.4);
        }
        else if (isStudent){
            return (int) (priceDaily *0.7);
        }else {
            return priceDaily;
        }

    }

    public void setPriceDaily(int priceDaily) {
        this.priceDaily = priceDaily;
    }

    public int getPriceMonthly() {
        if (discountBig){
            return (int) (priceMonthly*0.1);
        }else if (discountSmall){
            return (int) (priceMonthly *0.4);
        }
        else if (isStudent){
            return (int) (priceMonthly *0.7);
        }else {
            return priceMonthly;
        }
    }

    public void setPriceMonthly(int priceMonthly) {
        this.priceMonthly = priceMonthly;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        this.isStudent = student;
    }

    public boolean isDiscountSmall() {
        return discountSmall;
    }

    public void setDiscountSmall(boolean discountSmall) {
        this.discountSmall = discountSmall;
    }

    public boolean isDiscountBig(boolean b) {
        return discountBig;
    }

    public void setDiscountBig(boolean discountBig) {
        this.discountBig = discountBig;
    }
}
