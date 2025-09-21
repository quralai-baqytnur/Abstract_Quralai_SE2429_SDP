package abstractfactory;

class AirTravelFactory implements TravelFactory {
    public Transport createTransport() { return new Plane(); }
    public Hotel createHotel() { return new LuxuryHotel(); }
}

class RailTravelFactory implements TravelFactory {
    public Transport createTransport() { return new Train(); }
    public Hotel createHotel() { return new BudgetHotel(); }
}

class BusTravelFactory implements TravelFactory {
    public Transport createTransport() { return new Bus(); }
    public Hotel createHotel() { return new BudgetHotel(); }
}
