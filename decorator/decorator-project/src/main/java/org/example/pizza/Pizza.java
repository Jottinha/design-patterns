package org.example.pizza;

public class Pizza implements PedidoPizza{

    @Override
    public String getDescription() {
        return "Pizza comum";
    }

    @Override
    public double getCost() {
        return 10.00;
    }
}
