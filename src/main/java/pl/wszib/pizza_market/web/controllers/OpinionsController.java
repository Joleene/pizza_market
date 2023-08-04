package pl.wszib.pizza_market.web.controllers;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.wszib.pizza_market.data.repositories.OpinionsRepository;
import pl.wszib.pizza_market.services.OpinionsService;
import pl.wszib.pizza_market.web.models.NewOpinionModel;
import pl.wszib.pizza_market.web.models.OpinionsModel;


@Controller
public class OpinionsController {

    private final OpinionsService opinionsService;

    public OpinionsController(OpinionsService opinionsService) {
        this.opinionsService = opinionsService;

    }

    @GetMapping("opinions")
    public String addOpinionForm(Model model) {
        final var opinion = opinionsService.findAll();
        model.addAttribute("opinions", new NewOpinionModel());
        model.addAttribute("opinion", opinion);

        return "opinionsPage";
    }

    @PostMapping("opinions")
    public String saveOpinions (@ModelAttribute("opinion") OpinionsModel OpinionsModel) {
    opinionsService.saveOpinion(OpinionsModel);
        return "redirect:/opinions";
    }
}
