package abstractfactory;

public class Main {
    public static void main(String[] args) {
        TravelFactory air = new AirTravelFactory();
        air.createTransport().travel("Paris");
        air.createHotel().book("Paris");

        TravelFactory rail = new RailTravelFactory();
        rail.createTransport().travel("Berlin");
        rail.createHotel().book("Berlin");

        TravelFactory bus = new BusTravelFactory();
        bus.createTransport().travel("Astana");
        bus.createHotel().book("Astana");
    }
}
