package W5_planet;

public class Earth implements Planet {

    @Override
    public String getName() {
        return "Earth";
    }

    @Override
    public Double weight(Double weight) {
        return weight;
    }
}
