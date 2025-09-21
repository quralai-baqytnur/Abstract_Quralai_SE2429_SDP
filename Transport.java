package abstractfactory;

public interface Transport {
    void travel(String destination);
}

class Plane implements Transport {
    public void travel(String destination) {
        System.out.println("Flying to " + destination);
    }
}

class Train implements Transport {
    public void travel(String destination) {
        System.out.println("Going to " + destination + " by train");
    }
}

class Bus implements Transport {
    public void travel(String destination) {
        System.out.println("Traveling to " + destination + " by bus");
    }
}
