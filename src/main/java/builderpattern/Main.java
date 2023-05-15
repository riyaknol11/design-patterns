package builderpattern;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder(10)
                              .crustSelection("Normal")
                              .sauceSelection("Arabiata")
                              .toppingsSelection(Arrays.asList("cheese", "olives", "mushrooms"))
                              .build();
        System.out.println(pizza);
    }







}
