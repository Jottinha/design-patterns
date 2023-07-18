package org.example;

import org.example.pizza.PedidoPizza;
import org.example.pizza.Pizza;
import org.example.pizza.extras.ExtraCheeseDecorator;
import org.example.pizza.extras.MushroomDecorator;
import org.example.pizza.extras.PepperoniDecorator;

public class Main {
    public static void main(String[] args) {
        PedidoPizza pizza = new Pizza();

        System.out.println("Descrição: " + pizza.getDescription());
        System.out.println("Custo: R$ " + pizza.getCost());

        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);
        pizza = new MushroomDecorator(pizza);

        System.out.println("Descrição: " + pizza.getDescription());
        System.out.println("Custo: R$ " + pizza.getCost());
    }
}