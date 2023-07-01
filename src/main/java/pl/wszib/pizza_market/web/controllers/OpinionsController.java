package pl.wszib.pizza_market.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.pizza_market.services.OpinionsService;
import pl.wszib.pizza_market.web.models.OpinionsModel;

@Controller
public class OpinionsController {

private final OpinionsService opinionsService;

public OpinionsController (OpinionsService opinionsService) {
    this.opinionsService = opinionsService;

}
    @GetMapping("opinions/{opinion_id}")
    public String addOpinionsForm(Model model) {
    final var opinion = opinionsService.findAll();
    model.addAttribute("opinion", opinion);

        return "opinionsPage";
    }

    @PostMapping("opinions/{opinion_id}")
    public String saveOpinion(@ModelAttribute("opinion_id") OpinionsModel opinionsModel) {


        return "redirect:/opinions";
    }

}
