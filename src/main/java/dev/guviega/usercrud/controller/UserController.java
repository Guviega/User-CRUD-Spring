package dev.guviega.usercrud.controller;

import dev.guviega.usercrud.model.User;
import dev.guviega.usercrud.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("users", repository.findByOrderByNameAsc());
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute User user) {
        repository.save(user);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        User user = repository.getReferenceById(id);
        model.addAttribute("user", user);
        return "edit-user";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }

}
