package ru.geekbrains.hw7d.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.geekbrains.hw7d.models.Opportunities;
import ru.geekbrains.hw7d.services.OpportunitiesService;

@Controller
@AllArgsConstructor
public class OpportunitiesController {

    private final OpportunitiesService opportunitiesService;

    @GetMapping("/opportunity/create")
    public String createOpportunity(Model model) {
        model.addAttribute("activePage", "createOpportunity");
        model.addAttribute("create", true);
        model.addAttribute("opportunity", new Opportunities());
        return "errors/404";
    }

    @GetMapping("/opportunity/{id}/update")
    public String updateOpportunity(Model model, @PathVariable("id") Long id) {
        model.addAttribute("activePage", "updateOpportunity");
        model.addAttribute("update", true);
        model.addAttribute("opportunity", opportunitiesService.findById(id));
        return "errors/404";
    }

    @DeleteMapping("/opportunity/{id}/delete")
    public String deleteOpportunity(Model model, @PathVariable("id") Long id) {
        opportunitiesService.delete(id);
        return "redirect:/errors/404";
    }

    @GetMapping("/opportunity/{id}/show")
    public String showOpportunity(Model model, @PathVariable("id") Long id) {
        model.addAttribute("activePage", "showOpportunity");
        model.addAttribute("show", true);
        model.addAttribute("opportunity", opportunitiesService.findById(id));
        return "errors/404";
    }

}
