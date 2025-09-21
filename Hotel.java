package abstractfactory;

public interface Hotel {
    void book(String destination);
}

class LuxuryHotel implements Hotel {
    public void book(String destination) {
        System.out.println("Booking 5-star hotel in " + destination);
    }
}

class BudgetHotel implements Hotel {
    public void book(String destination) {
        System.out.println("Booking budget hotel in " + destination);
    }
}