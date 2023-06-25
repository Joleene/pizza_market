package pl.wszib.pizza_market.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.pizza_market.services.OpinionsService;
import pl.wszib.pizza_market.web.models.OpinionsModel;

@Controller
public class OpinionsController {

private final OpinionsService opinionsService;

public OpinionsController (OpinionsService opinionsService) {
    this.opinionsService = opinionsService;

}


    @GetMapping("opinions")
    public String addOpinionsForm(Model model) {
        model.addAttribute("opinions", new OpinionsModel("name", "opinion"));

        return "opinionsPage";
    }

    @PostMapping("opinions")
    public String addOpinion(@ModelAttribute("name") OpinionsModel opinionsModel) {
        opinionsService.addOpinion(opinionsModel);

        return "redirect:/opinions";
    }
}
