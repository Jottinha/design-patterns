package org.example.pizza.extras;

import org.example.pizza.PedidoPizza;
import org.example.pizza.PizzaDecorator;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(PedidoPizza pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", extra Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.00;
    }
}
