package ru.geekbrains.hw7d.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.geekbrains.hw7d.controllers.reprs.AccountRepr;
import ru.geekbrains.hw7d.services.AccountService;

@Controller
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "errors/404";
    }

    @GetMapping("/account/create")
    public String createAccount(Model model) {
        model.addAttribute("activePage", "createAccount");
        model.addAttribute("create", true);
        model.addAttribute("account", new AccountRepr());
        return "errors/404";
    }

    @GetMapping("/account/{id}/update")
    public String updateAccount(Model model, @PathVariable("id") Long id) {
        model.addAttribute("activePage", "updateAccount");
        model.addAttribute("update", true);
        model.addAttribute("account", accountService.findById(id));
        return "errors/404";
    }

    @DeleteMapping("/account/{id}/delete")
    public String deleteAccount(Model model, @PathVariable("id") Long id) {
        accountService.delete(id);
        return "redirect:/errors/404";
    }

    @GetMapping("/account/{id}/show")
    public String showAccount(Model model, @PathVariable("id") Long id) {
        model.addAttribute("activePage", "showAccount");
        model.addAttribute("show", true);
        model.addAttribute("account", accountService.findById(id));
        return "errors/404";
    }

}
