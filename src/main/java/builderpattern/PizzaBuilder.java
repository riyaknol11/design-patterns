package builderpattern;

import java.util.List;

public class PizzaBuilder {
    private int size;
    private String crustType;
    private String sauceType;
    private List<String> toppings;

    public PizzaBuilder(int size) {
        this.size = size;
    }

    public PizzaBuilder crustSelection(String crustType) {
        this.crustType = crustType;
        return this;
    }

    public PizzaBuilder sauceSelection(String sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    public PizzaBuilder toppingsSelection(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, crustType, sauceType, toppings);
    }
}

