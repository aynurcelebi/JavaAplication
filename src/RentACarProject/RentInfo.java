package RentACarProject;

public class RentInfo {
    private RentType rentType;
    private int rentDailyPrice;
    private int rentMounthlyPrice;

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public int getRentDailyPrice() {
        return rentDailyPrice;
    }

    public void setRentDailyPrice(int rentDailyPrice) {
        this.rentDailyPrice = rentDailyPrice;
    }

    public int getRentMounthlyPrice() {
        return rentMounthlyPrice;
    }

    public void setRentMounthlyPrice(int rentMounthlyPrice) {
        this.rentMounthlyPrice = rentMounthlyPrice;
    }
}
