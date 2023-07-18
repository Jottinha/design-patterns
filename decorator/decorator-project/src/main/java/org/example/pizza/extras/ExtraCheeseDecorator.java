package org.example.pizza.extras;

import org.example.pizza.PedidoPizza;
import org.example.pizza.PizzaDecorator;

public class ExtraCheeseDecorator extends PizzaDecorator {
    public ExtraCheeseDecorator(PedidoPizza pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", extra cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.50;
    }
}
