package W6_3Coffee;

public abstract class CoffeeMaker {

    public abstract String getName();

    public abstract Integer getBrewingTime();

    public Coffee brew() {
        Coffee coffee = new Coffee(getName(), getBrewingTime());
        return coffee;
    }

}

