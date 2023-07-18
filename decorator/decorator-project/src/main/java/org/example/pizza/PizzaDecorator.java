package org.example.pizza;

public abstract class PizzaDecorator implements PedidoPizza {
    private PedidoPizza pizzaDecorator;

    public PizzaDecorator(PedidoPizza pizzaDecorator) {
        this.pizzaDecorator = pizzaDecorator;
    }

    @Override
    public String getDescription() {
        return pizzaDecorator.getDescription();
    }

    @Override
    public double getCost() {
        return pizzaDecorator.getCost();
    }
}
