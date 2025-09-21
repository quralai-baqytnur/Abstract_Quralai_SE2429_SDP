package abstractfactory;

public interface TravelFactory {
    Transport createTransport();
    Hotel createHotel();
}
