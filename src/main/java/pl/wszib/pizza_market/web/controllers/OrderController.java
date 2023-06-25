package pl.wszib.pizza_market.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.pizza_market.services.OrderService;
import pl.wszib.pizza_market.services.PizzaService;
import pl.wszib.pizza_market.web.models.OpinionsModel;
import pl.wszib.pizza_market.web.models.OrderAddressModel;
import pl.wszib.pizza_market.web.models.PizzaModel;

@Controller
public class OrderController {

    private final PizzaService pizzaService;
    private final OrderService orderService;


    public OrderController(PizzaService pizzaService, OrderService orderService) {
        this.pizzaService = pizzaService;
        this.orderService = orderService;

    }

    @GetMapping("order/{pizza-id}")
    public String orderForm(@PathVariable("pizza-id") Long pizzaId, Model model) {
        PizzaModel pizza = pizzaService.getById(pizzaId);

        model.addAttribute("orderAddress", new OrderAddressModel());
        model.addAttribute("pizza", pizza);
        return "orderPage";

    }

    @PostMapping("order/{pizza-id}")
    public String order(@PathVariable("pizza-id") Long pizzaId,
                        @ModelAttribute("orderAddress") OrderAddressModel orderAddressModel) {
        orderService.saveOrder(pizzaId, orderAddressModel);

        return "orderConfirmationPage";

    }

}
