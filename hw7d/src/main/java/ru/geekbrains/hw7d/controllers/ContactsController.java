package ru.geekbrains.hw7d.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.geekbrains.hw7d.models.Contacts;
import ru.geekbrains.hw7d.services.ContactsService;

@Controller
public class ContactsController {

    private final ContactsService contactsService;

    @Autowired
    public ContactsController(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @GetMapping("/contact/create")
    public String createContact(Model model) {
        model.addAttribute("activePage", "createContact");
        model.addAttribute("create", true);
        model.addAttribute("contact", new Contacts());
        return "errors/404";
    }

    @GetMapping("contact/{id}/update")
    public String updateContact(Model model, @PathVariable("id") Long id) {
        model.addAttribute("activePage", "updateContact");
        model.addAttribute("update", true);
        model.addAttribute("contact", contactsService.findById(id));
        return "errors/404";
    }

    @DeleteMapping("/contact/{id}/delete")
    public String deleteContact(Model model, @PathVariable("id") Long id) {
        contactsService.delete(id);
        return "redirect:/errors/404";
    }

    @GetMapping("/contact/{id}/show")
    public String showContact(Model model, @PathVariable("id") Long id) {
        model.addAttribute("activePage", "showContact");
        model.addAttribute("show", true);
        model.addAttribute("contact", contactsService.findById(id));
        return "errors/404";
    }

}
