package W6_CarEvaluation;

public abstract class Car {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String drive() {
        return getType() + " " + brand;
    }

    protected abstract String getType();

}
