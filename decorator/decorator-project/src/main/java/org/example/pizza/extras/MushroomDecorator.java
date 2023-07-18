package org.example.pizza.extras;

import org.example.pizza.PedidoPizza;
import org.example.pizza.PizzaDecorator;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(PedidoPizza pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Extra Cogumelo";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.50;
    }
}
