package pl.wszib.pizzamarket.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.wszib.pizzamarket.services.PizzaService;

@Controller
public class OrderController {

    private final PizzaService pizzaService;

    public OrderController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/order/{pizza-id}")
    public String orderForm(@PathVariable(name="pizza-id") Long pizzaId, Model model){
        pizzaService.getById(pizzaId);
    }

}
