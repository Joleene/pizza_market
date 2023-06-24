package pl.wszib.pizza_market.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.wszib.pizza_market.services.PizzaService;
import pl.wszib.pizza_market.web.models.PizzaModel;

import java.util.List;

@Controller
public class MenuController {

    private final PizzaService pizzaService;

    public MenuController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("menu")
    public String menuPage(Model model) {
        List<PizzaModel> pizzas = pizzaService.findAll();

        model.addAttribute("pizzas", pizzas);

        return "menuPage";

    }

}
